package ejercicio2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Intolerancia {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        System.out.print("Comida de ayer (riesgo): ");
        //cogemos los ingredientes de ayer.
        String yesterdaysFood = sc.nextLine();
        //guardamos los ingredientes de ayer en una lista de arrays.
        String[] yesterdaysAllElements = yesterdaysFood.split(" ");
        System.out.print("Comida de hoy (segura): ");
        //cogemos los ingredientes de hoy.
        String todaysFood = sc.nextLine();
        //guardamos los ingredientes de hoy en una lista de arrays.
        String[] todaysAllElements = todaysFood.split(" ");

        //creamos un HashSet para guardar cada ingredientes de aayer como un caracter
        Set<String> yesterdaysElements = new HashSet<>();
        for (String elements1 : yesterdaysAllElements) {
            yesterdaysElements.add(elements1);
        }

        //creamos un HashSet para guardar cada ingredientes de hoy como un caracter
        Set<String> todaysElements = new HashSet<>();
        for (String elements2 : todaysAllElements) {
            todaysElements.add(elements2);
        }

        //eleminamos todos los caracteres(ingredientes) de hoy que hay en caracteres de ayer.
        yesterdaysElements.removeAll(todaysElements);

        //imprimimos los ingredientes de ayer.
        if (yesterdaysElements.isEmpty()) {
            System.out.println("Todos los ingredientes son seguros.");
        } else {
            System.out.println("Ingredientes peligrosos: " + yesterdaysElements);
        }
    }
}