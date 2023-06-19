package PeopleService;

import People.People;
import java.util.Scanner;

public class PeopleService {
    
    public static final String red = "\u001B[31m"; // se crean unas constantes con valores para dar color a las impresiones donde se coloquen
    public static final String cian = "\u001B[36m";
    public static final String blue="\033[34m";
    public static final String green="\033[32m"; 
    public static final String purple="\033[35m";
    String reset="\u001B[0m";
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    People p1 = new People();
    
/*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
después se le asignan a sus respectivos atributos para llenar el objeto Persona.
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje*/
    
    public People crearPersona(){
        
        System.out.println(cian + " *** CREAR PERSONA***");
        
        char sexo;
        System.out.print(reset + "Ingrese el nombre de la Persona: ");
        p1.setNombre(leer.next());
        
        System.out.print("¿Qué edad tiene? ");
        p1.setEdad(leer.nextInt());
        
        do {
            System.out.print("Sexo de la Persona ‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro: ");
            sexo = leer.next().charAt(0);
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        p1.setSexo(sexo);            
          
        System.out.print(reset + "Ingrese el peso de la Persona: ");
        p1.setPeso(leer.nextDouble());
        
        System.out.print("Ingrese la Altura de la Persona: ");
        p1.setAltura(leer.nextDouble());
        
        return p1;
    }
    
    //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public boolean esMayorEdad(People p1){
        boolean edad = false;
        
        if (p1.getEdad()>=18) {
            edad=true;
        }
    return edad;  
    }
    
   /* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
    Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y 
    la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que
    25 significa que la persona tiene sobrepeso, y la función devuelve un 1.*/
    public int calcularIMC(People p1){
   
        double peso;
        
    peso = p1.getPeso()/ (Math.pow(p1.getAltura(),2));
    
        if (peso < 20 ) {
            return  -1;
        }else if (peso >= 20 && peso <=25){
            return 0;
            }else 
            return 1;
    }
}

