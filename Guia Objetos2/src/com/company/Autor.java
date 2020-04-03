//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.company;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGenero() {
        return this.genero;
    }

    public Autor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
    }

    public void mostrarAutor() {
        System.out.println("\tNombre=" + this.nombre + ", Apellido=" + this.apellido + ", Email=" + this.email + ", genero=" + this.genero);
    }
}