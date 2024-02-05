import java.util.*;

public class BlockSection{
    private String blockCode;
    private String adviser;
    private List<Student> studentList;

    //setter methods

    public void setBlockCode(String blockCode){
        this.blockCode = blockCode;
    }

    public void setAdviser(String adviser){
        this.adviser = adviser;
    }

    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }

    //getter methods

    public String getBlockCode(){
        return blockCode;
    }

    public String getAdviser(){
        return adviser;
    }
    
    public List<Student> getStudentList(){
        return studentList;
    }
}