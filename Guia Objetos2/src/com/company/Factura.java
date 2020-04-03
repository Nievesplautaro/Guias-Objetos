package com.company;

import java.time.LocalDate;
import java.util.UUID;

public class Factura {
    private String id = UUID.randomUUID().toString();
    private LocalDate date;
    public Cliente cliente;
    private ItemVenta[] Items;
    private float montoFinal;
    private float montoTotal;

    public Factura(LocalDate date, Cliente cliente, ItemVenta[] Items) {
        this.date = date;
        this.cliente = cliente;
        this.Items = Items;

        for(int i = 0; i < Items.length; ++i) {
            this.montoTotal += Items[i].precioUnitario;
        }

    }

    public String getMontoFinal() {
        this.montoFinal = this.montoTotal - this.montoTotal * (float)this.cliente.descuento / 100.0F;
        String frase = "";
        frase = frase.concat("Valor final es : " + this.montoFinal);
        return frase;
    }

    public void showRecipe() {
        System.out.println("Factura[id=" + this.id + ", monto=" + this.montoTotal + ", montoDesc=" + this.getMontoFinal() + ", ");
        this.cliente.showClient();
        System.out.println("]");
    }
}