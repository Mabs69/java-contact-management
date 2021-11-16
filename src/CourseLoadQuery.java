
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CourseLoadQuery {
    
    public void updateCourseInstructor(String emp_ID, String co_ID)
    {
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        
        int choice = JOptionPane.showConfirmDialog(null, "Confirm Assign?", "ASSIGN", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION) {
        
            String updateQuery = "UPDATE course SET `employee_id` ='"+emp_ID+"' WHERE course_id = '"+co_ID+"'";
            
            try{
                ps = con.prepareStatement(updateQuery);
                if(ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null, "Instructor Assigned on Course "+co_ID);

                    } 
                    else{
                        JOptionPane.showMessageDialog(null, "Something went Wrong");

                    }
            }catch (SQLException ex) {
                Logger.getLogger(CourseLoadQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        else {
            JOptionPane.showMessageDialog(null, "Assign Operation Cancelled");
        }
        
    }
    
    public void deleteCourseInstructor(String emp_ID, String co_ID)
    {
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        
        int delchoice = JOptionPane.showConfirmDialog(null, "Confirm Unassign?", "UNASSIGN", JOptionPane.YES_NO_OPTION);
        if(delchoice == JOptionPane.YES_OPTION) {
            
            String updateQuery = "UPDATE course SET `employee_id` ='"+emp_ID+"' WHERE course_id = '"+co_ID+"'";
            try{
                ps = con.prepareStatement(updateQuery);
                if(ps.executeUpdate() != 0){
                    JOptionPane.showMessageDialog(null, "Instructor Assigned on Course "+co_ID);

                    } 
                    else{
                        JOptionPane.showMessageDialog(null, "Something went Wrong");

                    }
            }catch (SQLException ex) {
                Logger.getLogger(CourseLoadQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Unassign Operation Cancelled");
        }
        
    }
    
    public ArrayList<Course> courseLoadList(String ID)
    {
        ArrayList<Course> clist = new ArrayList<>();
        Connection con = myConnection.getConnection();
    
        Statement st;
        ResultSet rs;
        try{
            st = con.createStatement();  
            // CLA
            if(ID!=null)
            { 
                rs = st.executeQuery("SELECT course.course_id, course.course_name, course.college_id, case WHEN instructor.employee_name is NULL then 'UNASSIGNED' WHEN instructor.employee_name='' then 'UNASSIGNED' else instructor.employee_name END as employee_name FROM course LEFT JOIN instructor on course.employee_id = instructor.employee_id LEFT JOIN college on college.college_id = course.college_id WHERE course.college_id = college.college_id and course.college_id='"+ID+"'");  
            }
            else{
                rs = st.executeQuery("SELECT course.course_id, course.course_name, course.college_id, case WHEN instructor.employee_name is NULL then 'UNASSIGNED' else instructor.employee_name END as employee_name FROM course LEFT JOIN instructor on course.employee_id = instructor.employee_id LEFT JOIN college on college.college_id = course.college_id WHERE course.college_id = college.college_id");
            }
            
            Course c;
            
            while(rs.next())
            {
                c = new Course(rs.getString("course_id"), rs.getString("course_name"), 
                                                rs.getString("college_id"), rs.getString("employee_name"));
                clist.add(c);
            }
       }catch(SQLException ex){
        Logger.getLogger(CourseQuery.class.getName()).log(Level.SEVERE, null, ex);
    }
        return clist;
    }
}
