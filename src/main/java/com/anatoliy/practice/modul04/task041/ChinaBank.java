package com.anatoliy.practice.modul04.task041;

public class ChinaBank extends Bank {

    public ChinaBank (long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital){
        super(id, bankCountry, currency,  numberOfEmployees,  avrSalaryOfEmployee,  rating,  totalCapital);
    }

    public int getLimitOfWithdrawal() {
        System.out.println("Возвращает лимит снятия налички в зависимости от валюты");
        int limit;
        if(getCurrency().equals(Currency.USD)){
            limit  = 100;
        } else {
            limit = 150;
        }
        return limit;
    }

    public int getLimitOfFunding() {
        System.out.println("Возвращает сумму максимального пополнения счета в зависимости от валюты");
        int limit;
        if(getCurrency().equals(Currency.USD)){
            limit  = 10000;
        } else {
            limit = 5000;
        }
        return limit;
    }

    public int getMonthlyRate() {
        System.out.println("Возвращает показатель месячного процента в зависимости от валюты");
        int rate;
        if(getCurrency().equals(Currency.USD)){
            rate  = 1;
        }else {
            rate = 0;
        }
        return rate;
    }

    public int getCommission(int summ) {
        System.out.println("Возвращает сумму коммисии при снятии наличных в зависимости от суммы и типа валюты");
        int  commisionUSD;
        int  commisionEUR;
        int commsion;
        if (summ < 1000){
            commisionUSD = 3;
            commisionEUR = 10;
        } else {
            commisionUSD = 5;
            commisionEUR = 11;
        }
        if(getCurrency().equals(Currency.USD)) {
            commsion = commisionUSD;
        } else {
            commsion = commisionEUR;
        }
        return commsion;
    }
}
