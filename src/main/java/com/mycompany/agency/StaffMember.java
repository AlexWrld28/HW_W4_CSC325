package com.mycompany.agency;

public abstract class StaffMember
{
    protected String name;
    protected String address;
    protected String phone;

    // Constructor
    public StaffMember(String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }


    // Returns employee basic info

    public String toString()
    {
        return "Name: " + name + "\n" +
                "Address: " + address + "\n" +
                "Phone: " + phone;
    }


    // Abstract pay method

    public abstract double pay();
}