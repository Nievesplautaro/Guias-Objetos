package com.company;

public class Cuenta {
    private int id;
    private String nombre;
    private double balance;

    public Cuenta(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public double Credito(double monto){
        return balance+=monto;
    }

    public double Debito(double monto){
        if (monto>balance){
            System.out.println("Saldo insuficiente");
        }
        else{
            balance-=monto;
        }
        return balance;
    }

    public void MostrarCuenta(){
        System.out.println("Id:"+id+"\nTitular:"+nombre+"\nBalance:"+balance);
    }
}
