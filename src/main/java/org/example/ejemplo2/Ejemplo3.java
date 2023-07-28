package org.example.ejemplo2;

import java.util.Scanner;

public class Ejemplo3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double temperaturaAmbiente=teclado.nextDouble();
        String temperaturaComoTexto=String.valueOf(temperaturaAmbiente);
        switch (temperaturaComoTexto) {

            case "20":
                temperaturaAmbiente=25;
                break;
            case "30":
                temperaturaAmbiente=20;
                break;
            case "40":
                temperaturaAmbiente=20;
                System.out.println("se esta muriendo perro");
                break;
            default:
                System.out.println("el camino por defecto");
                System.out.println("no es ni 0, ni 10 ni 100");
                break;


        }
    }
}
