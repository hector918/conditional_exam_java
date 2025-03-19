package org.example;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println(checkNumber(10)); // Positive
        System.out.println(checkNumber(-5)); // Negative
        System.out.println(checkNumber(0)); //

        System.out.println(checkAge(20)); // Adult
        System.out.println(checkAge(16)); // Minor
        System.out.println(checkAge(18)); // Adult

        System.out.println(getGrades(95)); // A
        System.out.println(getGrades(82)); // B
        System.out.println(getGrades(45)); // F
    }

    public static String checkNumber(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static String checkAge(int age) {
        return (age >= 18) ? "Adult" : "Minor";
    }

    public static String getGrades(int score) {
        String ret;
        System.out.println(score / 10);
        switch (score / 10) {
            case 10:
            case 9:
                ret = "A";
                break;
            case 8:
                ret = "B";
                break;
            case 7:
                ret = "C";
                break;
            case 6:
                ret = "D";
                break;
            default:
                ret = "F";
        }
        return ret;
    }
}
