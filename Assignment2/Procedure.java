/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: __________
*/
package assignment2;

public class Procedure {

    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charges;
    public Procedure() {
    }
    public Procedure(String name, String date) {
        procedureName = name;
        procedureDate = date;
    }
    public Procedure(String name, String date, String practitioner, double charges) {
        this.procedureName = name;
        this.procedureDate = date;
        this.practitionerName = practitioner;
        this.charges = charges;
    }
    public String getProcedureName() { return procedureName; }
    public void setProcedureName(String name) { procedureName = name; }
    public String getProcedureDate() { return procedureDate; }
    public void setProcedureDate(String date) { procedureDate = date; }
    public String getPractitionerName() { return practitionerName; }
    public void setPractitionerName(String practitioner) { practitionerName = practitioner; }
    public double getCharges() { return charges; }
    public void setCharges(double charges) { this.charges = charges; }
    public String toString() {
        return String.format("%-15s %-12s %-15s $%8.2f",
                procedureName, procedureDate, practitionerName, charges);
    }
}