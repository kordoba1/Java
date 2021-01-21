package com.company;

import com.company.model.Patient;
import com.company.service.impl.PatientImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PatientImpl service = new PatientImpl();
    List<Patient> list = new ArrayList<>();

    while (true) {
        System.out.println(
                    "Enter 1 to fill array.\n" +
                    "Enter 2 to output all with diagnose.\n" +
                    "Enter 3 to output in Diapason patients.\n" +
                    "Enter 4 to output all with first number.\n" +
                    "Enter 0 to exit.\n  ->\n");
        int action = sc.nextInt();
        switch (action) {
            case 1: service.fillArray(list).forEach(System.out::println);
            case 2: service.outputAllWithDiagnose(list).forEach(System.out::println);
            case 3: service.inDiapason(list).forEach(System.out::println);
            case 4: service.byNumber(list).forEach(System.out::println);
            case 0: System.exit(0);
            default: System.out.println("Wrong number");
        }
    }
}
}
