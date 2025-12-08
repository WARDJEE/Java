package week05.Bank;

public class BankAccount {
    private String holder;
    private String iban;
    private double balance;

    public BankAccount(String holder, String iban, double balance){
        this.holder = holder;
        this.iban = iban;
        this.balance = balance;
    }

    public BankAccount(String holder, String iban){
        this.holder = holder;
        this.iban = iban;
        this.balance = 0;
        }


    public String getHolder(){
        return this.holder;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public String getIban(){
        return this.iban;
    }

    public void setIban(String iban){
        this.iban = iban;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double bedrag){
        if (bedrag < 0){
            System.out.println("Je kan niets negatief storten!");
        }
        else {this.balance += bedrag;}
    }

    public boolean withdraw(int bedrag){
        if(bedrag > this.balance){
            return false;
        }
        else {
            this.balance -= bedrag;
            return true;
        }
    }

    public String toString(){
        return "De rekening "+this.iban+" op naam van "+this.holder+" heeft een saldo van €"+ this.balance;

    }




}
