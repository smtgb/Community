/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Soumita
 */
public class UniversityHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Community F,T,A;
        F = new Faculty("cse","buet","n","e",10000,1500,20,"Lecturer",2010);
        T = new Teacher("cse","buet","n","e",10000,1500,20,"Lecturer",2010,234,3);
        A = new Administrator("cse","buet","n","e",10000,1500,20,"Lecturer",2010,"First",5);
        
        T.Show();
        A.Show();
        
    }
    
}
