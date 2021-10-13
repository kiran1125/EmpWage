package com.bridgeLabz;
import java.util.Random;
public class EmpWageBuilder {
    public static final int IS_PRESENT=1;
    public static final int IS_ABSENT=0;
    public static final int IS_FULLTIME=8;
    public static final int IS_PART_TIME=4;
    public static final int WAGE_PER_HOUR=20;
    public static int DAILY_WAGE=0;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program");
        Random random=new Random();
        int Emp_check = random.nextInt(3);
        if (Emp_check == IS_PRESENT){
            System.out.println("Employee is present");
            DAILY_WAGE=IS_FULLTIME*WAGE_PER_HOUR;

        }
        else if(Emp_check == IS_ABSENT) {
            System.out.println("Employee is Absent");
        }
        else {
            System.out.println("Employee is part time ");
            DAILY_WAGE=IS_PART_TIME*WAGE_PER_HOUR;
        }
        System.out.println("Daily wage : " +DAILY_WAGE);
    }

}
