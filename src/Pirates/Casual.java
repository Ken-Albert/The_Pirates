/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Pirates;

/**
 *
 * @author 69265
 */
public class Casual extends Pirate {
    int daysWorked;
    int rate;
    public void setDaysWorked(int days){
        daysWorked=days;
    }
public void setRate(int r){
    rate=r;
}
public double getDues(){
    return (daysWorked*rate);
}
}
