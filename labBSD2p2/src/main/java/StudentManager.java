import java.util.HashMap;
public class StudentManager {
    private HashMap<String,Student>students;
    public StudentManager(){
        
    }
    public void addStudent(Student student){
        students.put(student.getStudentID(),student);
    }
    public void removeStudent(String studentID){
    students.remove(studentID);
    }
    public void displayAllStudent(){
        for(Student student : students.values()){
            System.out.println("ID: " +student.getStudentID() + "Student name : " +student.getStudentName());
        }
    }
    public Student getStudent(String studentID){
        return students.get(studentID);
    } 
    public boolean isStudentExist(String studentID){
        return students.containsKey(studentID);
    }
}
