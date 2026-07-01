class BankAccount{
    String accountNumber;
    double balance = 8655;
    
    BankAccount( String acc, double bal){
        this.accountNumber= acc;
        this.balance = bal ;
    }

        void deposit(double amount){
        balance = amount + balance; 
        //System.out.println( " The balnce is:"+ balance);
        //return balance;
    }

        void withdraw(double amount){
        if( balance<amount){
            System.out.println("Insufficient funds!");
        } else{
        balance = balance - amount;
        //System.out.println(" The balance is:"+ balance);
        //return balance;
        }
    }

        void displayDetails(){
        //Scanner sc = new Scanner(System.in);
        System.out.println("Account Number : "+ accountNumber);
        //System.out.println(" Balance : "+ balance);
         System.out.printf("Balance : %.2f%n", balance);
         ;
       }

      
     }

 class MAIN{
        public static void main( String[] args){

            Scanner sc = new Scanner(System.in);
            int amount = sc.nextInt();
            
           BankAccount account = new BankAccount("9662375274869", 8655);

                account.deposit(5854);
                account.withdraw(9437);

            sc.close();
        }
       }
