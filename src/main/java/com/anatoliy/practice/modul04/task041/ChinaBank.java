package com.anatoliy.practice.modul04.task041;

public class ChinaBank extends Bank {

    private final static int LIMIT_WITHDRAW_USD = 100;
    private final static int LIMIT_WITHDRAW_EUR = 150;
    private final static int LIMIT_FUND_EUR = 5000;
    private final static int LIMIT_FUND_USD = 10000;
    private final static int RATE_USD = 1;
    private final static int RATE_EUR = 0;
    private final static int[] COMMISSION_EUR = {10, 11};
    private final static int[] COMMISSION_USD = {3, 5};

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        System.out.println("Возвращает лимит снятия налички в зависимости от валюты");
        if (getCurrency().equals(Currency.USD)) {
            return LIMIT_WITHDRAW_USD;
        } else {
            return LIMIT_WITHDRAW_EUR;
        }
    }

    public int getLimitOfFunding() {
        System.out.println("Возвращает сумму максимального пополнения счета в зависимости от валюты");
        if (getCurrency().equals(Currency.USD)) {
            return LIMIT_FUND_USD;
        } else {
            return LIMIT_FUND_EUR;
        }
    }

    public int getMonthlyRate() {
        System.out.println("Возвращает показатель месячного процента в зависимости от валюты");
        if (getCurrency().equals(Currency.USD)) {
            return RATE_USD;
        } else {
            return RATE_EUR;
        }
    }

    public int getCommission(int summ) {
        System.out.println("Возвращает сумму коммисии при снятии наличных в зависимости от суммы и типа валюты");
        int commissionPosition;
        if (summ < 1000) {
            commissionPosition = 0;
        } else {
            commissionPosition = 1;
        }
        if (getCurrency().equals(Currency.USD)) {
            return COMMISSION_USD[commissionPosition];
        } else {
            return COMMISSION_EUR[commissionPosition];
        }
    }
}
