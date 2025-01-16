import java.util.*;

class Bank {
    static int strength = 0;
    int acId, balance, age;
    String name;
    
    Bank(String n){
        name = n;
    }
    
    Bank(String n, int a){
        name = n;
        age = a;
        strength += 1;
        acId = strength;
        balance = 0;
    }
    
    void deposit(){
        int amt;
        Scanner s = new Scanner(System.in);
        System.out.println("💰 HOW MUCH TO DEPOSIT? ");
        amt = s.nextInt();
        balance += amt;
        System.out.println("Deposited: ₹" + amt + " 💸");
    }
    
    void withdraw(){
        int amt;
        Scanner s = new Scanner(System.in);
        System.out.println("💵 HOW MUCH TO WITHDRAW? ");
        amt = s.nextInt();
        
        if(amt > balance){
            System.out.println("🚫 WITHDRAWAL AMOUNT IS GREATER THAN BALANCE! ");
        }else{
            balance -= amt;
            System.out.println("Withdrawn: ₹" + amt + " 🏦");
        }
    }
    
    void checkBalance(){
        System.out.println("💳 TOTAL BALANCE IS: ₹" + balance + " 💰");
    }
    
    void display(){
        System.out.println("📇 Account Details: ");
        System.out.println("🆔 Account ID: " + acId);
        System.out.println("👤 Name: " + name);
        System.out.println("🎂 Age: " + age);
        System.out.println("💳 Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        int choice;
        Scanner S = new Scanner(System.in);
        String name;
        int age;
        Bank B = null;
        
        while(true){
            System.out.println("===BANK SIMULATION===\n 1 to create a bank account 🏦 \n 2 to deposit 💰 \n 3 to withdraw 💸 \n 4 to check balance 💳 \n 5 to display account details 📇 \n 6 to quit ❌");
            choice = S.nextInt();
            S.nextLine();
            
            switch(choice){
                case 1:
                    System.out.println("ENTER YOUR NAME: 📝");
                    name = S.nextLine();
                    System.out.println("ENTER YOUR AGE: 🎂");
                    age = S.nextInt();
                    B = new Bank(name, age);
                    break;
                case 2:
                    if (B != null) {
                        B.deposit();
                    } else {
                        System.out.println("⚠️ Please create an account first. 🏦");
                    }
                    break;
                case 3:
                    if (B != null) {
                        B.withdraw();
                    } else {
                        System.out.println("⚠️ Please create an account first. 🏦");
                    }
                    break;
                case 4:
                    if (B != null) {
                        B.checkBalance();
                    } else {
                        System.out.println("⚠️ Please create an account first. 🏦");
                    }
                    break;
                case 5:
                    if (B != null) {
                        B.display();
                    } else {
                        System.out.println("⚠️ Please create an account first. 🏦");
                    }
                    break;
                case 6:
                    System.out.println("👋 Goodbye! Have a great day! ✨");
                    System.exit(0);
                    break;
                default:
                    System.out.println("❌ INVALID CHOICE. Please try again. ❌");
            }
        }
    }
}

