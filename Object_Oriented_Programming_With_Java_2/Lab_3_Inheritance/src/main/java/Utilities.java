public class Utilities {

    public static double [][] copy2DArray(double[][] grades) {
        //  make a local copy of the 2D array first allocate space in RAM
        double[][] studentGrades = new double[5][4];
        // Copy the elements row by row:
        for (int row = 0; row < grades.length; row++) {
            for (int col = 0; col < grades[row].length; col++) {
                studentGrades[row][col] = grades[row][col];
            }
        }
        return studentGrades;
    }
}