/*Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos:
numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
 */
package Entidad;

public class Cuenta {
    
    //atributos:
    Integer numCuenta;
    Long dniCliente;
    Double saldoActual;

    //constructor vacío
    public Cuenta() {
    }
    //constructor con parámetros
    public Cuenta(Integer numCuenta, Long dniCliente, Double saldoActual) {
        this.numCuenta = numCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
    //getters y setters.

    public Integer getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(Long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", dniCliente=" + dniCliente + ", sasldoActual=" + saldoActual + '}';
    }
    
    
    
}
