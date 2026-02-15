package com.mycompany.agency;




public class Staff extends StaffEmployee
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        staffList[0] = new Executive("Moaath", "111 Oak St", "516-9999", "019828282", 2322.07);
        staffList[1] = new Employee("Prakash", "99 Maple St", "934-221-0567", "036474841", 1246.15);
        staffList[2] = new Employee("Barsha", "51 Brisbane St", "347-575", "322272911", 1169.23);
        staffList[3] = new TempEmployee("Diane", "456 Elm St", "555-4567", "83739331", 10.55);
        staffList[4] = new Hourly("Norm", "567 Maple St", "555-5678", "987654321", 12.75);
        staffList[5] = new Intern("Mike", "678 Birch St", "555-6789");


        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmploee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
