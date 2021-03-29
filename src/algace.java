
//pridame do gitu trápny kódik

public class algace {
    public static void main(String[] args) {
        char pismenko = 'A';
        char pismenko2 = 'E';
        for (int i = 0; i < ('E' - 'A' + 1 ); i++){
            for (int j = 0; j <= i ; j++){
                System.out.print(pismenko + " ");
            }
            pismenko++;
            System.out.println();
        }

        for (int i = 4; i >= ('A' - 'E' + 4); --i){
            for (int j = 0; j <= i ; j++) {
                System.out.print(pismenko2 + " ");
            }
            pismenko2--;
            System.out.println();
        }
    }
}class BankAccount{
    private double balance;
    private boolean kreditnaKarta;


    public BankAccount (double openingBalance, boolean withdrawWithCreditCart){
        balance = openingBalance;
        this.kreditnaKarta = withdrawWithCreditCart;

    }
    public void deposit (double amount){
        balance = balance + amount;

    }
    
    public void withdraw (double amount){

            balance = balance - amount;
            withDrawWithCreditCart();
        }


    private void withDrawWithCreditCart(){
        if (kreditnaKarta){
            balance = balance -5;
            System.out.println("vytiahli ste kreditkou a tak sa vám odobere -5");
        } else {
            System.out.println("výber z banky");
        }
    }






    public void display (){
        System.out.println("balance : " + balance);
    }

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100.00,true);
        BankAccount ba2 = new BankAccount(100.00,false);

        ba1.display();
        ba1.deposit(1000);
        ba1.withdraw(1200);
        ba1.display();
        ba2.display();



    }

    }






