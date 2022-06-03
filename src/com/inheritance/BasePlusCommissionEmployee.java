package com.inheritance;

public class BasePlusCommissionEmployee  {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    private double baseSalary;
    // five-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate,double baseSalary) {
        // implicit call to Object's default constructor
        // if gross Sales is invalid throw exception
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        }
        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1) {
            throw new IllegalArgumentException("Commission rate must to be > 0.0 and < 1.0");
        }
        if (baseSalary <0.0){
            throw new IllegalArgumentException("base salary must to be >= 0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary =baseSalary;

    } // end constructor

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {

        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        // if commissionRate is invalid throw exception
        if (commissionRate <= 0.0 || commissionRate >= 1) {
            throw new IllegalArgumentException("Commission rate must to be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary <0.0){
            throw new IllegalArgumentException("base salary must to be >= 0");
        }
        this.baseSalary = baseSalary;
    }

    // calculate earnings
    public double earnings() {
        return baseSalary + (commissionRate * grossSales);
    }

    //return String representation of CommissionEmployee object
    @Override // indicates that method overrides a superclass method
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s:  %.2f%n%s: %.2f",
                "commission employee", firstName, lastName, "social security number",
                socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate,"base salary ",baseSalary);
    }
} // end class baseCommissionEmployee

