/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pirates;

/**
 *
 * @author 69265
 */
public class MainClass {

    public static void main(String[] args) {
        Pirate[] crewMembers = new Pirate[5];

        Pirate jack = new Pirate();
        jack.setDetails("Jack Sparrow", 1001, "4th June 1882", "16th April 1921");
        crewMembers[0] = jack;

        Crew barbossa = new Crew();
        barbossa.setDetails("Hector Barbossa", 1002, "15 December 1880", "5th March 1925");
        barbossa.setLootAmount(50000);
        crewMembers[1] = barbossa;

        Crew swann = new Crew();
        swann.setDetails("Elizabeth Swann", 1230, "3rd March 1906", "6th January 1931");
        swann.setLootAmount(2000);
        crewMembers[2] = swann;

        Casual gibbs = new Casual();
        gibbs.setDetails("Joshamee Gibbs", 1010, "7th June 1879", "18th April 1921");
        gibbs.setDaysWorked(1200);
        gibbs.setRate(2);
        crewMembers[3] = gibbs;

        Casual dalma = new Casual();
        dalma.setDaysWorked(7);
        dalma.setRate(100);
        dalma.setDetails("Tia Dalma", 1003, "Unknown", "Unknown");
        crewMembers[4] = dalma;
        for (int x = 0; x < 5; x++) {
            System.out.println("\n" + crewMembers[x].getRapSheet());
        }
    }
}
