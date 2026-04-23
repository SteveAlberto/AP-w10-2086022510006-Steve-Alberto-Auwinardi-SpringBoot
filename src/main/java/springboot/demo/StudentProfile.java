package springboot.demo;
import java.util.List;

public class StudentProfile {
    private String name;
    private String initials;
    private String studentId;
    private String major;
    private String university;
    private int semester;
    private double gpa;
    private String email;
    private List<String> hobbies;
    private List<course> courses;

    public StudentProfile(String name, String initials, String studentId, String major, 
        String university, int semester, double gpa, String email, 
        List<String> hobbies, List<course> courses) {
        this.name = name;
        this.initials = initials;
        this.studentId = studentId;
        this.major = major;
        this.university = university;
        this.semester = semester;
        this.gpa = gpa;
        this.email = email;
        this.hobbies = hobbies;
        this.courses = courses;
    }

    public String getName() { return name; }
    public String getInitials() { return initials; }
    public String getStudentId() { return studentId; }
    public String getMajor() { return major; }
    public String getUniversity() { return university; }
    public int getSemester() { return semester; }
    public double getGpa() { return gpa; }
    public String getEmail() { return email; }
    public List<String> getHobbies() { return hobbies; }
    public List<course> getCourses() { return courses; }
    
    public int getTotalCourses() { return courses.size(); }
}