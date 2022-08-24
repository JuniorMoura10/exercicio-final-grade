package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.score1 = sc.nextDouble();
        student.score2 = sc.nextDouble();
        student.score3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalScore());

        if (student.finalScore() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }else{
            System.out.println("PASS");
        }

        sc.close();
    }
}
