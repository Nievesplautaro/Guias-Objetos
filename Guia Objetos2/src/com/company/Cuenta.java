package com.company;

public class Cuenta {
    private static int contador = 0;
    private double balance;
    private Cliente cliente;
    private int id;
    private String[] registros;
    private int i;

    public Cuenta(double balance, Cliente cliente) {
        this.balance = balance;
        this.cliente = cliente;
        ++contador;
        this.id = contador;
        this.registros = new String[10];
        this.i = 0;
    }

    public void mostrarCuenta() {
        System.out.println("Cuenta:" + this.cliente + "\nSaldo:" + this.balance + "\nId:" + this.id);
    }

    public void extraer(double monto) {
        if (monto - 2000.0D > this.balance) {
            System.out.println("Saldo Insuficiente");
        } else {
            this.registrarExtraccion(monto);
            this.balance -= monto;
        }

    }

    public void depositar(double money) {
        this.registrarDeposito(money);
        this.balance += money;
    }

    private void registrarDeposito(double monto) {
        if (this.i < 10) {
            String[] var10000 = this.registros;
            int var10001 = this.i;
            String var10002 = this.cliente.GetNombre();
            var10000[var10001] = "El cliente " + var10002 + ", depositó " + monto;
            ++this.i;
        }

    }

    private void registrarExtraccion(double monto) {
        if (this.i < 10) {
            String[] var10000 = this.registros;
            int var10001 = this.i;
            String var10002 = this.cliente.GetNombre();
            var10000[var10001] = "El cliente " + var10002 + ", extrajo " + monto;
            ++this.i;
        }

    }

    public void mostrarRegistro() {
        for(int f = 0; f < this.i; ++f) {
            System.out.println(this.registros[f]);
        }

    }
}