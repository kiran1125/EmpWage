package com.bridgeLabz;
import java.util.Random;
public class EmpWageBuilder {
    public static final int IS_PRESENT=1;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program");
        Random random=new Random();
        int Emp_check = random.nextInt(2);
        if (Emp_check == IS_PRESENT){
            System.out.println("Employee is present");
        }
        else
            System.out.println("Employee is Absent");
    }

}
