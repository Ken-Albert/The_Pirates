/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Pirates;

/**
 *
 * @author 69265
 */
public class Pirate {
    String name;
    int pirateNumber;
    String dateOfBirth;
    String dateOfHire;
    public void setDetails(String n, int pNo, String dob, String doe){
        name= n;
        pirateNumber=pNo;
        dateOfBirth=dob;
        dateOfHire=doe;
    }
public String getName(){
    return name;
}
public int getPirateNumber(){
    return pirateNumber;
}
public String getDateOfBirth(){
    return dateOfBirth;
}
public String getDateOfEmployment(){
    return dateOfHire;
}
public double getDues(){
    return 0;
}
public String getRapSheet(){
String report;
report="Name: " + name + "\nNo.: " + pirateNumber + "\nDoB: " + dateOfBirth
        + "\nDoE: " + dateOfHire + "\nDues: " + getDues() + " gems";
return report;
}
}
