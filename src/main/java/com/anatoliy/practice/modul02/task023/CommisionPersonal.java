package com.anatoliy.practice.modul02.task023;


public class CommisionPersonal {
    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        double commisionByPercent = 5.0;

        String ownerName = "Lane";
        double withdrawal = 490;
        int index = -1;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName.equals(ownerNames[i])) {
                index = i;
                break;
            }
        }
        CommisionPersonal commisionPersonal = new CommisionPersonal();
        commisionPersonal.withdraw(balances[index], ownerName, withdrawal, commisionByPercent);
    }

    public void withdraw(int balance, String ownerName, double withdrawal, double commisionByPercent) {
        double commisionByMoney = withdrawal * commisionByPercent / 100;
        if ((commisionByMoney + withdrawal) < balance)
            System.out.println(ownerName + " " + withdrawal + " " + (balance - commisionByMoney - withdrawal));
        else System.out.println(ownerName + " NO");
    }
}
