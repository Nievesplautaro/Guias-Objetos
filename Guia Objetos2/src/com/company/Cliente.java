package com.company;

import java.util.UUID;

public class Cliente {
    public int descuento;
    private String id = UUID.randomUUID().toString();
    private String nombre;
    private String email;
    private char genero;

    public Cliente(String nombre, String email, int descuento, char genero) {
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
        this.genero = genero;
    }

    public String GetNombre() {
        return this.nombre;
    }

    public void showClient() {
        System.out.println("Cliente[id=" + this.id + ", nombre=" + this.nombre + ", email=" + this.email + ", descuento=" + this.descuento + "]");
    }
}