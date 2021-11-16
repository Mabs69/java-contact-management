import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CollegeQuery {

    
public void insertCollege(College col)
{
    
    Connection con = myConnection.getConnection();
    PreparedStatement ps;
    
    int insertcollegechoice = JOptionPane.showConfirmDialog(null, "Finalize and Add College?", "ADD COLLEGE", JOptionPane.YES_NO_OPTION);
    if(insertcollegechoice == JOptionPane.YES_OPTION) {
        try {
                ps = con.prepareStatement("INSERT INTO college (`college_id`, `college_name`) VALUES (?,?)");
                ps.setString(1, col.getCollege_id());
                ps.setString(2, col.getCollege_name());


                if(ps.executeUpdate() != 0) {
                            JOptionPane.showMessageDialog(null, "New College Added");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Something Went Wrong");

                        }
            } catch (SQLException ex) {
                Logger.getLogger(CollegeQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    else {
        JOptionPane.showMessageDialog(null, "Insert College Operation Cancelled");
    }
}

public void editCollege(College col, String collegeid)
{
    Connection con = myConnection.getConnection();
    PreparedStatement ps;
    
    int editchoice = JOptionPane.showConfirmDialog(null, "Finalize and Edit College: "+collegeid+"?", "EDIT", JOptionPane.YES_NO_OPTION);
    if (editchoice == JOptionPane.YES_OPTION) {
        try {
                ps = con.prepareStatement("UPDATE college SET `college_id` = ?, `college_name` = ? WHERE college_id = '"+collegeid+"'");
                ps.setString(1, col.getCollege_id());
                ps.setString(2, col.getCollege_name());


                if(ps.executeUpdate() != 0) {
                            JOptionPane.showMessageDialog(null, "College "+collegeid+" has been edited");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Something Went Wrong");

                        }
            } catch (SQLException ex) {
                Logger.getLogger(CollegeQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    else {
        JOptionPane.showMessageDialog(null, "Edit College Operation Cancelled");
    }
}


public void deleteCollege(String cid)
{
    Connection con = myConnection.getConnection();
        PreparedStatement ps;
        
        int delchoice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this college?", "DELETE", JOptionPane.YES_NO_OPTION);
        if (delchoice == JOptionPane.YES_OPTION) {
            
            try {
                ps = con.prepareStatement("DELETE FROM college WHERE `college_id` = ? ");
                ps.setString(1, cid);


                if(ps.executeUpdate() != 0) {
                            JOptionPane.showMessageDialog(null, "College "+cid+" has been deleted");
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Something Went Wrong");

                        }
            } catch (SQLException ex) {
                Logger.getLogger(CollegeQuery.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "There are instructors and/or courses assigned to "+cid+", please remove them first");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Delete College Operation Cancelled");
        }
}

public ArrayList<College> collegeDisplay(String collegeid) {

    ArrayList<College> colDisp = new ArrayList<>();
    
    Connection con = myConnection.getConnection();
    Statement st;
    ResultSet rs;
    
    try{
        st = con.createStatement();
        rs = st.executeQuery("SELECT `college_id`, `college_name` FROM college WHERE college_id='"+collegeid+"'");
        
        College col;
        
        while(rs.next()) {
            col = new College(rs.getString("college_id"), rs.getString("college_name"));
            colDisp.add(col);
        }       
    } catch(Exception ex){
        Logger.getLogger(CollegeQuery.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return colDisp;
}

public ArrayList<College> collegeList(){
    
    ArrayList<College> colList = new ArrayList<>();

    Connection con = myConnection.getConnection();    
    Statement st;
    ResultSet rs;
    try{
        st = con.createStatement();        
        rs = st.executeQuery("SELECT `college_id`, `college_name` FROM college");
        College col;
        while(rs.next())
        {
            col = new College(rs.getString("college_id"), rs.getString("college_name"));
            colList.add(col);
        }
        
    }catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    return colList;
}    
}
