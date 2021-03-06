import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CourseQuery {
            
public ArrayList<Course> courseDisplay(String ID)
{
    ArrayList<Course> clist = new ArrayList<Course>();
    Connection con = myConnection.getConnection();
    Statement st;
    ResultSet rs;
    try{
        st = con.createStatement();  
        
        if(ID!=null)
            {
                rs = st.executeQuery("SELECT `course_id`, `course_name`, college.college_id \n" +
                                        "FROM `course`, college where course.college_id = college.college_id  "
                                        + "and course.course_id='"+ID+"'");

                Course c;
                while(rs.next()){
                    c = new Course(rs.getString("course_id"), rs.getString("course_name"), rs.getString("college_id"), null);
                    clist.add(c);
                }
            }
   
    } catch(SQLException ex){
        Logger.getLogger(CourseQuery.class.getName()).log(Level.SEVERE, null, ex);
    }
    return clist;
}                           

public ArrayList<Course> courseList(String ID){
    ArrayList<Course> clist = new ArrayList<>();
    Connection con = myConnection.getConnection();
    
    Statement st;
    ResultSet rs;
    
    try{
        st = con.createStatement();        

        if(ID!=null)
        {
            rs = st.executeQuery("SELECT `course_id`, `course_name`, college.college_name as college_name \n" +                    
                                "FROM `course`, college where course.college_id = college.college_id  "
                                + "and course.college_id='"+ID+"' order by college.college_name");
        }
        else
            rs = st.executeQuery("SELECT `course_id`, `course_name`, college.college_name as college_name FROM `course`, college where course.college_id = college.college_id order by college.college_name");
        
        Course c;
        
        while(rs.next()){
            c = new Course(rs.getString("course_id"), rs.getString("course_name"), rs.getString("college_name"), null);
            clist.add(c);
        }
    }catch(SQLException ex){
        Logger.getLogger(CourseQuery.class.getName()).log(Level.SEVERE, null, ex);
    }
    return clist;    
 }     

public void editCourse(Course c, String cid)
{
    Connection con = myConnection.getConnection();
    PreparedStatement ps;
    
    int editchoice = JOptionPane.showConfirmDialog(null, "Finalize and Save Edit?", "EDIT COURSE", JOptionPane.YES_NO_OPTION);
    if (editchoice == JOptionPane.YES_OPTION) {
    
        try{
        ps = con.prepareStatement("UPDATE course SET `course_id` = ?, `course_name` = ?, `college_id` = ? WHERE course_id = '"+cid+"'");
        ps.setString(1, c.getCourse_id());
        ps.setString(2, c.getCourse_name());
        ps.setString(3, c.getCollege_id());

        if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Course "+cid+" Edited Successfully");               
                } 
                else{
                    JOptionPane.showMessageDialog(null, "Something went Wrong");
                }
        }
        catch(SQLException ex) {
            Logger.getLogger(CourseQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else {
        JOptionPane.showMessageDialog(null, "Edit Course Operation Cancelled");
    }
}

public void insertCourse(Course co){
    Connection con = myConnection.getConnection();
    PreparedStatement ps;
    
    int addchoice = JOptionPane.showConfirmDialog(null, "Finalize and Add Course?", "ADD COURSE", JOptionPane.YES_NO_OPTION);
    if (addchoice == JOptionPane.YES_OPTION) {
        try{

            ps = con.prepareStatement("INSERT INTO course (`course_id`, `course_name`, `college_id`) VALUES (?,?,?)");
            ps.setString(1, co.getCourse_id());
            ps.setString(2, co.getCourse_name());
            ps.setString(3, co.getCollege_id());

            if(ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null, "New Course Added Successfully");               
                    } 
                    else{
                        JOptionPane.showMessageDialog(null, "Something went Wrong");

                    }
        }catch(SQLException ex) {
                Logger.getLogger(CourseQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    else {
        JOptionPane.showMessageDialog(null, "Add Course Operation Cancelled");
    }
}

public void deleteCourse(String cid)
{
    Connection con = myConnection.getConnection();
    PreparedStatement ps;
        
    int delcoursechoice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this course?", "DELETE COURSE", JOptionPane.YES_NO_OPTION);
    if(delcoursechoice == JOptionPane.YES_OPTION) {
    
        try {
            ps = con.prepareStatement("DELETE FROM course WHERE `course_id` = ?");
            ps.setString(1, cid);
           
            
            if(ps.executeUpdate() != 0) {
                        JOptionPane.showMessageDialog(null, "Course Deleted");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Something Went Wrong");
                        
                    }
        } catch (SQLException ex) {
            Logger.getLogger(CollegeQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    else {
        JOptionPane.showMessageDialog(null, "Delete Course Operation Cancelled");
    }
}
}
