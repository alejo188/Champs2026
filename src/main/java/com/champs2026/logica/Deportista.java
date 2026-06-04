 package com.champs2026.logica;

    /**
     * Clase abstracta que define la estructura base de cualquier futbolista.
     */
    public abstract class Deportista {
        private String nombre;
        private int velocidad;
        private int disparo;
        private int pase;
        private int defensa;
        private double precio;

        public Deportista(String nombre, int velocidad, int disparo, int pase, int defensa, double precio) {
            this.nombre = nombre;
            this.velocidad = velocidad;
            this.disparo = disparo;
            this.pase = pase;
            this.defensa = defensa;
            this.precio = precio;
        }

        public abstract void mostrarDetalles();

        // Getters y Setters
        public String getNombre() { return nombre; }
        public int getVelocidad() { return velocidad; }
        public int getDisparo() { return disparo; }
        public int getPase() { return pase; }
        public int getDefensa() { return defensa; }
        public double getPrecio() { return precio; }
    }
