package com.mycompany.agency;


public class Intern extends StaffEmployee
{
    public Intern(String eName, String eAddress, String ePhone)
    {
        super(eName, eAddress, ePhone, "000-00-0000", 0.0);
    }

    public double pay()
    {
        return 0.0;
    }
}
