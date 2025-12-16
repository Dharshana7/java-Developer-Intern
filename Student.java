public class Student {

    private int studentId;
    private String name;
    private int age;
    private char grade;
    private String contact;

    
    public Student(int studentId, String name, int age, char grade, String contact) {
        this.studentId = studentId;
        this.name = name;
        setAge(age);
        setGrade(grade);
        this.contact = contact;
    }

    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 18; 
        }
    }

    
    public void setGrade(char grade) {
        if (grade >= 'A' && grade <= 'F') {
            this.grade = grade;
        } else {
            this.grade = 'C'; 
        }
    }

    
    public void displayStudent() {
        System.out.printf(
            "%-10d %-15s %-5d %-8c %-12s%n",
            studentId, name, age, grade, contact
        );
    }
}
