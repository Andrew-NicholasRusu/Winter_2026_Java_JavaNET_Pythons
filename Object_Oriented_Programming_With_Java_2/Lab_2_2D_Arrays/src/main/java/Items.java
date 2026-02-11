// Question # 2:
// Declare a 5 * 5 array named items, write the java code with appropriate loops to
// assign a value to each element of items as follows.
public class Items {
    public static void main (String[] args) {
        int [][] items = new int[5][5]; // 5 * 5 array
        for (int row = 0; row < items.length; row++) {
            for (int column = 0; column < items[row].length; column++){
                if (row==column) {
                    items[row][column] = 0;
                } else if (row > column) {
                    items[row][column] = -10;
                } else { // row < column
                    items[row][column] = 5;
                }
                System.out.printf("%4d", items[row][column]);
            }
            System.out.println();
        }
    }
}
