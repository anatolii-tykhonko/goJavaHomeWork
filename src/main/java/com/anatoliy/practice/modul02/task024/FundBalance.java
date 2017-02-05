package com.anatoliy.practice.modul02.task024;


public class FundBalance {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double deposit = 100;
        int index = -1;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName.equals(ownerNames[i])) {
                index = i;
                break;
            }
        }
        FundBalance fundBalance = new FundBalance();
        fundBalance.fund(balances[index], ownerName, deposit);
    }
    public void fund(int balance, String ownerName, double deposit){
        System.out.println(ownerName + " " + (balance + deposit));
    }
}
