package com.inheritance;

public class Main {

    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee ("ahmed", "Abdo", "222-22-2222",
                10000, 0.06, 300);


        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is",
                employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is",
                employee.getLastName());

        System.out.printf("%s %s%n", "Social security number is",
                employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales  is",
                employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is",
                employee.getCommissionRate());

        System.out.printf("%s %.2f%n", "Base salary is",
                employee.getBaseSalary());
        employee.setBaseSalary(10000);

        employee.setCommissionRate(.1);
        employee.setGrossSales(5000);
        System.out.printf("%n%s:%n%n%s%n",
                "Update employee information obtained by toString", employee);
    }// end main

}// end class BasTest
