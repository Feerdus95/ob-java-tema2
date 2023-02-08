package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double precioBase, IVA;

        System.out.println("Ingrese el precio: ");
        precioBase = sc.nextDouble();
        IVA = getPrecioIVA(precioBase);

        System.out.println("El valor del IVA es de: " +getPrecioIVA(precioBase));
        System.out.println("El valor final con IVA incluído es de: " +(precioBase+IVA));

    }
    static double getPrecioIVA(double precio){
        double valorIVA;
        valorIVA = precio*0.21;
        return valorIVA;
    }
}