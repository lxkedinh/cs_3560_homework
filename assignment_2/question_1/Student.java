public class Student {
    private String name;
    private String major;
    private double gpa;

    public Student() {
        this("", "", 0.0);
    }

    public Student(String name, String major) {
        this(name, major, 0.0);
    }

    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "Student " + name + " is a " + major + " major and has a GPA" +
                " of " + gpa + ".";
    }

    public boolean equals(Student student) {
        return name.equals(student.name) && major.equals(student.major);
    }
}
