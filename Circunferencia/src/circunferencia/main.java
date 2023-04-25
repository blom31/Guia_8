/*/*Declarar una clase llamada main que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase main.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).*/

package circunferencia;

import entidad.Circun;
import service.CircunServicio;

public class main {
    public static void main(String[] args) {
        
        CircunServicio circu = new CircunServicio();//se declara unavariable con el paquete de serv, 
        Circun circunfe = circu.crearCircu();//luego con la entidad se crea una variable asociada a la variable nueva de serv. la de arriba
        
        circu.area(circunfe);
        circu.perimetro(circunfe);
        
        
       
        
    }
    
}
