package Main;

import Entidad.Cuenta;
import Service.CuentaService;
import java.util.Scanner;

public class Cuenta_Bancaria {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String blue = "\033[34m";
        String red = "\u001B[31m";

        CuentaService cs = new CuentaService();//accedo a la Clase servicio para ejecutar los métodos
        Cuenta cuenta1 = new Cuenta();// de esta manera accedo a los parámeros
        cuenta1 = cs.crearCuenta();

        String resp = "";
        int var;
        do {
            System.out.println(blue + "***  * * * M E N Ú * * *  ***");
            System.out.println("");
            System.out.println(blue + "*1.-  * * * D E P O S I T A R* * *  ***");
            System.out.println(blue + "*2.-  * * * R E T I R A R * * *  ***");
            System.out.println(blue + "*3.-  * * * E X T R A C I Ó N  R Á P I D A  * * *  ***");
            System.out.println(blue + "*4.-  * * * C O N S U L T A  S A L D O * * *  ***");
            System.out.println(blue + "*5.-  * * * C O N S U L T A  D A T O S  * * *  ***");
            System.out.println(blue + "*6.-  * * * S A L I R * * *  ***");
            var = leer.nextInt();

            switch (var) {
                case 1:
                    cs.ingresarSaldo(cuenta1);
                    break;
                case 2:
                    cs.retirar(cuenta1);
                    break;
                case 3:
                    cs.extraccionR(cuenta1);
                    break;
                case 4:
                    cs.consultaS(cuenta1);
                    break;
                case 5:
                    cs.consultarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("Está seguro que desea finalizar? S/N");
                    resp = leer.next();
                    
                    while (!resp.equalsIgnoreCase("S") && !resp.equalsIgnoreCase("N")) {
                        System.out.print("Ingrese S si desea agregar o N para finalizar: ");
                        resp = leer.next();
                        leer.nextLine();
                    }
            }
        } while (!resp.equalsIgnoreCase("S"));

    }

}
