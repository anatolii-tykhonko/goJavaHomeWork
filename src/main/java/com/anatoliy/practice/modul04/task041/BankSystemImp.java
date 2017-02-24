package com.anatoliy.practice.modul04.task041;

public class BankSystemImp implements BankSystem {

    public boolean withdrawOfUser(User user, int amount) {
        System.out.println("Выводит возможность снятия денег и состояние баланса пользователя после снятия");

        if (user.getBalance() >= (amount + (amount * user.getBank().getCommission(amount) / 100))) {
            if(amount <= user.getBank().getLimitOfWithdrawal()) {
                user.setBalance(user.getBalance() - amount - (amount * user.getBank().getCommission(amount) / 100));
                System.out.println("Balance = " + user.getBalance());
                return true;
            } else {
                System.out.println("Превышена сумма разового снятия налички");
                System.out.println("Limit of withdrawal = " + user.getBank().getLimitOfWithdrawal());
                return  false;
            }
        } else {
            System.out.println("Недостаточно средств на счету");
            System.out.println("Balance = " + user.getBalance());
            return false;
        }
    }

    public boolean fundUser(User user, int amount) {
        System.out.println("Выводит возможность пополнения баланса и состояние баланса пользователя после пополнения");

        if (amount <= user.getBank().getLimitOfFunding()) {
            user.setBalance(user.getBalance() + amount );
            System.out.println("Balance = " + user.getBalance());
            return  true;
        } else {
            System.out.println("Превышена сумма разового пополнения счета");
            System.out.println("Limit of funding = " + user.getBank().getLimitOfFunding());
            return  false;
        }
    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        System.out.println("Выводит возможность перевода средств со счета одного пользователя на счет другого");

        if( withdrawOfUser(fromUser, amount)) {
            if (fundUser(toUser, amount)) {
                System.out.println("Перевод выполнен успешно");
            } else {
                System.out.println("Не выполнено. См. выше");
            }
        } else {
            System.out.println("Не выполнено. См. выше");
        }
    }

    public void paySalary(User user) {
        System.out.println("Выводит возможность зачисления зарплаты на счет пользователя и состояние баланса после зачисления средств");

        if(fundUser(user, user.getSalary())) {
            user.setBalance(user.getBalance() + user.getSalary());
            System.out.println("Balance = " + user.getBalance());
        } else {
            System.out.println("Смените банк он не может зачислить на ваш счет огромную зарплату");
        }
    }
}
