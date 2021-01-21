package com.company.service.impl;

import com.company.model.Patient;

import java.util.*;

public class PatientImpl {
    private final Scanner scForInt;
    private final Scanner scForString;
    private final Scanner scForLong;

    public PatientImpl() {
        scForInt = new Scanner(System.in);
        scForString = new Scanner(System.in);
        scForLong = new Scanner(System.in);
    }

    public List<Patient> fillArray(List<Patient> list) {
        boolean isStop = true;
        while (isStop) {
            System.out.println("Enter 0 to break. \nEnter 1 to add patient.");
            int action = scForInt.nextInt();
            switch (action) {
                case 0: isStop = false;
                case 1: list.add(createPatient());
                default: System.out.println("Numbers 0-1!");
            }

        }
        return list;
    }

    public List<Patient> outputAllWithDiagnose(List<Patient> list) {
        List<Patient> sortedByDiagnose = new ArrayList<>();
        for (Patient patient : list) {
            if (Objects.isNull(patient.getDiagnos())) continue;
            sortedByDiagnose.add(patient);
        }
        return sortedByDiagnose;
    }

    public List<Patient> inDiapason( List<Patient> list) {
        List<Patient> sorted = new ArrayList<>();
        int min, max;
        System.out.println("Enter min value: ");
        min = scForInt.nextInt();
        System.out.println("Enter max value: ");
        max = scForInt.nextInt();
        for (Patient patient : list) {
            if (patient.getNumberMedicalCard() < min || patient.getNumberMedicalCard() > max) continue;
            sorted.add(patient);
        }
        return sorted;
    }

    public List<Patient> byNumber(List<Patient> list) {
        List<Patient> sorted = new ArrayList<>();
        int counter = 0, number;
        System.out.println("Enter number u want to find: ");
        number = scForInt.nextInt();
        for (Patient patient : list) {
            if (findFirst(patient.getTelephone()) == number) {
                sorted.add(patient);
                counter++;
            }
        }
        System.out.println("Amount of numbers: " + counter);
        return sorted;
    }


    private Patient createPatient() {
        System.out.println("Enter id: ");
        int id = scForInt.nextInt();
        System.out.println("Enter name: ");
        String name = scForString.nextLine();
        System.out.println("Enter surname: ");
        String surname = scForString.nextLine();
        System.out.println("Enter fathers name: ");
        String fathers = scForString.nextLine();
        System.out.println("Enter address: ");
        String address = scForString.nextLine();
        System.out.println("Enter number: ");
        long number = scForLong.nextLong();
        System.out.println("Enter medical number: ");
        int medicalNum = scForInt.nextInt();
        System.out.println("Enter diagnose: ");
        String diagnose = scForString.nextLine();
        return new Patient(id, name, surname, fathers, address, number, medicalNum, diagnose);
    }

    private long findFirst(long n) {
        while (n >= 10)
            n /= 10;
        return n;
    }
}
