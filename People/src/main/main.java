package main;

import People.People;
import PeopleService.PeopleService;

public class main {
    
    public static void main(String[] args) {
        // TODO code application logic here
     
        PeopleService ps = new PeopleService();
        People  perso[] = new People[4]; // creamos un array de persona para guardar los 4 elementos
        int[] imc = new int[4]; // un array para almacenar el resultado de cada elemento
        boolean[] edad = new boolean[4];// un array para almacenar si es mayor o no
        
        //declar contadores para hacesr los calculos posteriores 
        int conIdeal = 0, contPas = 0, contBaja = 0;
       
        for (int i = 0; i < 3; i++) { // un ciclo for para ir guardando las 4 personas
                perso[i] = ps.crearPersona(); //se crea la persona y se asigna en un elemento del array de Personas
                imc[i] = ps.calcularIMC(perso[i]); // se va a ir llenando el array del peso 
                
                switch  (imc[i]){ //hacemos un switch para traer el return del imc y mostrar 
                    case 0: 
                        System.out.println("la persona " + perso[i]+ " esta en su peso");
                       conIdeal++;
                    case 1:
                        System.out.println("la persona " + perso[i]+ " esta pasada de peso");
                        contPas++;
                    case -1:
                        System.out.println("la persona " + perso[i]+ " esta baja de peso");
                        contBaja++;
                }
        }
       
        
    }
    
}
/*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto,
deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal 
e indicar para cada objeto si la persona es mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, 
cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad
y cuantos menores. Para esto, podemos crear unos métodos adicionales.
