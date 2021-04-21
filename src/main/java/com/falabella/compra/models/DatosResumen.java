package com.falabella.compra.models;

public class DatosResumen {

    private String nombreArticulo;
    private double precio;
    private double valorSeguro;
    private double total;

    public DatosResumen() {
        this("",0,0,0);
    }
    public DatosResumen(String nombreArticulo, double precio, double valorSeguro, double total) {
        this.nombreArticulo =nombreArticulo;
        this.precio = precio;
        this.valorSeguro = valorSeguro;
        this.total = total;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public String getTotal()
    {
        return String.valueOf(getPrecio()+getValorSeguro());
    }

}
