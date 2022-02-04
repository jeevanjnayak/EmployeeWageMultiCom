package com.Bridgelabz.EmployeeWageMultiCom;

public class EmployeeWageMultiComp {

    public int dayPresent = 0, monthlyWage = 0, totalHour = 0, empHour = 0;
    public final int IS_FULL_TIME = 1;
    public final int IS_PART_TIME = 2;

    public void MonthlyWage(String company, int perHourPay, int perDayHour, int workingDays, int maxHours) {

        for(int i=1;i<=workingDays;i++) {

            int empCheck= (int) (Math.floor(Math.random()*10)%3);

            switch (empCheck) {

                case IS_FULL_TIME:
                    empHour = perDayHour;
                    if (totalHour < maxHours) {
                        dayPresent += 1;
                        totalHour += empHour;
                    }
                    break;
                case IS_PART_TIME:
                    empHour = 5;
                    if (totalHour < maxHours) {
                        dayPresent += 1;
                        totalHour += empHour;
                    }
                default:
                    break;
            }
        }
        System.out.println("working day " + dayPresent);
        System.out.println("total hour worked " + totalHour);
        monthlyWage = totalHour * perHourPay;
        System.out.println("monthly salary in " +company+ " is " + monthlyWage);
    }
}
class Calling {

    public static void main(String[] args){

        EmployeeWageMultiComp DMart = new EmployeeWageMultiComp();
        EmployeeWageMultiComp BigBasket = new EmployeeWageMultiComp();

        DMart.MonthlyWage("DMart", 40, 9, 26, 150 );
        System.out.println("");
        BigBasket.MonthlyWage("Big Basket", 50, 8, 25, 160);
    }
}
