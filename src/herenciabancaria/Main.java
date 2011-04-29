/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package herenciabancaria;

import BancaJava.*;

/**
 *
 * @author Carlos Gochez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //upcasting
        CuentaBancaria cb = new CuentaPersonal(1);
        cb.imprimir();

        //downcasting
        CuentaPersonal cp = (CuentaPersonal)cb;
        cp.isActivo();
        //downcasting directo
        ((CuentaPersonal)cb).isActivo();
        
        //averiguar de que tipo es
        if( cb instanceof CuentaPlazoFijo ){
            System.out.println("weee es plazo fijo");
        }
        else{
            System.out.println("noo no es plazo fijo");
        }
     }

}
