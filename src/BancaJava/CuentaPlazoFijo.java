/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BancaJava;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Carlos Gochez
 */
public class CuentaPlazoFijo extends CuentaBancaria{
    private Date caducidad;
    private double intereses;
    public static double TASAPLAZOFIJO = 0.15;
    public static double MONTO_MINIMO = 10000;

    public CuentaPlazoFijo(int nc){
        super(nc,TASAPLAZOFIJO);
        setFechaCaducidad();
        saldo = MONTO_MINIMO;
        intereses = 0;
    }

    /**
     * Funcion para inicializar la fecha de caducidad, todos los
     * datos se pediran del teclado
     */
    private void setFechaCaducidad() {
        Scanner lea = new Scanner(System.in);
        System.out.print("Año: ");
        int year = lea.nextInt();
        System.out.print("Dia: ");
        int dia = lea.nextInt();
        System.out.print("Mes: ");
        int mes = lea.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year, mes - 1, dia);
        caducidad = c.getTime();
    }

    @Override
    public double getSaldo(){
        return saldo + intereses;
    }

    public double getIntereses(){
        return intereses;
    }

    @Override
    public void registrarIntereses(){
        Date now = new Date();

        if( now.getTime() < caducidad.getTime() ){
            intereses += saldo * tasa;
        }
    }

    @Override
    public void deposito(double monto){
        Date now = new Date();

        if( now.getTime() > caducidad.getTime() ){
            //esta caducada y puedo agregar mas
            saldo += monto;
        }
        else{
            System.out.println("CUENTA AUN NO CADUCADA");
        }
    }

}
