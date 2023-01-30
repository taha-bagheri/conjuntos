package ejercicio4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Repetidores {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // usamos de HashSet y un bucle for para guardar los nombres de anyo pasado.
        Set<String> studentsLastYear = new HashSet<>();
        System.out.print("Alumnos año anterior: ");
        String[] lastYearNames = sc.nextLine().split(" ");
        for (String name1 : lastYearNames) {
            studentsLastYear.add(name1);
        }

        // usamos de HashSet y un bucle for para guardar los nombres de este anyo.
        Set<String> studentsThisYear = new HashSet<>();
        System.out.print("Alumnos año actual: ");
        String[] thisYearNames = sc.nextLine().split(" ");
        for (String name2 : thisYearNames) {
            studentsThisYear.add(name2);
        }

        //ahora sacamos los nombres que estan en ambas listas.
        studentsLastYear.retainAll(studentsThisYear);

        // imprimimos los nombres.
        System.out.print("Alumnos repetidores:");
        for (String name3 : studentsLastYear) {
            System.out.print(name3 + " ");
        }
    }
}