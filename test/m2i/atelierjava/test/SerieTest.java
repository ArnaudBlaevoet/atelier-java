package m2i.atelierjava.test;


import m2iatelierjava.entite.Serie;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author Administrateur
 */
public class SerieTest {
    
    @Test
    public void nouvelleSerie() {
        
        Serie f1 = new Serie();
        
        Serie f2 = new Serie();
        
        f1.initialise("Dexter", "résumé", 8, 2010);
        f2.initialise("Game Of Thrones", "résumé", 7, 2011);
        
        
        
        f1.affiche();
        f2.affiche();
    }
        
            
   
 
    
}
