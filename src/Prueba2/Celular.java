/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Prueba2;

/**
 *
 * @author Carlos Gochez
 */
public class Celular {
    protected int numCell;
    protected double precioxMin;
    protected double precioxMsg;

    public Celular(int nc,double pmin,double pmsg){
        numCell = nc;
        precioxMin = pmin;
        precioxMsg = pmsg;
    }

    public double totalFinal(int cmin,int cmsgs){
        double st = (cmin*this.precioxMin) +
                    (cmsgs * this.precioxMsg);
        double finalp = st + (st*0.12);
        return finalp;
    }
}
