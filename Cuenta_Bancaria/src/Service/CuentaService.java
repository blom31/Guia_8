package Service;

import Entidad.Cuenta;
import java.util.Scanner;

public class CuentaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static final String red = "\u001B[31m"; // se crean unas constantes con valores para dar color a las impresiones donde se coloquen
    public static final String cian = "\u001B[36m";
    public static final String blue="\033[34m";
    public static final String green="\033[32m"; 
    public static final String purple="\033[35m";
    
    
    //Método para crear cuenta pidiéndole los datos al usuario.
    public Cuenta crearCuenta() {
        
       
        //instancio el objeto de clase Cuenta
        Cuenta c1 = new Cuenta();

        System.out.println(cian + " ***  * * * CREAR CUENTA * * *  ***");
        System.out.print("Ingrese el número de Cuenta: ");
        c1.setNumCuenta(leer.nextInt()); //asigno el valor del número de cuenta mediante el método Set

        System.out.print("Ingrese en DNI asociado a Cuenta: ");//asigno el valor del DNI asociado a la cuenta mediante el método Set
        c1.setDniCliente(leer.nextLong());

        System.out.print("Ingrese el saldo con el que se inicia la Cuenta: ");//asigno el valor del Saldo de cuenta mediante el método Set
        c1.setSaldoActual(leer.nextDouble());
        System.out.println("");

        return c1;// devuelo el objeto con todos los datos seteados
    }
    
    //Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    public void ingresarSaldo(Cuenta c1) { // paso por parametros el objeto creado para poder modificar el valaor del saldo
        
        System.out.println(cian +" ***  * * * INGRESAR SALDO  * * *  ***");

        System.out.println( green + "Saldo Actual: " + c1.getSaldoActual());// muestro en pantalla el saldo actual

        System.out.print("Ingrese el monto a depositar: ");
        c1.setSaldoActual(leer.nextDouble() + c1.getSaldoActual()); // con el set seteo el nuevo saldo y con el get traigo lo guardado y sumo 

        System.out.println("");
        System.out.println(green + "Saldo Actualizado: " + c1.getSaldoActual());// muestro en Pantalla el nuevo saldo
        System.out.println("");
    }

    //Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad
    // de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    public void retirar(Cuenta c1) {
        Double retiro;
        System.out.println(cian +" ***  * * * RETIRAR SALDO  * * *  ***");

        System.out.println(cian + "SALDO ACTUAL " + c1.getSaldoActual());// muestro en pantalla el saldo actual

        System.out.print("Ingrese el monto que desea retirar ");
        retiro = leer.nextDouble(); // guardo el monto a retirar en una variable para poder manipular y comparar

        if (retiro > c1.getSaldoActual()) {
            System.out.println(red + "USTED RETIRARÁ TODO¡¡"); // si el saldo es mayor, se retira todo la cuenta queda en 0
            c1.setSaldoActual(0.00);
        } else {
            System.out.println(red + "Usted retiró " + retiro);// sino se hace efectivo el retiro y se muestra por pantalla
            c1.setSaldoActual(c1.getSaldoActual()-retiro); // se actualiza el nuevo saldo
        }
        System.out.println(green + "Saldo Actualizado: " + c1.getSaldoActual());// muestro en Pantalla el nuevo saldo
        System.out.println("");
    }
    //Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    
    public void extraccionR(Cuenta c1){
        System.out.println(cian +" ***  * * * EXTRACIÓN RÁPIDA  * * *  ***");
        System.out.println(" ***  * * * SOLO EL 20% PERMITIDO  * * *  ***"); // no hay operación por parte del usuario solo se extrae de forma automática el 20% de su cuenta
        
        System.out.println(red + "Se retiró: " + c1.getSaldoActual()*0.20);
        c1.setSaldoActual(c1.getSaldoActual()*0.8);
        
        System.out.println(green + "Saldo Actualizado: " + c1.getSaldoActual());// muestro en Pantalla el nuevo saldo
        System.out.println("");        
    }
    // Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta
    
    public void consultaS(Cuenta c1){
         System.out.println(cian+" ***  * * * CONSULTA DE SALDO  * * *  ***");
         
        System.out.println(green + "Su saldo actual es de: " + c1.getSaldoActual());
        System.out.println("");
    }
    /**. Método consultarDatos: permitirá  mostrar todos los datos de la cuenta.
 */
    public void consultarDatos(Cuenta c1){
         System.out.println(cian +" ***  * * * CONSULTA DE DATOS * * *  ***");
         
        System.out.println("Su número de cuenta es "+c1.getNumCuenta());
        System.out.println("Su número de DNI es "+c1.getDniCliente());
        System.out.println(green+"Su saldo disponible en cuenta es "+c1.getSaldoActual());
    }
}

