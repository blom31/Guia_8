/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).*/
package service;

import entidad.Circun;
import java.util.Scanner;


public class CircunServicio {
    
   private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circun crearCircu(){
         Circun micircu = new Circun();
         
         System.out.println("Ingrese el radio para poder calcular el área y el perímetro ");
         micircu.setRadio(leer.nextDouble());
        /*double radio = leer.nextDouble();
        return new Circun(radio); otra opción se de clara una varianñe no se usa eñ set
         y se para un retorno con los paramtros*/
        return micircu;
    }  
// Math.PI * Math.pow(radio,2);
    
    public void area(Circun micircu){//por parametros la entidad y la nueva variable de la entidad 
        
       double area = Math.PI*Math.pow(micircu.getRadio(), 2);
        System.out.println("El área del círculo es " + area);
    }
    
    //2 * Math.PI * radio; perimetro
    
    public void perimetro(Circun micircu){
        
        double perimetro = 2*Math.PI*micircu.getRadio();
        System.out.println("El perimetro del círculo es "+perimetro);
    }
    
    
}
