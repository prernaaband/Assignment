package Assign;
import java.util.Scanner;
  class Bank1 { 
	
    private String account_number;  
    private String name;  
    private String account_type;  
    private long balance;  
    Scanner sc = new Scanner(System.in);  
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        account_number = sc.next();  
        System.out.print("Enter Account type: ");  
        account_type= sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
    }  
    public void showAccount() {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + account_number);  
        System.out.println("Account type: " + account_type);  
        System.out.println("Balance: " + balance);  
    }  
  public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        balance = balance + amt;  
    }  
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the withdrawal ammount: ");  
        amt = sc.nextLong();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction is failed...!!" );  
        }  
    } 
    public boolean search(String ac_no) {  
        if (account_number.equals(ac_no)) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
}  
public class Bank_Acc {  
    public static void main(String arg[]) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("How many number of customers do you want to input? ");  
        int n = sc.nextInt();  
        Bank_Acc C[] = new Bank_Acc[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new Bank_Acc();  
            C[i].openAccount();  
        }  
        int ch;  
        do {  
            System.out.println("\n Banking System Applications");  
            System.out.println("1. Display the account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdrawal amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        for (int i = 0; i < C.length; i++) {  
                            C[i].showAccount();  
                        }  
                        break;  
                    case 2:  
                        System.out.print("Enter account no. you want to search: ");  
                        String ac_no = sc.next();  
                        boolean found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].deposit();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 4:  
                        System.out.print("Enter Account No : ");  
                        ac_no = sc.next();  
                        found = false;  
                        for (int i = 0; i < C.length; i++) {  
                            found = C[i].search(ac_no);  
                            if (found) {  
                                C[i].withdrawal();  
                                break;  
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;  
                    case 5:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (ch != 5);  
        }

	private void deposit() {
		// TODO Auto-generated method stub
		
	}

	private void withdrawal() {
		// TODO Auto-generated method stub
		
	}

	private boolean search(String ac_no) {
		// TODO Auto-generated method stub
		return false;
	}

	private void showAccount() {
		// TODO Auto-generated method stub
		
	}

	private void openAccount() {
		// TODO Auto-generated method stub
		
	}  
    }  
