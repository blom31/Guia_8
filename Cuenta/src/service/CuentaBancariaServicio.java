/*Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario. *
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual. *
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. *
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package service;

import entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {

        CuentaBancaria cuenta = new CuentaBancaria(); //metodo crear cuenta. se utilizan los Set para asignar los valore

        
        System.out.print("Ingrese su número de Cuenta Bancaria ");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.print("Ingrese su Identificación ");
        cuenta.setDniCliente(leer.nextLong());
        System.out.print("Ingrese el saldo con el que se realiza la creación de la Cuenta Bancaria ");
        cuenta.setSaldoActual(leer.nextLong());

        return cuenta;
    }
    
    public void ingresar(CuentaBancaria cuenta){ //método Ingresar, lo que ingresa se le suma al saldo anterior con el geet
    
        System.out.print("Ingrese el monto del depósito ");
        cuenta.setSaldoActual(leer.nextDouble()+cuenta.getSaldoActual());
        
    }
    
    public void retirar(CuentaBancaria cuenta){
        
        System.out.print("Ingrese el monto a retirar ");
        double retiro=leer.nextDouble();
        if (retiro>cuenta.getSaldoActual()) {
            System.out.println("Se retiró " +cuenta.getSaldoActual()); 
            cuenta.setNumeroCuenta(0);
        }else {
            System.out.println("Se retiró " +retiro);
            cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
        }
    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
    
        System.out.println("Se retiró " + cuenta.getSaldoActual()*0.2);
        cuenta.setSaldoActual(cuenta.getSaldoActual()*0.8);
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("El saldo disponible es " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        
        System.out.println("Su número de cuenta es "+cuenta.getNumeroCuenta());
        System.out.println("Su número de DNI es "+cuenta.getDniCliente());
        System.out.println("Su saldo disponible en cuenta es "+cuenta.getSaldoActual());
    }
}
