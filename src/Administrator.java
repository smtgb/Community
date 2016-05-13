/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soumita
 */
public class Administrator extends Faculty {
    
    private String position;
    private double duration;
    Administrator(String dept,String Inst,String n,String eId,double s,double i,int fc,String desig,int Jyear,String pos,double time)
    {
        super(dept,Inst,n,eId,s,i,fc,desig,Jyear);
        position=pos;
        duration=time;
    }

    //Administrator() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    String getPos()
    {
        return position;
    }
    double getDuration()
    {
        return duration;
    }
    @Override
    void Show()
    {
        super.Show();
        System.out.println("Position: "+ getPos());
        System.out.println("Duration: "+getDuration());
        
}
    
}
