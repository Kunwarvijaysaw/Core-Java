package com.nit.funtional_Interface;
import java.util.Scanner;

@FunctionalInterface
interface TransactionRule{
    boolean validate(double amount,double currentBalance);
}

public class BankingApp{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double withdrawAmount=sc.nextDouble();
        double currentBalance=sc.nextDouble();

        if(currentBalance<=0){
            System.out.println("Invalid withdrawal amount!");
            return;
        }

        TransactionRule rule=(amount,balance)->(balance - amount)>=500 && amount<=20000;

        if(rule.validate(currentBalance,withdrawAmount)){
            System.out.println("Transaction Successful!");
        }else{
            System.out.println("Transaction Failed!");
        }
    }
}