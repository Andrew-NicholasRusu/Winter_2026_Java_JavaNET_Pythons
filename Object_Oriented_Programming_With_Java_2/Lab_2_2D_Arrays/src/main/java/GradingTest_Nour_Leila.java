public class GradingTest_Nour_Leila {
    public static void main(String[] args) {

        // Student Array
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

        //print the array
        System.out.println("Student Answers:");
        for (int student = 0; student < studentAnswers.length; student++) {
            System.out.print("Student " + student + ": ");
            for (int i = 0; i < studentAnswers[student].length; i++) {
                System.out.print(studentAnswers[student][i] + " ");
            }
            System.out.println();
        }


        int numberOfStudents = studentAnswers.length;
        int[] studentScores = new int[numberOfStudents];


        for (int student = 0; student < studentAnswers.length; student++) {

            int score = 0;


            for (int answerIndex = 0;
                 answerIndex < studentAnswers[student].length;
                 answerIndex++) {

                //checks if the students answers match the answer index and increments the score
                if (studentAnswers[student][answerIndex] == key[answerIndex]) {
                    score++;
                }
            }


            studentScores[student] = score;
        }


        for (int student = 0; student < studentScores.length; student++) {
            System.out.printf("Student no: %d  Score = %d%n", student, studentScores[student]
            );
        } //////
        //problem 4
        // define the sudoku array
        int[][] s = {
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
        System.out.println("The given 2D array is a sudoku? " + isSudoku(s));

    }

    public static boolean isSudoku(int[][] s) {
        boolean result = true;
        //create method checkrow
        for (int row = 0; row < s.length; row++) {
            System.out.println("Result of checkRow at row " + row + ":" + checkRow(s[row]));
            if (!checkRow(s[row])) {
                result = false;

                break;
            }

        }
        if (!result) {
            return result;
        }
        // create method checkcol
        //traverse the 2d array by visiting every third row and third colummn
        int[] otherArray = new int[s.length];
        for (int col = 0; col < s.length; col++) {
            for (int i = 0; i < s.length; i++) {
                otherArray[i] = s[i][col];
            }
            //print the other array
            for (int x : otherArray) {
                System.out.print(x +" ");
            }
            if (!checkRowEvenBetter(otherArray)) {
                result = false;
                break;
            }
        }

        // and check every 3 by 3 box
        for (int startRow = 0; startRow < s.length; startRow = startRow + 3) {
            for (int startCol = 0; startCol < s.length; startCol += 3) {
                //top left corner of every box
                //copy the box elements into the other array

                otherArray = copyBoxData(s, startRow, startCol);
                if (!checkRowEvenBetter(otherArray)) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    public static boolean checkRow(int[] row) {
        boolean result = true;
        for (int i = 1; i <= 9; i++) {
            boolean found = false;
            for (int r = 0; r < row.length; r++) {
                found = false;
                if (row[r] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result = false;
                break;
            }
        }

        return result;

    }

    //New version
    public static boolean checkRowLikeAPro(int[] row) {
        boolean result = true;
        // this array helps us to keep track of all digits
        boolean[] digitIsSeen = {false, false, false, false, false, false, false, false, false};
        // go through al elements in the array and record it in the second array
        for (int i = 0; i < row.length; i++) {
            //put a check in this array
            int theDigit = row[i];
            digitIsSeen[theDigit] = true;
        }
        for (int i = 0; i < digitIsSeen.length; i++) {
            if (!digitIsSeen[i]) {
                result = false;
                break;
            }
        }
        return result;
    }


    public static boolean checkRowEvenBetter(int[] row) {
        boolean result = true;
        // this array helps us to keep track of all digits
        boolean[] digitIsSeen = {false, false, false, false, false, false, false, false, false};
        // go through al elements in the array and record it in the second array
        for (int i = 0; i < row.length; i++) {
            //put a check in this array
            int theDigit = row[i];
            if (digitIsSeen[theDigit - 1]) {
                result = false;
                break;
            } else {
                digitIsSeen[theDigit - 1] = true;
            }
        }
        return result;
    }

    public static int[] copyBoxData(int[][] s, int startR, int startC) {
        int[] arr = new int[9];
        int index = 0;
        System.out.println("Copying box that starts at startR=" + startR +" StartC=" +startC);

        for (int r = startR; r <startR+3; r++) {
            for (int c = startC; c < startC+ 3; c++) {
                //copy from 2d array "s" to 1d array"arr"
                System.out.println("copying value at row=" + r + " col=" + c + " value=" + s[r][c]);
                arr[index] = s[r][c];
                index++;
            }
        }

        return arr;
    }


}
