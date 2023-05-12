package com.example.customer_mangement_system;

public class Customer {
    private   int contract_ID;
    private   String name;
    private   String Nationality;
    private   String Phone;
    private   double Current_Bill_Amount;
    private   double Accumulated_Bill_Amount;

    public Customer() {
    }

    public Customer(int contract_ID, String name, String Nationality, String Phone, double Current_Bill_Amount, double Accumulated_Bill_Amount) {
        this.contract_ID = contract_ID;
        this.name = name;
        this.Nationality = Nationality;
        this.Phone = Phone;
        this.Current_Bill_Amount = Current_Bill_Amount;
        this.Accumulated_Bill_Amount = Accumulated_Bill_Amount;
    }

    public int getContract_ID() {
        return contract_ID;
    }

    public void setContract_ID(int contract_ID) {
        this.contract_ID = contract_ID;
        System.out.println("Done");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Done");
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
        System.out.println("Done");
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
        System.out.println("Done");
    }

    public double getCurrent_Bill_Amount() {
        return Current_Bill_Amount;
    }

    public void setCurrent_Bill_Amount(double Current_Bill_Amount) {
        this.Current_Bill_Amount = Current_Bill_Amount;
        System.out.println("Done");
    }

    public double getAccumulated_Bill_Amount() {
        return Accumulated_Bill_Amount;
    }

    public void setAccumulated_Bill_Amount(double Accumulated_Bill_Amount) {
        this.Accumulated_Bill_Amount = Accumulated_Bill_Amount;
        System.out.println("Done");
    }
}
