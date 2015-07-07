/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author junisha.khatri
 */
public class Account 
{
  
   private int accNumber;
    private double balance;

    public Account(double initialBalance, int accNo) 
    {
        balance = initialBalance;
        accNumber = accNo;
    }


    public void deposit(double amount) 
    {
        balance += amount;
    }

    public double withdraw(double amount) 
    {
        balance -= amount;
        return balance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public int getAccNumber() 
    {
        return accNumber;
    }
}
    

