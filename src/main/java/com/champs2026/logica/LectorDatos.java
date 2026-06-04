package com.champs2026.logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Utilidad para cargar la base de datos de futbolistas desde un archivo de texto.
 */
public class LectorDatos {

    public static ArrayList<Deportista> cargarMercadoDesdeArchivo(String ruta) {
        ArrayList<Deportista> futbolistas = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Saltar líneas vacías o comentarios
                if (linea.trim().isEmpty() || linea.startsWith("#")) continue;
                
                // Formato esperado: Nombre,Posicion,Velocidad,Disparo,Pase,Defensa,Precio,Atajada
                String[] datos = linea.split(",");
                
                String nombre = datos[0].trim();
                String posicion = datos[1].trim().toUpperCase();
                int velocidad = Integer.parseInt(datos[2].trim());
                int disparo = Integer.parseInt(datos[3].trim());
                int pase = Integer.parseInt(datos[4].trim());
                int defensa = Integer.parseInt(datos[5].trim());
                double precio = Double.parseDouble(datos[6].trim());
                
                switch (posicion) {
                    case "DELANTERO":
                        futbolistas.add(new Delantero(nombre, velocidad, disparo, pase, defensa, precio));
                        break;
                    case "MEDIOCAMPISTA":
                    case "MEDIO":
                        futbolistas.add(new Mediocampista(nombre, velocidad, disparo, pase, defensa, precio));
                        break;
                    case "PORTERO":
                        int atajada = Integer.parseInt(datos[7].trim());
                        futbolistas.add(new Portero(nombre, velocidad, disparo, pase, defensa, precio, atajada));
                        break;
                }
            }
            System.out.println("[SISTEMA]: Se cargaron " + futbolistas.size() + " futbolistas desde el archivo.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("[ERROR ARCHIVO]: No se pudo leer el archivo de futbolistas. Usando lista vacía. " + e.getMessage());
        }
        
        return futbolistas;
    }
}