/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Pirates;

/**
 *
 * @author 69265
 */
public class Crew extends Pirate {
    int lootAmount;
    public void setLootAmount(int l){
        lootAmount=l;
    }
public double getDues(){
    double dues;
    dues=(lootAmount*0.05)+5;
    return dues;
}
}
