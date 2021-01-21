package com.company.model;

public class Patient {
    private Integer id;
    private String name;
    private String surname;
    private String fathers;
    private String address;
    private long telephone;
    private Integer numberMedicalCard;
    private String diagnos;

    public Patient(Integer id, String name, String surname, String fathers, String address, long telephone, Integer numberMedicalCard, String diagnos) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fathers = fathers;
        this.address = address;
        this.telephone = telephone;
        this.numberMedicalCard = numberMedicalCard;
        this.diagnos = diagnos;
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathers='" + fathers + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", numberMedicalCard=" + numberMedicalCard +
                ", diagnos='" + diagnos + '\'' +
                '}';
    }

    //getters & setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFathers() {
        return fathers;
    }

    public void setFathers(String fathers) {
        this.fathers = fathers;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public Integer getNumberMedicalCard() {
        return numberMedicalCard;
    }

    public void setNumberMedicalCard(Integer numberMedicalCard) {
        this.numberMedicalCard = numberMedicalCard;
    }

    public String getDiagnos() {
        return diagnos;
    }

    public void setDiagnos(String diagnos) {
        this.diagnos = diagnos;
    }
}
