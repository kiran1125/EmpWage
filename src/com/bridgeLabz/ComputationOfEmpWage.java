package com.bridgeLabz;
public class ComputationOfEmpWage {
        //Class level variables

        String companyName;
        int numOfWorkingDays,isFullTime,isPartTime,wagePerHour,totalEmpWage;
        //parameterised constructor to initialize
        public ComputationOfEmpWage(String companyName, int numOfWorkingDays, int isFullTime, int isPartTime, int wagePerHour){
            this.companyName = companyName;
            this.numOfWorkingDays = numOfWorkingDays;
            this.isFullTime = isFullTime;
            this.isPartTime = isPartTime;
            this.wagePerHour = wagePerHour;
            totalEmpWage=0;
        }
}
