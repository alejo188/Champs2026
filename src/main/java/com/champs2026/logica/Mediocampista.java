// Mediocampista.java
package com.champs2026.logica;

public class Mediocampista extends com.champs2026.logica.Deportista {
    public Mediocampista(String nombre, int velocidad, int disparo, int pase, int defensa, double precio) {
        super(nombre, velocidad, disparo, pase, defensa, precio);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[MEDIO] " + getNombre() + " | PAS: " + getPase() + " | VEL: " + getVelocidad() + " | PRECIO: " + getPrecio());
    }
}
