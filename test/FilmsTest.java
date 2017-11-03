
import java.util.Date;
import m2iatelierjava.entite.Film;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author Administrateur
 */
public class FilmsTest {
    
    @Test
    public void nouveauFilm() {
        
        Film f1 = new Film();
        
        Film f2 = new Film();
        
        f1.initialise("Dracula", "résumé", 1978, new Date());
        f2.initialise("Kung Fu Panda", "résumé", 1972, new Date());
 
        
        f1.affiche();
        f2.affiche();
    
        
    }
        
            
   
 
    
}
