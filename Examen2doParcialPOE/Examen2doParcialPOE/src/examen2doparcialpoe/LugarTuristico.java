/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2doparcialpoe;

/**
 *
 * @author Usuario
 */
public class LugarTuristico {

    private String nombre;
    private String ubicacion;
    private double costoEntrada;

    public LugarTuristico(String nombre, String ubicacion, double costoEntrada) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.costoEntrada = costoEntrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getCostoEntrada() {
        return costoEntrada;
    }

    public void setCostoEntrada(double costoEntrada) {
        this.costoEntrada = costoEntrada;
    }

}
