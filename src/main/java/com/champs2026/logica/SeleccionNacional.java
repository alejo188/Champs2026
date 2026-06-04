package com.champs2026.logica;

import java.util.ArrayList;

/**
 * Representa la selección nacional elegida por un Director Técnico.
 */
public class SeleccionNacional {
    private String nombrePais;
    private ArrayList<com.champs2026.logica.Deportista> plantilla; // Lista donde se añaden los fichajes

    public SeleccionNacional(String nombrePais) {
        this.nombrePais = nombrePais;
        this.plantilla = new ArrayList<>();
    }

    /**
     * Requerido por la lógica del Integrante 3 (MercadoFichajes)
     */
    public void agregarFutbolista(com.champs2026.logica.Deportista d) {
        this.plantilla.add(d);
    }

    public void mostrarPlantilla() {
        System.out.println("Plantilla de " + nombrePais + ":");
        for (com.champs2026.logica.Deportista d : plantilla) {
            d.mostrarDetalles();
        }
    }

    public String getNombrePais() { return nombrePais; }
    public ArrayList<com.champs2026.logica.Deportista> getPlantilla() { return plantilla; }
}