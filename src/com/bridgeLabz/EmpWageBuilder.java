package com.bridgeLabz;
import java.util.Random;
public class EmpWageBuilder {
    public static void main(String[] args) {
        Attendance attendance1 = new Attendance();
        Attendance attendance2 = new Attendance();
        attendance1.EmployeeCheck("Reliance",30,8,4,30);
        attendance2.EmployeeCheck("Lg",20,7,4,25);
    }
}
class Attendance{
    static final int IS_PRESENT = 1;
    static final int IS_ABSENT = 0;
    int dailyWage = 0;
    int monthlyWage = 0;
    int totalHours =0;
    int hours = 0;

    int GetEmployeePresent(int a) {
        Random r = new Random();
        int empCheck = r.nextInt(a);
        return empCheck;
    }
    void EmployeeCheck(String name,int wagePerHour,int isFullTime,int isPartTime,int numOfWorkingDays) {
        for (int i = 0; i<= numOfWorkingDays && totalHours<=100; i++){
            int empCheck = GetEmployeePresent(3);
            switch (empCheck) {
                case IS_PRESENT: {
                    //System.out.println("Employee is present");
                    dailyWage = wagePerHour * isFullTime;
                    hours += isFullTime;
                    break;

                }
                case IS_ABSENT: {
                    //System.out.println("Employee is Absent");
                    dailyWage = dailyWage;
                    break;
                }
                default: {
                    //System.out.println("Employee is Part time");
                    dailyWage = wagePerHour * isPartTime;
                    hours += isPartTime;
                    break;
                }
            }
        }
        monthlyWage = numOfWorkingDays * dailyWage;
        totalHours = hours;
        System.out.println("Monthly salary : " +monthlyWage + " Total Hours : " +hours);
    }

}
