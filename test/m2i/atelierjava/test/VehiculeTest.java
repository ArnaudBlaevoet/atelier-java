/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2iatelierjava.entite.Avion;
import m2iatelierjava.entite.Sousmarin;
import m2iatelierjava.entite.Vehicule;
import org.junit.Test;
/**
 *
 * @author Administrateur
 */
public class VehiculeTest {
    @Test
    public void testAvion(){
       
        Avion a = new Avion("Boeing", false, "457", "blanc", 200, 0, 0, 0, 600);
        
        a.avancer();
        a.afficher();
    }
    
//    @Test
   public void testVehicule(){
       
       
       Vehicule vehicl = new Vehicule("Ferrari", true, "F-50", "rouge", 2 , 0, 0, 0, 100);
       Vehicule vehic2 = new Vehicule("Renault", true, "R-4", "blanche", 4, 0, 1, 0, 100);
       vehicl.afficher();
       vehicl.avancer();
       vehicl.afficher();
       
   }
   
   @Test
   public void testSousmarin(){
       
        Sousmarin a = new Sousmarin("Alsthom", false, "Rubis", "Noir", 200, 0, 0, 0, -50);
        
        a.setMonte(false);
        a.afficher();
        a.avancer();
        a.afficher();
   }
}
