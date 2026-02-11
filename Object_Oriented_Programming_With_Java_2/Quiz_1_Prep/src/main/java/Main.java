public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        // the x and y for each point
        double[] x = {-1, -1, 1, 2, 2, 3, 4, 4}; // array example
        double[] y = {3, -1, 1, 0.5, -1, 3, 2, -0.5};

        // Create the 2D array to hole the distances from all points to all other points
        // 2D array EXAMPLE PLEASE REMEMBER FOR QUIZ PLSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS
        double[][] distances = new double[x.length][y.length]; // length = number of points

        // go through all the points in the rows one by one
        for (int row = 0; row < x.length; row++) {
            // go through all the points in the columns and compute the distance between them and sttore in the array
            for (int col = 0; col < y.length; col++) {
                double dx = x[row] - x[col]; // Math equation that computes the distance between two points in 2D space
                // How to remember? 
                // distance = sqrt((x2-x1)^2 + (y2-y1)^2)
                double  dy = y[row] - y[col];
                double d = Math.sqrt(dx * dx + dy*dy); // Math equation
                // Store it in the 2D array.
                distances[row][col] = d;
            }
        }
        // Print the content of the 2D ARRAY
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < y.length; col++) { // print the distance with 1 decimal place
                System.out.printf("%4.1f", distances[row][col]); // prints the distance with 1 decimal place
                // distances[row][col] does not print the distance with 1 decimal place, it prints the distance with many decimal places, so we use printf to format it to 1 decimal place
            } // End of row
            System.out.println();
        }
        // find minimum distance
        double min = distances[0][1];
        double rowOfMin = 0,  colOfMin = 1;
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < y.length; col++) {
                if (row!=col && distances[row][col] < min) { 
                    // if the distance is less than the current minimum and we are not comparing the same point (row != col)
                    min = distances[row][col]; // min is updated to the new minimum distance
                    rowOfMin = row;
                    colOfMin = col;
                }
            } // end of row
        }
        System.out.println("Minimum distance is: " + min +
                " located in row = " + rowOfMin + " col = " + colOfMin);


    }
}
