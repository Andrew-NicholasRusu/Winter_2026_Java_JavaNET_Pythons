public class Course {
    // Attributes / Properties
    // courseName (string), courseCode (string), instructor (string)
    private String courseName;
    private String courseCode;
    private String instructor;

    public Course() {
        this.courseName = "";
        this.courseCode = "";
        this.instructor = "";
    }

    public Course (String courseName, String courseCode, String instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    // Getters
    public String getCourseName() {
        return this.courseName;
    }
    public String getCourseCode() {
        return this.courseCode;
    }
    public String getInstructor() {
        return this.instructor;
    }
    // Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public String getCourseInfo() { // A method getCourseInfo() that returns basic course information
        // Course: Intro to Programming (CS101)
        // Instructor: Dr. Smith
        return "Course: " + this.courseName + " (" + this.courseCode + ")\n" +
                "Instructor: " + this.instructor;
    }
}
