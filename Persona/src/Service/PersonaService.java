/*En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal 
y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que 
la persona tiene sobrepeso, y la función devuelve un 1.
 */
package Service;

import entidad.Persona;
import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Este método crea la persona, se define las variables y se devuelve el objeto persona con sus atributos
    public Persona crearPersona() {
        Persona pers = new Persona();

        System.out.println("Crear Persona");
        System.out.print("Ingrese su nombre: ");
        pers.setNombre(leer.next());
        System.out.print("Ingrese la edad de  " + pers.getNombre() + ":");
        pers.setEdad(leer.nextInt());
        System.out.print("Ingrese el sexo: H/M/O ");
        pers.setSexo(leer.next());

        while (!pers.getSexo().equalsIgnoreCase("H") && !pers.getSexo().equalsIgnoreCase("M") && !pers.getSexo().equalsIgnoreCase("O")) {
            System.out.println("Caracter incorrecto, Ingrese nuevamente el sexo (H|M|O) ");
            pers.setSexo(leer.next());
        }

        System.out.print("Ingrese su peso ");
        pers.setPeso(leer.nextDouble());
        System.out.print("Ingrese su altura ");
        pers.setAltura(leer.nextDouble());
        System.out.print("Ingrese su nacionalidad: ");
        pers.setNacionalidad(leer.next());

        return pers;
    }

    public boolean esMayorDeEdad(Persona pers) {
        boolean edad;

        edad = pers.getEdad() > 18;
        return edad;

    }

    /* calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
  Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal 
  y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
  está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que 
  la persona tiene sobrepeso, y la función devuelve un 1.*/
    public double calcularIMC(Persona pers) {

        double pesoIdeal;
        int result;

        System.out.println("Calcular IMC");
        pesoIdeal = pers.getPeso() / Math.pow(pers.getPeso(), 2);

        if (pesoIdeal < 20) {
            System.out.println(pers.getNombre() + " Está por debajo de su peso ideal");
            result = -1;
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            System.out.println(pers.getNombre() + " Está en su peso ideal");
            result = 0;
        } else {
            System.out.println(pers.getNombre() + " Está por encima de su peso ideal");
            result = -1;
        }
        return result;
    }
}
