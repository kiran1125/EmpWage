package com.bridgeLabz;

public interface IEmpWage {
    void addCompanyDetails(String company, int numOfWorkingDays, int isFullTime, int isPartTime, int wagePerHour);
    void computeEmpWage();
    int empMonthlyWage(ComputationOfEmpWage computationOfEmpWage);
}