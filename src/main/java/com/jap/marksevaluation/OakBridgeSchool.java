package com.jap.marksevaluation;

public class OakBridgeSchool {
    public static void main(String[] args) {
        // Declare and Initialize the object of OakBridgeSchool
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Declare and Initialize values to the arrays to store marks of math, science, english
        int[] math = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int[] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int[] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
        // Initialize a string array for storing student names
        int noOfSubjects = 3;
        String[] studentName = {"Michelle", "Katie", "Rob", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo"};
        // Declare and Initialize an int array for storing roll numbers
        int[] rollNos = {102, 109, 101, 103, 104, 108, 110, 105, 106, 107};
        //Calculate Grade
        char mathGrade = oakBridgeSchool.findGradeInMath(math[0]);
        char scienceGrade = oakBridgeSchool.findGradeInScience(science[0]);
        char englishGrade = oakBridgeSchool.findGradeInEnglish(english[0]);
        // Call the appropriate methods and display the results
        int[] totalMarks = oakBridgeSchool.calculateTotalMarks(math, science, english);
        int[] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks, noOfSubjects);
        oakBridgeSchool.displayDetails(totalMarks[0], averageMarks[0], mathGrade, scienceGrade, englishGrade, studentName[0], rollNos[0]);
    }

    /**
     * It takes in three arrays of integers, and returns an array of integers
     *
     * @param math    An array of integers representing the marks scored in Maths.
     * @param science an array of integers representing the marks in science
     * @param social  an array of integers representing the marks in social studies
     * @return An array of integers.
     */
    public int[] calculateTotalMarks(int[] math, int[] science, int[] social) {
        int[] totalMarks = new int[math.length];
        if (math.length == 0 || science.length == 0 || social.length == 0) {
            return null;
        } else {
            for (int index = 0; index < math.length; index++) {
                totalMarks[index] = totalMarks[index] + math[index] + science[index] + social[index];
            }
        }
        return totalMarks;
    }

    /**
     * It takes an array of total marks for each student and the number of subjects and returns an array of average marks
     * for each student
     *
     * @param totalMarks   An array of integers containing the total marks of each student.
     * @param noOfSubjects The number of subjects for which the student has given the exam.
     * @return An array of integers.
     */
    public int[] calculateTotalAverageMarksForEachStudent(int[] totalMarks, int noOfSubjects) {
        int[] averageMarks = new int[totalMarks.length];
        if (totalMarks.length == 0 || noOfSubjects <= 0) {
            return null;
        } else {
            for (int index = 0; index < totalMarks.length; index++) {
                averageMarks[index] += totalMarks[index] / noOfSubjects;
            }
        }
        return averageMarks;
    }
    // Write the logic inside the method to calculate the grade based on the math mark of the student

    /**
     * If the math score is greater than or equal to 90, return 'A', else if the math score is greater than or equal to 80,
     * return 'B', else if the math score is greater than or equal to 70, return 'C', else if the math score is greater
     * than or equal to 60, return 'D', else return 'F'.
     *
     * @param math The student's grade in math.
     * @return The grade of the student in math.
     */
    public char findGradeInMath(int math) {
        if (math >= 90) {
            return 'A';
        } else if (math >= 80) {
            return 'B';
        } else if (math >= 70) {
            return 'C';
        } else if (math >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    // Write the logic inside the method to calculate the grade based on the science mark of the student

    /**
     * If the science score is 90 or above, return an 'A', otherwise if the science score is 80 or above, return a 'B',
     * otherwise if the science score is 70 or above, return a 'C', otherwise if the science score is 60 or above, return a
     * 'D', otherwise return an 'F'.
     *
     * @param science the student's score in science
     * @return The grade of the student in science.
     */
    public char findGradeInScience(int science) {
        if (science >= 90) {
            return 'A';
        } else if (science >= 80) {
            return 'B';
        } else if (science >= 70) {
            return 'C';
        } else if (science >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    // Write the logic inside the method to calculate the grade based on the english mark of the student

    /**
     * If the student's score is 90 or above, return 'A', otherwise if the student's score is 80 or above, return 'B',
     * otherwise if the student's score is 70 or above, return 'C', otherwise if the student's score is 60 or above, return
     * 'D', otherwise return 'F'.
     *
     * @param english the student's grade in English
     * @return The grade in English.
     */
    public char findGradeInEnglish(int english) {
        if (english >= 90) {
            return 'A';
        } else if (english >= 80) {
            return 'B';
        } else if (english >= 70) {
            return 'C';
        } else if (english >= 60) {
            return 'D';
        } else {
            return 'F';
        }

    }
// Write the logic to sort the total marks of the students of the class, use insertion-sort

    /**
     * The function takes an array of integers as input and returns the same array sorted in ascending order
     *
     * @param totalMarks An array of integers that represent the total marks of each student.
     * @return The total marks of the students are being returned.
     */
    public int[] sortByTotalMarks(int[] totalMarks) {
        for (int index = 0; index < totalMarks.length; index++) {
            int temp = totalMarks[index];
            int j = index - 1;
            while (j >= 0 && totalMarks[j] > temp) {
                totalMarks[j + 1] = totalMarks[j];
                j = j - 1;
            }
            totalMarks[j + 1] = temp;
        }
        return totalMarks;
    }
    //Display the details of the student

    /**
     * This function displays the details of the student
     *
     * @param totalMark    The total marks of the student
     * @param averageMark  The average mark of the student
     * @param mathGrade    The grade in Math
     * @param scienceGrade The grade in science
     * @param englishGrade The grade in English
     * @param studentName  The name of the student
     * @param rollNo       The roll number of the student
     */
    public void displayDetails(int totalMark, int averageMark, char mathGrade, char scienceGrade, char englishGrade, String studentName, int rollNo) {
        System.out.println("\nGrading And Evaluation\n");
        // System.out.println("------------------------------------------------------------------");
        System.out.println("Student Name                           Roll Number ");
        System.out.println(studentName + "                          " + rollNo);
        // System.out.println("-------------------------------------------------------------------");
        System.out.println("The Total Marks  - " + totalMark + "/300");
        System.out.println("The Average Marks - " + averageMark);
        //System.out.println("-------------------------------------------------------------------");
        System.out.println("Grade in Math   : " + mathGrade);
        System.out.println("Grade in Science   : " + scienceGrade);
        System.out.println("Grade in English   : " + englishGrade);

    }
}
