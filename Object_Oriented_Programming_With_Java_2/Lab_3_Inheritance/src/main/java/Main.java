public class Main {
    public static void main (String[] args) {

        System.out.println("Hello and welcome!");
        // Create a GradedCourse object for "Intro to Programming"
        GradedCourse java2 = new GradedCourse("OOP With Java 2", "N22", "Haikel Hichri");
        System.out.println(java2.getCourseInfo());

        // Populate the 2D array with sample grades for at least 3 students.
        double[][] grades = {
                {89, 93, 88, 95},
                {81, 89, 78, 85},
                {55, 70, 80, 73},
                {65, 71, 77, 69},
                {90, 93, 67, 72},
        };
        // Show the overall class average
        java2.setStudentGrades(grades);
        System.out.println("Class Average: " + java2.getClassAverage());
        // Demonstrate calculating individual student average
    }
}
