public class GradingTest_Youcef_Review {
    static void main() {
        System.out.printf("lab02 2D arrays!");

        char[][] studentAnswers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}

        };
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        //compute the grade for every student

        for (int student = 0; student < studentAnswers.length; student++) {
            System.out.print("student no: " + student);
            for (int scoreIndex = 0; scoreIndex < studentAnswers[student].length; scoreIndex++) {
                System.out.printf(" %3s", studentAnswers[student][scoreIndex]);
            }
            System.out.println(" ");
        }

        // compute the grade for every student
        int numberOfStudent = studentAnswers.length;
        int[] studentScore = new int[numberOfStudent];
        int score = 0;

        for (int student = 0; student < studentAnswers.length; student++) {
            score = 0;

            // go throught all the students answer and compre them to kwy answers
            for (int answerIndex = 0; answerIndex < studentAnswers[student].length; answerIndex++) {
                //compare answer to kwy

                if (studentAnswers[student][answerIndex] == key[answerIndex]) {
                    score++;

                }

            }

            studentScore[student] = score;

        }

        for (int student = 0; student < studentAnswers.length; student++) {

            System.out.printf("student no: %4d Score = %4d \n", student, studentScore[student]);
        }

//          sudoku problem
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9},
        };
        System.out.println(" the give 2d array is a sudoku?"+ isSudoku(sudoku));

    }

    public static boolean isSudoku(int[][] s) {

        boolean result = true;

        //pseudocode
        //go through all the rows and
        //for each row check that it has all the digits
        for (int row = 0; row < s.length; row++) {
            //recall that s[row] is a 1D array that represents the whole row
            System.out.println(" result of checkRow at row" + row + " : " + checkRow(s[row]));
            if (!checkRow(s[row])) {
                result = false;
                break;
            }
        }
        if (!result)


            return result;
//declare the other array
        int[] otherArray = new int[s.length];
        for (int col = 0; col < s.length; col++) {
            // copy the date from that column to another array
            for (int i = 0; i < s.length; i++) {
                otherArray[i] = s[i][col];
            }
            if (!checkRowColEvenBetter(otherArray)) {
                result = false;
                break;
            }
        }
        for (int row = 0; row < s.length; row = row + 3) {
            for (int col = 0; col < s[row].length; col = col + 3) {
                // top left corner of every box
                // copy the box elemts into the other array
                otherArray[row]= s[row][col];
            }

        }
        for (int row=0; row<9; row=row+3){
            for (int col=0; col<9; col=col+3){
                int [] box= copyBoxData(s, row, col);
                if (!checkRowColEvenBetter(box)){
                    return false;
                }
            }

        }

        return result;
    }
    public static int[] copyBoxData( int [][] s, int startRow, int startCol){
        int box[] = new int[9];
        int index = 0;

        // loop over 3 rows and 3 columns starting from startRow ans starCol

        for (int r = startRow; r< startRow+3; r++){
            for (int c = startCol; c<startCol+3; c++){
                box[index]=s[r][c];
                index++;
            }
        }
        return box;
    }

    public static boolean checkRow(int[] row){
        boolean result = true;
        for (int i=1; i<=9; i++){
            // check if it exists in the row
            // search for i in the row to see if it exists
            boolean found = false;
            for (int r=0; r<row.length; r++){
                if (row [r]==i){
                    found= true;
                    break;
                }
            }// end of search loop
            // nif the digit iI is not fund that is it, it is not a sudoku
            if (!found){
                result = false;
                break;
            }
        }//end of loop to check all digits
        return result;
    }
// anohter verson

    public static boolean checkRowColEvenBetter(int[] row){
        boolean result = true;
        // this array will help us keep track of all didgits and whetehr they have been see or not
        boolean[] digitIsSeen= {false, false, false, false, false, false, false, false, false };
        //go throught all the elemmts in the array and record it in the digitsSeen array
        for (int i=0; i<row.length; i++){
            // put a check in digitIsSeen
            int theDigit= row[i];
            // validate that theDigit is in the right range
            if (theDigit<1 || theDigit >9 ){
                result = false;
                break;
            }

            if (digitIsSeen[theDigit-1]){
                result=false;
                break;
            }else {
                digitIsSeen[theDigit-1]=true;
            }

        }

        return result;
    }

}

