package ejercicio1;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Digitos_diferentes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduzca un numero largo: ");
        //con scanner guardamos un numero largo.
        String longNumber = sc.nextLine();

        //con HashSet y un bucle for anyadimos los caracteres de nos numero a una lista.
        //usamos a HAshSet porque no guarda numeros duplucados.
        Set<Character> digits = new HashSet<>();
        for (char c : longNumber.toCharArray()) {
            digits.add(c);
        }

        //imprimimos tomano de nuestra lista.
        System.out.printf("en este numero hay %d digitos diferentes: ",digits.size());
        System.out.println(digits); 
    }
}