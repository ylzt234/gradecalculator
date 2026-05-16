package com.example.gradecalculator;

public class GradeCalculator {
    public String calculateGrade(double marks) {
        if (marks < 0 || marks > 100) {
            return "Invalid Marks";
        } else if (marks >= 85) {
            return "HD";
        } else if (marks >= 75) {
            return "D";
        } else if (marks >= 65) {
            return "C";
        } else if (marks >= 50) {
            return "P";
        } else {
            return "F";
        }
    }
}