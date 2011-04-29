/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Prueba2;

/**
 *
 * @author Carlos Gochez
 */
public class SmartPhone extends Celular{
    private boolean tieneInternet;

    public SmartPhone(int nc,double pmin,double pmsgs){
        super(nc,pmin,pmsgs);
        tieneInternet = false;
    }

    @Override
    public double totalFinal(int cmins,int cmsgs){
        double finalp = super.totalFinal(cmins, cmsgs);
        finalp += tieneInternet ? 100 : 0;
        return finalp;
    }
}
