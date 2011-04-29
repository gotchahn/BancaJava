/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BancaJava;

/**
 *
 * @author Carlos Gochez
 */
public class CuentaPersonal extends CuentaBancaria{
    private boolean activo;
    public static double TASAPERSONAL = 0.08;

    public CuentaPersonal(int nc){
        super(nc,TASAPERSONAL);
        activo = true;
    }

    public boolean isActivo(){
        return activo;
    }

    /**
     * Esta funcion deposita un monto dentro del saldo
     * si la cuenta esta activa simplemente se acumula el monto,
     * si la cuenta esta inactiva se re activa y se cobra un 5% sobre
     * el monto depositado por conceptos de gastos de re-activacion
     * @param m -> Monto a depositar
     */
    @Override
    public void deposito(double m){
        if( !activo ){
            activo = true;
            m = m * 0.95;
        }
        saldo += m;
    }

    @Override
    public void imprimir(){
        System.out.println("Soy personal");
    }
}
