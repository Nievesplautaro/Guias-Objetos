package com.company;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = this.getHora(hora);
        this.minuto = this.getMinuto(minuto);
        this.segundo = this.getSegundo(segundo);
    }

    public int getHora(int hora) {
        if (hora > -1 && hora < 24) {
            return hora;
        } else {
            System.out.println("Hora mal ingresada");
            return 0;
        }
    }

    public int getMinuto(int minuto) {
        if (minuto > -1 && minuto < 60) {
            return minuto;
        } else {
            System.out.println("Minuto mal ingresado");
            return 0;
        }
    }

    public int getSegundo(int segundo) {
        if (segundo > -1 && segundo < 60) {
            return segundo;
        } else {
            System.out.println("Segundo mal ingresado");
            return 0;
        }
    }

    private String addCero(int valor) {
        String rta;
        if (valor < 10) {
            rta = "0" + valor;
        } else {
            rta = "" + valor;
        }

        return rta;
    }

    public void avanzarUnSegundo() {
        ++this.segundo;
        if (this.segundo == 60) {
            this.segundo = 0;
            ++this.minuto;
        }

        if (this.minuto == 60) {
            this.minuto = 0;
            ++this.hora;
        }

        if (this.hora == 24) {
            this.hora = 0;
        }

        this.mostrarHora();
    }

    public void mostrarHora() {
        System.out.println(this.addCero(this.hora) + ":" + this.addCero(this.minuto) + ":" + this.addCero(this.segundo));
    }
}