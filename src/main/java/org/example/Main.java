package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double temperauraAmbiente;
        System.out.print("Digite la temperatura: ");
        temperauraAmbiente = teclado.nextDouble();
        if (temperauraAmbiente == 20.0) {
            temperauraAmbiente = 25.0;
        } else if (temperauraAmbiente == 30) {
            temperauraAmbiente = 20.0;
        } else if (temperauraAmbiente == 40) {
            temperauraAmbiente = 20.0;
        } else {
            System.out.println("señor usuario digite la temperatura que desea");
            temperauraAmbiente=teclado.nextDouble();
        }
        System.out.println("apreciado usuario su temperatura cambio a " + temperauraAmbiente);
    }
}