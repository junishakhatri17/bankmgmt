/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


    public class Bank
    {
    private static double amount;
    private static ArrayList<Account> accountList = new ArrayList<>();
    private static Account selectedAccount;
    private static boolean flag = false;

    public static void main(String[] args) {
         int accNo= 1000;
       
        Scanner scan = new Scanner(System.in);
        
        // Menu starts from here
        Scanner input = new Scanner(System.in);
        while (true)
        {
        
             System.out.println("choose account");
             System.out.println("1.saving account");
             System.out.println("2.checking account");
             System.out.println("3.business account");
             int ch=scan.nextInt();
             System.out.println("account created");
            
       do
       {
       if(ch==1)
            {
        System.out.println("1. NEW ACCOUNT");
        System.out.println("2. SELECT ACCOUNT NO");
        System.out.println("3. CLOSE ACCOUNT");
        System.out.println("4. DEPOSIT");
        System.out.println("5. WITHDRAW");
        System.out.println("6.CHECK BAL IN SELECT ACCOUNT");
        System.out.println("You have to select account no before performing operation");
              int ch1=scan.nextInt(); 
              switch(ch1)
              {
         case 1:
              //System.out.println("account created");
                    System.out.println("enter your name");
                     String name=input.nextLine();
                     //System.out.println("name is" +name);
                    int bal = 0;
                    
                    System.out.println("your account number : "+ accNo);
                    
                    System.out.println("Enter initial amount: ");
                    bal = input.nextInt();
                    if(bal<=500)
                    {
                        System.out.println("Initial balance cannot be less thn 500");
                    }
                    else
                    {
                    System.out.println("Current account: " + accNo + " "
                        + "Balance " + bal);
                    Account account = new Account(bal, accNo);
                    accountList.add(account);
                    accNo++;
                    }
                    break;
              
          case 2:
               System.out .println("Enter account number for further operations : ");
                    int selectedAcc = scan.nextInt();
                    System.out.println("Selected account : " + selectedAcc);
                    for (Object object : accountList) 
                    {
                        selectedAccount = (Account) object;
                        if (selectedAccount.getAccNumber() == selectedAcc) 
                        {
                            flag = true;
                            break;
                        } 
                        else 
                        {
                        flag = false;
                        }
                    }
                    if (!flag) 
                    {
                        System.out.println("Account doesn't exists.");
                    }
                    if (accountList.isEmpty()) {
                        System.out.println("Zero account exists.");
                    }
                    break;
                    
          case  3:
              // close account
                    System.out .println("Enter account number for further operations : ");
                    int selectedAcc1 = scan.nextInt();
                    System.out.println("Selected account : " + selectedAcc1);
                    Iterator<Account> iterator = accountList.iterator();
                    while (iterator.hasNext()) {
                        selectedAccount = (Account) iterator.next();
                        if (selectedAccount.getAccNumber() == selectedAcc1) {
                            iterator.remove();
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Account doesn't exists.");
                    }
                    System.out.println("Account " + selectedAcc1 + " closed.");
                    break;
              
             
           
          case 4:
                System.out.println("Enter amount to deposit :  ");
                    amount = scan.nextDouble();
                    if (amount <= 0) {
                        System.out.println("You must deposit an amount greater than 0.");
                    } 
                    else 
                    {
                        if (flag) 
                        {
                            selectedAccount.deposit(amount);
                            System.out.println("You have deposited " + amount
                                + ". Total balance : "
                                + (selectedAccount.getBalance()));
                        } 
                        else 
                        {
                            System.out.println("Please select account number.");
                        }
                    }
                    break;
             
          case 5:
              System.out.println("Enter amount to be withdrawn: ");
                    amount = scan.nextDouble();
                    if (amount >selectedAccount.getBalance()) 
                    {
                        System.out.println("You can't withdraw that amount!");
                    } 
                    else if (amount <= selectedAccount.getBalance()) 
                    {
                        if (flag) 
                        {
                            double balance=selectedAccount.withdraw(amount);
                            System.out.println("You have withdraw : " + amount+ " NewBalance : "
                            + balance);
                        } 
                        else 
                        {
                            System.out.println("Please select account number.");
                        }
                    }
                    break;
     
              
          case 6:
               if (flag)
               {
                        System.out.println("Your current account balance : "+ selectedAccount.getBalance());
                    } 
                    else 
                    {
                        System.out.println("Please select account number.");
                        System.out.println("Your current account balance : "
                            + selectedAccount.getBalance());
                    }
                    break;
              
          default:
              System.out.println("no option is chosen");
              System.out.println("Thank You. Visit Again!");
                    flag = false;
                    input.close();
                    scan.close();
                    System.exit(0);
                    break;
            }
        } // end of menu loop
            else if(ch==2)
            {
                System.out.println("1 Create account");
              System.out.println("2.SELECT ACCOUNT NO");
        System.out.println("3.CLOSE ACCOUNT");
        System.out.println("4.DEPOSIT");
        System.out.println("5. WITHDRAW");
        System.out.println("5.CHECK BAL IN SELECT ACCOUNT");
        System.out.println("You have to select account no before performing operation");
        
              int ch1=scan.nextInt(); 
              switch(ch1)
              {
              
          case 1: 
               System.out .println("Enter account number for further operations : ");
                    int selectedAcc = scan.nextInt();
                    System.out.println("Selected account : " + selectedAcc);
                    for (Object object : accountList) 
                    {
                        selectedAccount = (Account) object;
                        if (selectedAccount.getAccNumber() == selectedAcc) 
                        {
                            flag = true;
                            break;
                        } 
                        else 
                        {
                        flag = false;
                        }
                    }
                    if (!flag) 
                    {
                        System.out.println("Account doesn't exists.");
                    }
                    if (accountList.isEmpty()) {
                        System.out.println("Zero account exists.");
                    }
                    break;
                    
          case  2:
              // close account
                    System.out .println("Enter account number for further operations : ");
                    int selectedAcc1 = scan.nextInt();
                    System.out.println("Selected account : " + selectedAcc1);
                    Iterator<Account> iterator = accountList.iterator();
                    while (iterator.hasNext()) {
                        selectedAccount = (Account) iterator.next();
                        if (selectedAccount.getAccNumber() == selectedAcc1) {
                            iterator.remove();
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Account doesn't exists.");
                    }
                    System.out.println("Account " + selectedAcc1 + " closed.");
                    break;
              
             
           
          case 3:
                System.out.println("Enter amount to deposit :  ");
                    amount = scan.nextDouble();
                    if (amount <= 0) {
                        System.out.println("You must deposit an amount greater than 0.");
                    } 
                    else 
                    {
                        if (flag) 
                        {
                            selectedAccount.deposit(amount);
                            System.out.println("You have deposited " + amount
                                + ". Total balance : "
                                + (selectedAccount.getBalance()));
                        } 
                        else 
                        {
                            System.out.println("Please select account number.");
                        }
                    }
                    break;
             
          case 4:
              System.out.println("Enter amount to be withdrawn: ");
                    amount = scan.nextDouble();
                    if (amount >selectedAccount.getBalance()) 
                    {
                        System.out.println("You can't withdraw that amount!");
                    } 
                    else if (amount <= selectedAccount.getBalance()) 
                    {
                        if (flag) 
                        {
                            double balance=selectedAccount.withdraw(amount);
                            System.out.println("You have withdraw : " + amount+ " NewBalance : "
                            + balance);
                        } 
                        else 
                        {
                            System.out.println("Please select account number.");
                        }
                    }
                    break;
     
              
          case 5:
               if (flag)
               {
                        System.out.println("Your current account balance : "+ selectedAccount.getBalance());
                    } 
                    else 
                    {
                        System.out.println("Please select account number.");
                        System.out.println("Your current account balance : "
                            + selectedAccount.getBalance());
                    }
                    break;
              
          default:
              System.out.println("no option is chosen");
              System.out.println("Thank You. Visit Again!");
                    flag = false;
                    input.close();
                    scan.close();
                    System.exit(0);
                    break;
            }
        } // end of menu loop  
            else
            {
                
            
        System.out.println("1. SELECT ACCOUNT");
        System.out.println("2. CLOSE ACCOUNT NO");
        System.out.println("3. DEPOSIT");
        System.out.println("4. WITHDRAW");
        System.out.println("5.CHECK BAL IN SELECT ACCOUNT");
        System.out.println("You have to select account no before performing operation");
              int ch1=scan.nextInt(); 
              switch(ch1)
              {
              
          case 1: 
               System.out .println("Enter account number for further operations : ");
                    int selectedAcc = scan.nextInt();
                    System.out.println("Selected account : " + selectedAcc);
                    for (Object object : accountList) 
                    {
                        selectedAccount = (Account) object;
                        if (selectedAccount.getAccNumber() == selectedAcc) 
                        {
                            flag = true;
                            break;
                        } 
                        else 
                        {
                        flag = false;
                        }
                    }
                    if (!flag) 
                    {
                        System.out.println("Account doesn't exists.");
                    }
                    if (accountList.isEmpty()) {
                        System.out.println("Zero account exists.");
                    }
                    break;
                    
          case  2:
              // close account
                    System.out .println("Enter account number for further operations : ");
                    int selectedAcc1 = scan.nextInt();
                    System.out.println("Selected account : " + selectedAcc1);
                    Iterator<Account> iterator = accountList.iterator();
                    while (iterator.hasNext()) {
                        selectedAccount = (Account) iterator.next();
                        if (selectedAccount.getAccNumber() == selectedAcc1) {
                            iterator.remove();
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("Account doesn't exists.");
                    }
                    System.out.println("Account " + selectedAcc1 + " closed.");
                    break;
              
             
           
          case 3:
                System.out.println("Enter amount to deposit :  ");
                    amount = scan.nextDouble();
                    if (amount <= 0) {
                        System.out.println("You must deposit an amount greater than 0.");
                    } 
                    else 
                    {
                        if (flag) 
                        {
                            selectedAccount.deposit(amount);
                            System.out.println("You have deposited " + amount
                                + ". Total balance : "
                                + (selectedAccount.getBalance()));
                        } 
                        else 
                        {
                            System.out.println("Please select account number.");
                        }
                    }
                    break;
             
          case 4:
              System.out.println("Enter amount to be withdrawn: ");
                    amount = scan.nextDouble();
                    if (amount >selectedAccount.getBalance()) 
                    {
                        System.out.println("You can't withdraw that amount!");
                    } 
                    else if (amount <= selectedAccount.getBalance()) 
                    {
                        if (flag) 
                        {
                            double balance=selectedAccount.withdraw(amount);
                            System.out.println("You have withdraw : " + amount+ " NewBalance : "
                            + balance);
                        } 
                        else 
                        {
                            System.out.println("Please select account number.");
                        }
                    }
                    break;
     
              
          case 5:
               if (flag)
               {
                        System.out.println("Your current account balance : "+ selectedAccount.getBalance());
                    } 
                    else 
                    {
                        System.out.println("Please select account number.");
                        System.out.println("Your current account balance : "
                            + selectedAccount.getBalance());
                    }
                    break;
              
          default:
              System.out.println("no option is chosen");
              System.out.println("Thank You. Visit Again!");
                    flag = false;
                    input.close();
                    scan.close();
                    System.exit(0);
                    break;
            }
            
            }
        }while(ch!=0);
        
       }
    }
    }

    
// end of menu loop
      
               
    // end of main
 // end of class
        // TODO code
              
         
