package com.example;

public class Main { 
    public static void main(String[] args) {
        System.out.println("");{}

        Scanner Scanner = new Scanner(System.in);
        System.out.println("ingrese el valor de su compra en pesos");
        double cantidadCompra = scanner.nextDouble();

        int puntosAcumulados = (int) (cantidadCompra/10);
        System.out.println("Puntos acumulados: " + puntosAcumulados);

        String nivelFidelizacion;
        if (puntosAcumulados <= 100) {nivelFidelizacion = "bronce";}
        else if (puntosAcumulados <= 500) {nivelFidelizacion = "plata";}
        else if (puntosAcumulados <= 1000) {nivelFidelizacion = "oro";}
        else {nivelFidelizacion = "platino";}
        System.out.println("nivel de fidelizacion" + nivelFidelizacion);
        
        if (nivelFidelizacion.equals("oro")|| nivelFidelizacion.equals("platino"))
        {System.out.println("¡felicidades! has recibido un descuento adicional del 10%.")}

        if (nivelFidelizacion.equals("bronce")) 
        {double descuento = cantidadCompraCompra * 0.04;
        System.out.println("ganaste un descuento del 4% en esta compra---("+ descuento + "pesos)");}

        if (nivelFidelizacion.equals("plata"))
        {double descuento = cantidadCompraCompra * 0.07;
         System.out.println("ganaste un descuento del 7% en esta compra---("+ descuento + "pesos)") }

        if (nivelFidelizacion.equals("platino"))
        {System.out.println("---¡felicidades! ganaste un cupon para un producto adicional gratuito");}

        scanner.close();

    }
}