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
public class Playa extends LugarTuristico {

    private Playa siguiente;
    private int capacidadMaxima;
    private boolean tienteSombrillas;
    private String restaurante;

    public Playa(String nombre, String ubicacion, double costoEntrada, int capacidadMaxima, boolean tienteSombrillas, String restaurante) {
        super(nombre, ubicacion, costoEntrada);
        this.capacidadMaxima = capacidadMaxima;
        this.tienteSombrillas = tienteSombrillas;
        this.restaurante = restaurante;
    }


    public Playa getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Playa siguiente) {
        this.siguiente = siguiente;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public boolean getTienteSombrillas() {
        return tienteSombrillas;
    }

    public void setTienteSombrillas(boolean tienteSombrillas) {
        this.tienteSombrillas = tienteSombrillas;
    }

    public String getRestaurantes() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }
    
}
