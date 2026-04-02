package com.example;

public class App {

    public String getGrade(int a) {

        if (a < 0 || a > 100) {
            return "Invalid Marks";
        }

        if (a >= 90) {
            return "Grade S";
        } else if (a >= 80) {
            return "Grade A";
        } else if (a >= 70) {
            return "Grade B";
        } else if (a >= 60) {
            return "Grade C";
        } else if (a >= 50) {
            return "Grade D";
        } else if (a >= 40) {
            return "Grade E";
        } else {
            return "Grade F";
        }
    }
}
