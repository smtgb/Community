/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soumita
 */
public class Faculty extends Employee {
    
    private int facultyCode;
    private String designation;
    private int joinYear;
    Faculty(String dept,String Inst,String n,String eId,double s,double i,int fc,String desig,int Jyear)
    {
        super(dept,Inst,n,eId,s,i);
        facultyCode=fc;
        designation=desig;
        joinYear=Jyear;
    }

    //Faculty() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    int getfacultyCode()
    {
        return facultyCode;
    }
    String getDesig()
    {
        return designation;
        
    }
    int getYear()
    {
        return joinYear;
    }
    //@Override
    void Show()
    {
        super.Show();
        System.out.println("Faculty Code: "+ getfacultyCode());
        System.out.println("Designation: "+ getDesig());
        System.out.println("Join Year: "+getYear());
    }

   /* void Show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
}
