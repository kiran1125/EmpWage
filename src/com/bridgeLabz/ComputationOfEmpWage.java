package com.bridgeLabz;

import java.util.Random;

public class ComputationOfEmpWage {
        //variables

        String companyName;
        int numOfWorkingDays,isFullTime,isPartTime,wagePerHour,totalEmpWage;
        //computation
        public ComputationOfEmpWage(String companyName, int numOfWorkingDays, int isFullTime, int isPartTime, int wagePerHour){
            this.companyName = companyName;
            this.numOfWorkingDays = numOfWorkingDays;
            this.isFullTime = isFullTime;
            this.isPartTime = isPartTime;
            this.wagePerHour = wagePerHour;
        }
}