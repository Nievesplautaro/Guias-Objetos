package com.company;

import java.io.PrintStream;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    public Autor autor1;
    public Autor[] colaboradores;

    public Libro(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor1 = autor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void PrintLibro() {
        String var10001 = this.titulo;
        System.out.println("Titulo: " + var10001 + "\nPrecio: " + this.precio + "\nStock:" + this.stock + "\nAutor: " + this.autor1.getNombre() + " " + this.autor1.getApellido());
    }

    public void PrintAutorLibro() {
        PrintStream var10000 = System.out;
        String var10001 = this.autor1.getNombre();
        var10000.println("Nombre: " + var10001 + "\nApellido: " + this.autor1.getApellido() + "\nEmail:" + this.autor1.getEmail() + "\nGenero: " + this.autor1.getGenero());
    }

    public void MostrarMensaje() {
        String var10001 = this.titulo;
        System.out.println("El libro " + var10001 + " del autor " + this.autor1.getNombre() + " " + this.autor1.getApellido() + " se vende a $" + this.precio);
    }
}