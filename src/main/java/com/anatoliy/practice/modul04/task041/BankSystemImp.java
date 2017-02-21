package com.anatoliy.practice.modul04.task041;

public class BankSystemImp implements BankSystem {

    boolean transactionWitdraw;
    boolean transactionFund;

    public void withdrawOfUser(User user, int amount) {
        System.out.println("Выводит возможность снятия денег и состояние баланса пользователя после снятия");

        if (user.getBalance() >= (amount + (amount * user.getBank().getCommission(amount) / 100))) {
            if(amount <= user.getBank().getLimitOfWithdrawal()) {
                user.setBalance(user.getBalance() - amount - (amount * user.getBank().getCommission(amount) / 100));
                System.out.println("Balance = " + user.getBalance());
                transactionWitdraw = true;
            } else {
                System.out.println("Превышена сумма разового снятия налички");
                System.out.println("Limit of withdrawal = " + user.getBank().getLimitOfWithdrawal());
                transactionWitdraw = false;
            }
        } else {
            System.out.println("Недостаточно средств на счету");
            System.out.println("Balance = " + user.getBalance());
            transactionWitdraw = false;
        }
    }

    public void fundUser(User user, int amount) {
        System.out.println("Выводит возможность пополнения баланса и состояние баланса пользователя после пополнения");

        if (amount <= user.getBank().getLimitOfFunding()) {
            user.setBalance(user.getBalance() + amount );
            System.out.println("Balance = " + user.getBalance());
            transactionFund = true;
        } else {
            System.out.println("Превышена сумма разового пополнения счета");
            System.out.println("Limit of funding = " + user.getBank().getLimitOfFunding());
            transactionFund = false;
        }
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        System.out.println("Выводит возможность перевода средств со счета одного пользователя на счет другого");
        withdrawOfUser(fromUser, amount);
        if(transactionWitdraw) {
            fundUser(toUser, amount);
        }
        if(transactionFund){
            System.out.println("Перевод выполнен успешно");
        } else {
            System.out.println("Не выполнено. См. выше");
        }
    }

    public void paySalary(User user) {
        System.out.println("Выводит возможность зачисления зарплаты на счет пользователя и состояние баланса после зачисления средств");
        fundUser(user, user.getSalary());
        if(transactionFund) {
            user.setBalance(user.getBalance() + user.getSalary());
            System.out.println("Balance = " + user.getBalance());
        } else {
            System.out.println("Смените банк он не может зачислить на ваш счет огромную зарплату");
        }
    }
}
