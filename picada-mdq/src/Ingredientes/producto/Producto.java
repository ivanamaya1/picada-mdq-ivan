package Ingredientes.producto;
//vamos a tener los tipos de queso,fiambre y snack, + el stock
//Vamos a trabajar con enteros simulando que son bolsas de queso, bolsas de jamon y bolsas de snack

public abstract class Producto {
    private int stock;

    public Producto(int stock) {
        this.stock = stock;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //funcion que modifica el stock en base a lo que pidio el usuario
    public abstract void actualizarStock();

    //


}
