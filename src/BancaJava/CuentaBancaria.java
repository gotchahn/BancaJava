/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BancaJava;

import java.util.Date;

/**
 *
 * @author Carlos Gochez
 */
public class CuentaBancaria {
    protected int numCuenta;
    protected Date apertura;
    protected double tasa;
    protected double saldo;

    public CuentaBancaria(int nc,double t){
        numCuenta = nc;
        tasa = t;
        saldo = 0;
        apertura = new Date();
    }

    public void setTasa(double t){
        tasa = t;
    }

    public int getNumeroCuenta(){
        return numCuenta;
    }

    public double getTasa(){
        return tasa;
    }

    public Date getApertura(){
        return apertura;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposito(double monto){
        saldo += monto;
    }

    public void imprimir(){
        System.out.printf("El numero de cuenta es %d y tiene un saldo de %f \n",
                numCuenta,saldo);
        System.out.println("La Fecha de apertura es: " + apertura.toString());
    }

    public void registrarIntereses(){
        saldo += saldo * tasa;
    }
}






