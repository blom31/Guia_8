/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nesspreso;

import entidad.Cafetera;
import java.util.Scanner;
import service.CafeteraServicio;

public class main {

    public static void main(String[] args) {

        CafeteraServicio taza = new CafeteraServicio();

        Cafetera cafe = new Cafetera(1000, 1000);
        taza.llenarCafetera(cafe);

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la medida de la taza");
        double servir = leer.nextDouble();
        
        taza.servirTaza(cafe, servir);

        System.out.println("Ingrese la cantidad de café que desea para la cafetera");
        double cantidad = leer.nextDouble();
        
        taza.agregarCafe(cafe, cantidad);
        
        System.out.println(cafe.toString());

    }

}
