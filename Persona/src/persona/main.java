/*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto,
deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para
cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para 
después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, 
por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.*/
package persona;

import Service.PersonaService;
import entidad.Persona;


public class main {
    public static void main(String[] args) {
       
        PersonaService gente = new PersonaService();
        Persona people1 = gente.crearPersona();
        Persona people2 = gente.crearPersona();
        Persona people3 = gente.crearPersona();
        Persona people4 = gente.crearPersona();
        
        gente.esMayorDeEdad(people1);
        gente.calcularIMC(people1);
        
 
        
        //System.out.println(people.toString());
    }
    
}
