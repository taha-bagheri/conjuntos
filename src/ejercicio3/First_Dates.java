package ejercicio3;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class First_Dates {
    public static void main(String[] args) {
        // Creamos un escaner para leer los datos de entrada
        Scanner sc = new Scanner(System.in);

        // guardamos tables y mesa sin pareja con hashSet.
        Set<Integer> tables = new HashSet<>();
        Set<Integer> mesasSinPareja = new HashSet<>();

        //usamos a bucle for para encontrar mesas sin parejas
        System.out.print("introduzca los numeros: ");
        String[] input = sc.nextLine().split(" ");
        for (String s : input) {
            int n = Integer.parseInt(s);
            if (!tables.contains(n)) { 
                mesasSinPareja.add(n);
            } else {
                mesasSinPareja.remove(n);
            }
            tables.add(n);
        }

        //imprimimos mesas sin parejas.
        System.out.println("Mesas sin pareja:");
        for (Integer i : mesasSinPareja) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}