public class Student extends UniversityMember {

    private String studentName;
    private int year;
    public Student (String memberId, String department, String studentName, int year) {
        super (memberId, department);
        this.studentName = studentName;
        this.year = year;
    }
    public void displayStudentDetails() {
        System.out.println("Name: " + studentName + ", Year: " + year);
    }
}
