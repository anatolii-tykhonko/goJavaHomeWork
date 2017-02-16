package com.anatoliy.practice.modul03.task034;

public class User {

    private static final double COMMISION_FIVE_PERSENTS = 0.05;
    private static final double COMMISION_TEN_PERSENTS = 0.1;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, double balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paySalary() {
        System.out.println("добавляет  заработную плату к балансу пользователя");
        balance = +salary;
        System.out.println("Balance = " + balance);
    }

    public void withdraw(int summ) {
        System.out.println("снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях");
        double persentOfCommision;
        if (summ < 1000) {
            persentOfCommision = COMMISION_FIVE_PERSENTS;
        } else {
            persentOfCommision = COMMISION_TEN_PERSENTS;
        }
        if (balance >= (summ + (summ * persentOfCommision))) {
            balance = balance - summ - (summ * persentOfCommision);
            System.out.println("Balanca = " + balance);
        } else {
            System.out.println("Недостаточно средств на счету");
        }
    }

    public void printCompanyNameLenght() {
        System.out.println("вычисляет длину имя компании и выводит в консоль");
        int companyNameLenght;
        companyNameLenght = companyName.length();
        System.out.println("Название компании содержит " + companyNameLenght + " букв");
    }

    public void monthIncreaser(int addMonth) {
        System.out.println("Увеличивает monthsOfEmployment на показатель addMonth");
        monthsOfEmployment = +addMonth;
        System.out.println("Стаж работы " + monthsOfEmployment + " месяцев");
    }

}
