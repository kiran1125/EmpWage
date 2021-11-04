/**
 * Calculation of Employee Wage for different companies
 * Calculation of employee wage using company name
 *
 * @author - kiran
 *
 */

package com.bridgeLabz;
public class EmpWageBuilder {
    public static void main(String[] args) {
        IEmpWage empWageBuilderArray =new EmpWageBuilderArray();
        empWageBuilderArray.addCompanyDetails("reliance",30,8,4,20);
        empWageBuilderArray.addCompanyDetails("Dmart",30,8,4,30);
        empWageBuilderArray.addCompanyDetails("Bigbazaar",20,8,4,25);
        empWageBuilderArray.computeEmpWage();
        System.out.println("Total Wage of company : " + empWageBuilderArray.getTotalEmpWage("reliance"));
    }
}

