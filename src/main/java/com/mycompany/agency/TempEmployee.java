package com.mycompany.agency;



    // TODO 1: Make TempEmploee a child of StaffEmploee

public class TempEmployee extends StaffEmployee

{
    private int hoursWorked;

    public TempEmployee(String eName, String eAddress, String ePhone,
                        String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }

    public void addHours(int moreHours)
    {
        hoursWorked += moreHours;
    }

    public double pay()
    {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    public String toString()
    {
        return super.toString() +
                "\nHours Worked: " + hoursWorked;
    }
}