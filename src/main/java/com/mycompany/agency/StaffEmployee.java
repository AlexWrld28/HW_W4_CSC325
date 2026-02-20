package com.mycompany.agency;




public class StaffEmployee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;


    public StaffEmployee(String eName, String eAddress, String ePhone,
                         String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);

        this.socialSecurityNumber = socSecNumber;
        this.payRate = rate;
    }


    public String toString()
    {
        return ("Name:"  + name + "\n"
                + "Address:"  + address + "\n"
                + "Phone Number:"  + phone + "\n"
                + "Social Security Number:"  + socialSecurityNumber+ "\n"
                + "Pay:"  + payRate);
    }


    public double pay()
    {
        return payRate;
    }
}
