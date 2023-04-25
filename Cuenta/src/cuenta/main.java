/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this templat
 */
package cuenta;

import entidad.CuentaBancaria;
import service.CuentaBancariaServicio;

public class main {

    
    public static void main(String[] args) {
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria cuenta1= cbs.crearCuenta();
        
        cbs.ingresar(cuenta1);
        cbs.retirar(cuenta1);
        cbs.extraccionRapida(cuenta1);
        cbs.consultarSaldo(cuenta1);
        cbs.consultarDatos(cuenta1); 
    }
    
}
