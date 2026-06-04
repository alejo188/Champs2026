package com.champs2026.logica;

import java.util.Scanner;

/**
 * Controla el flujo de registro inicial de los directores técnicos por consola.
 */
public class ConfiguracionInicial {

    public static Jugador[] registrarJugadores() {
        Scanner scanner = new Scanner(System.in);
        Jugador[] jugadores = new Jugador[2];

        System.out.println("=========================================");
        System.out.println("      BIENVENIDO A CHAMPS 2026 - LA FINAL");
        System.out.println("=========================================");

        // Registro Jugador 1
        System.out.print("Ingrese el nombre del Director Técnico 1: ");
        String nombre1 = scanner.nextLine();
        System.out.print("Elija la Selección Nacional para el Jugador 1 (ej. Argentina): ");
        String pais1 = scanner.nextLine();
        SeleccionNacional sel1 = new SeleccionNacional(pais1);
        jugadores[0] = new Jugador(nombre1, sel1);

        // Registro Jugador 2 con validación estricta de no repetición de país
        System.out.println("\n-----------------------------------------");
        System.out.print("Ingrese el nombre del Director Técnico 2: ");
        String nombre2 = scanner.nextLine();
        
        String pais2;
        while (true) {
            System.out.print("Elija la Selección Nacional para el Jugador 2 (NO puede ser " + pais1 + "): ");
            pais2 = scanner.nextLine();
            if (!pais2.equalsIgnoreCase(pais1)) {
                break;
            }
            System.out.println("[VALIDACIÓN]: ¡Error! Ambos entrenadores no pueden dirigir al mismo país.");
        }
        
        SeleccionNacional sel2 = new SeleccionNacional(pais2);
        jugadores[1] = new Jugador(nombre2, sel2);

        System.out.println("\n[SISTEMA]: Configuración inicial completada de manera exitosa.\n");
        return jugadores;
    }
}