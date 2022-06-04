package com.inheritance;

public class PolymorphismTest {

    public static void main(String[] args) {

        // assign superclass reference to superclass variable
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "sue", "Jones", "11-111-1111",
                10000, 0.6
        );

        // assign subclass reference to subclass variable
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("mohamed", "mahmoud", "444-44-4444",
                5000, 0.03, 500);


        // invoke toString on superclass object using superclass variable
        System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference ",
                "to superclass object", commissionEmployee.toString());

        // invoke toString on subclass object using subclass variable
        System.out.printf("%s %s: %n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object", basePlusCommissionEmployee.toString());


        // invoke toString on subclass object using superclass variable
        CommissionEmployee commissionEmployee2 =
                basePlusCommissionEmployee;
        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with superclass",
              "reference to subclass object",commissionEmployee2.toString()  );
    }// end main

}// end class BaseTest
