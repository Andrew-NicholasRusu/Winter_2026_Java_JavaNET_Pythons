// Question #3:
// Write a program that grades multiple-choice test. The student array contains the student's answer.

public class GradingTest {
    public static void main(String[] args) {
        char[][] answers = { // char is used to store characters, it is not a string, it is a single character. It is used to store the answers of the students.
            // 2D array example
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

        // Print all student answers.
        System.out.println();
        for (int student = 0; student < answers.length; student++) {
            System.out.print("Student number: " + student + " |");
            for (int scoreIndex = 0; scoreIndex < answers[student].length; scoreIndex++) {
                System.out.printf("%3s", answers[student][scoreIndex]); 
                // answers[student][scoreIndex] is the answer of the student at index "student" for the question at index "scoreIndex".
                // %3s means that I want to print a string with a width of 3 characters. It will help me align the answers in a nice way.
            }
            System.out.println();
        }

        // Compute the grade for every student.
        System.out.println();
        int numberOfStudents = answers.length; // it is answers.length because answers is a 2D array, answers.length gives us the number of rows, which is the number of students.
        int[] studentScores = new int[numberOfStudents]; // new array to store the scores of the students, it has the same length as the number of students, 
        // so that we can store the score of each student in the right index.
        int score;
        for (int student = 0; student < answers.length; student++) {
            // Go through all student answers and compare them to key answers.
            score = 0; // added this line to reset the score for each student, otherwise, it will keep adding up the scores of all students.
            for (int answerIndex = 0; answerIndex < key.length; answerIndex++) { 
                // column index is the same as the index of the key, because the key has the correct answers for each question, 
                // and the student's answer is at the same index as the question in the key. So we can use the same index to compare the student's answer to the key's answer.

                // Compare answer to key
                if (answers[student][answerIndex] == key[answerIndex]) { // if the student's answer is the same as the key's answer, then we can give them a point.
                    score++;
                }
            }
            // Store the found score in the right location inside the studentScores array
            studentScores[student] = score;
        }
        for (int student = 0; student < answers.length; student++) {
            System.out.println("Student " + student + "'s mark is " + studentScores[student]);
        }


        // Question #4:
        // Write a static method named isSudoku to check if a 2D array is a sudoku:
        // The rules to check:
        //- Every row contains the numbers 1 to 9
        //- Every column contains the numbers 1 to 9
        //- Every 3×3 box contains the numbers 1 to 9
        System.out.println();
        int[][] sudoku = {
                // 2D array example
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
        System.out.println("The given 2D array is a sudoku? " + isSudoku(sudoku));
    }

    public static boolean isSudoku(int[][] s) {
        boolean result = true;
        // Pseudo code, go through all the rows and for each row, check hat it has all the digits
        // (call another method checkRow())
        for (int row = 0; row < s.length; row++) {
            // Recall that s[row] is a 2D array that represents the whole row.
            System.out.println("Result of checkRow at row " + row + " : " + checkRow(s[row]));
            if (!checkRow(s[row])) { // if the row does not have all the digits, then it is not a sudoku, we can stop checking and return false.
                result = false;
                break;
            }
        }
        if (!result) // if the result is true, then we can stop checking and return false, otherwise, we can continue checking the columns and the boxes.
            return result;

        // Go through all the columns and for each column, copy the column into another 1D array,
        // check that the 1D array has all the digits (call another method checkRow())
        int[] otherArray = new int[s.length];
        for (int col = 0; col < s.length; col++) {
            // Copy the data from that column to another array.
            for (int i = 0; i < s.length; i++) {
                otherArray[i] = s[i][col]; // Copying example
            }
            if (!checkRowEvenBetter(otherArray)) {
                result = false;
                break;
            }
        }
        // traverse the 2D array by visiting every third row and every third column and for every
        // such anchor position call a method (checkBox()) to check the 3x3 box starting from the anchor position.
        for (int startRow = 0; startRow < s.length; startRow = startRow + 3) {
            for (int startCol = 0; startCol < s[startRow].length; startCol += 3) {
                // I am in the top-left corner of every box. Copy the box elements into the other array.
                // Mark sure to pass the starting position of the box, otherwise, it will always
                // be copying the same box starting at 0,0.
                otherArray = copyBoxData(s, startRow, startCol);
                // Print contents of otherArray
                for (int x: otherArray) {
                    System.out.println(x + " ");
                }
                if(!checkRowEvenBetter(otherArray)){ // if the box does not have all the digits, then it is not a sudoku, we can stop checking and return false.
                    result = false;
                    break;
                }
            }
            if (!result) // if the result is true, then we can stop checking and return false, otherwise, we can continue checking the next box.
                break;
        }
        return result;
    }

    public static int[] copyBoxData(int[][] s, int startRow, int startCol) { // this method will copy the data of the box starting at startRow and startCol into a 1D array and return it.
        // int[][] s is the 2D array that represents the sudoku, startRow and startCol are the starting position of the box that we want to copy.
        int[] boxArray = new int[9];
        int index = 0;
        System.out.println("Copying box that starts at startRow = " + startRow + " startColumn = " + startCol);
        for(int row = startRow; row < startRow+3; row++) {
            for(int col = startCol; col < startCol+3; col++) { // we want to copy the 3x3 box, so we need to go through 3 rows and 3 columns starting from the anchor position (startRow, startCol)
                // Copy from 2D array "s" to 1D "boxArray"
                System.out.println("Copying value at row = " + row + " column = " + col + " value = " + s[row][col]); 
                // s[row][col] is the value at the current position in the 2D array, we want to copy it to the boxArray at the current index.
                boxArray[index] = s[row][col]; 
                // Copying example, we are copying the value at s[row][col] to boxArray at index "index", then we will increment the index to copy the next value to the next position in the boxArray.
                index++;
            }
        }
        return boxArray;
    }

    public static boolean checkRow(int[] row) { // boolean array version, the maradona version is below.
        boolean result = true;
        for (int i = 1; i <= 9; i++) {
            // Check if it exists in the row. (search for i in the row to see if it exists.)
            boolean found = false; // found is a flag that will help us keep track of whether we found the digit i in the row or not.
            for (int r = 0; r < row.length; r++) {
                if (row[r] == i) {
                    found = true;
                    break;
                }
            } // End of search loop
            // if the digit i is not found, that is it. It is NOT a sudoku.
            if (!found) {
                result = false;
                break;
            }
        } // End of loop to check all digits
        return result;
    }

    // Another version, the maradona version.
    public static boolean checkRowLikeAPro(int[] row) {
        boolean result = true;
        // This array will help us keep track of all the digits and whether they have been seen or not.
        boolean[] digitIsSeen = {false, false, false, false, false, false, false, false, false,};
        // Go through all the elements in the array and record it in the digitIsSeen array.
        for (int i = 0; i < row.length; i++) {
            // Put a check in digitIsSeen
            int theDigit = row[i]; // row[i] is the current element in the row, it is a digit between 1 and 9, we will use it as an index to mark it in the digitIsSeen array.
            digitIsSeen[theDigit] = true;
        }
        // Go through the digitIsSeen array and make sure that all elements are true
        for (int i = 0; i < digitIsSeen.length; i++) {
            if (!digitIsSeen[i]) { // if the digit i is not seen, that is it. It is NOT a sudoku.
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean checkRowEvenBetter(int[] row) {
        boolean result = true;
        // This array will help us keep track of all the digits and whether they have been seen or not.
        boolean[] digitIsSeen = {false, false, false, false, false, false, false, false, false,}; 
        // we have 9 digits, but we want to use the digit as an index, so we need to have an array of size 10, 
        // and we will ignore the index 0, and use the index 1 to mark the digit 1, index 2 to mark the digit 2, and so on.


        // Go through all the elements in the array and record it in the digitIsSeen array.
        for (int i = 0; i < row.length; i++) {
            // Put a check in digitIsSeen
            int theDigit = row[i];
            if (digitIsSeen[theDigit - 1]) {
                result = false;
                break;
            } else {
                digitIsSeen[theDigit - 1] = true; 
                // we need to mark the digit as seen, but we need to use the index theDigit - 1, because the digit 1 is at index 0, digit 2 is at index 1, and so on.
            }
        }
        return result;
    }
}
