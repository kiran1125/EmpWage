package com.bridgeLabz;
import java.util.Random;
public class EmpWageBuilder {
    public static final int IS_PRESENT=1;
    public static final int IS_FULLTIME=8;
    public static final int WAGE_PER_HOUR=20;
    public static int DAILY_WAGE=0;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program");
        Random random=new Random();
        int Emp_check = random.nextInt(2);
        if (Emp_check == IS_PRESENT){
            System.out.println("Employee is present");
            DAILY_WAGE=IS_FULLTIME*WAGE_PER_HOUR;

        }
        else
            System.out.println("Employee is Absent");
        System.out.println("Daily wage : " +DAILY_WAGE);
    }

}
