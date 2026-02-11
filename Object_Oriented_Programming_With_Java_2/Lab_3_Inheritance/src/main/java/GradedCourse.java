public class GradedCourse extends Course { // inheritance example.
    // A 2D array called studentGrades with dimensions [5][4] to store grades for 5 students across 4 assignments
    private double[][] studentGrades;
    private int creditHours;

    // no-argument constructor
    public GradedCourse() {
        // there is an implicit call to super();
        super();
        this.creditHours = 0;
        this.studentGrades = new double[5][4];
    }

    // Constructor that takes 2D array and an in
    public GradedCourse(double[][] grades, int creditHours) {
        // there is an implicit call to super();
        this("", "", "", grades, creditHours);
        //  this.studentGrades = grades;
        //  make a local copy of the 2D array first allocate space in RAM
        this.studentGrades = Utilities.copy2DArray(grades);
    }

    // Another constructor that takes three strings which are courseName, courseCode, instructor
    public GradedCourse(String courseName, String courseCode, String instructor) {
        super(courseName, courseCode, instructor);
    }

    /**
     * All-argument constructor
    */
    public GradedCourse(String courseName, String courseCode, String instructor, double[][] grades, int creditHours) {
        // make an explicit call the right constructor from the upper class
        super(courseName, courseCode, instructor);
        this.creditHours = creditHours;
        this.studentGrades = Utilities.copy2DArray(grades);
    }

    // Getters
    public int getCreditHours() {
        return this.creditHours;
    }

    public double[][] getStudentGrades() {
        return this.studentGrades;
    }

    // Setters
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setStudentGrades(double[][] grades) {
        // Makes a local copy of the 2D Array.
        this.studentGrades = Utilities.copy2DArray(grades);
    }

    // A method addGrade (studentId, assignmentId, grade) to add a grade to the 2D array
    public void addGrade(int studentId, int assignmentId, double grade) {
        // Do studentId and assignmentID probably from 1 to 5 and 1 to 4.
        this.studentGrades[studentId - 1][assignmentId - 1] = grade;
    }

    // A method getStudentAverage(studentID) that calculates and returns the average grade for a specific student.
    public double getStudentAverage(int studentId) { // recall studentId is between 1 and 5
        // The grades for this student are located in the row = studentId - 1
        // The average is the total of all his grades divided by the number of assignments
        // which is the number of columns.
        int currentRow = studentId - 1; // currentRow should go from 0 to 4.
        double total = 0;
        for (int assignmentId = 0; assignmentId < this.studentGrades[currentRow].length; assignmentId++) {
            total += this.studentGrades[currentRow][assignmentId];
        }
        return total / this.studentGrades[currentRow].length; // number of assignments
    }

    public double getClassAverage() {
        // Compute total of all grades using nested loops.
        double total = 0;
        for (int studentId = 0; studentId < this.studentGrades.length; studentId++) {
            for (int assignmentId = 0; assignmentId < this.studentGrades[studentId].length; assignmentId++) {
                total += this.studentGrades[studentId][assignmentId];
            }
        }
        // To find number of grades = studentGrades number of rows * StudentGrades number of columns
        double average = total / (this.studentGrades.length * this.studentGrades[0].length);
        return average;
    }
}

