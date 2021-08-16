package tasks;

import java.util.Scanner;

public class Task1 {
    public static int second(int muscleMass) {
        return muscleMass * 2 + 4;
    }

    public static int third(int muscleMass, int second) {
        return Math.floorDiv((muscleMass + second), 5);
    }

    public static String category(int third) {
        if (third < 20)
            return "uno";
        else if (third < 30)
            return "dos";
        else if (third < 50)
            return "tres";
        else
            return "cuatro";
    }

    public Task1() {
        Scanner scan = new Scanner(System.in);

        int muscleMass = scan.nextInt();
        int secondTest = second(muscleMass);
        int thirdTest = third(muscleMass, secondTest);

        String out = muscleMass + " " + secondTest + " " + thirdTest;
        String category = category(thirdTest);

        System.out.println(out);
        System.out.println(category);
    }
}

/**
 // Submited

 import java.util.Scanner;

 public class Main {
     public static int second(int muscleMass) {
        return muscleMass * 2 + 4;
     }

     public static int third(int muscleMass, int second) {
        return Math.floorDiv((muscleMass + second), 5);
     }

     public static String category(int third) {
         if (third < 20)
            return "uno";
         else if (third < 30)
            return "dos";
         else if (third < 50)
            return "tres";
         else
            return "cuatro";
     }

     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         int muscleMass = scan.nextInt();
         int secondTest = second(muscleMass);
         int thirdTest = third(muscleMass, secondTest);

         String out = muscleMass + " " + secondTest + " " + thirdTest;
         String category = category(thirdTest);

         System.out.println(out);
         System.out.println(category);
     }
 }
 */

/*
 // TASK
 
Empacadora de tornillos, puntillas y tachuelas. 

Una máquina empacadora automática necesita determinar el tamaño de la bolsa en la que debe empaquetar el grupo de suministros de ferretería que sigue en la banda, para esto necesita determinar el número de cada tipo de suministro. Sin embargo, por restricciones tecnológicas la máquina solo puede contar uno de los tipos de suministros, las puntillas. 

En este punto lo contratan a ud para escribir un programa que le ayude a la máquina a decidir el tipo de bolsa que usará dado el número de puntillas del grupo. La compañía le informa que los grupos están compuestos de 3 tipos de suministros (tornillos, puntillas y tachuelas), luego le explican que las tachuelas de un grupo son 2 veces el número de puntillas con 4 agregadas al final y los tornillos son un quinto de la suma del número de las puntillas y las tachuelas (usando solo la parte entera del resultado de la división).

 La máquina dispone de 4 tamaños de paquetes. La compañía mide la capacidad de los paquetes en tornillos por grupo y los empaca en un paquete de tamaño “uno” si hay entre 0 y 20 tornillos, tamaño “dos” si hay entre 21 y 30, tamaño “tres” si hay entre 31 y 50 tornillos y tamaño “cuatro” sí hay más de 50 tornillos.

 Las últimas especificaciones dicen que su programa debe recibir el número de puntillas del grupo y realizar los cálculos correspondientes para imprimir el número de puntillas, tachuelas y tornillos en una línea, además del tamaño del paquete en la línea siguiente en texto.

 En el ejemplo la máquina detectó 25 puntillas con el sensor. 

ENTRADA  |  SALIDA
---------┼-----------
25       | 25 54 15
         | uno
*/
