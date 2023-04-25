/*Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza,
se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package service;

import entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarCafetera(Cafetera cafe) {

        cafe.setCantidadActual(cafe.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera cafe, double taza) {

        if (cafe.getCantidadActual() >= taza) {
            cafe.setCantidadActual(cafe.getCantidadActual() - taza);
            System.out.println("Su taza está llena");
        } else {
            System.out.println("Su taza se llenó con  " + cafe.getCantidadActual());
            vaciarCafetera( cafe); // se llama el método vaciar cafetera
        }
    }
    
    //Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    public void vaciarCafetera(Cafetera cafe){
        
        cafe.setCantidadActual(0);
    }
    
    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera cafe,double cantidad){
        
        cafe.setCantidadActual(cantidad);
    }
    
}
