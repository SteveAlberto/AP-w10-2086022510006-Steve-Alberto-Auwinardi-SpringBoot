package springboot.demo;

public class course {
    private String code;
    private String name;
    private int credits;
    private String grade;

    public course(String code, String name, int credits, String grade) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.grade = grade;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public int getCredits() { return credits; }
    public String getGrade() { return grade; }
}