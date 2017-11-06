/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class CollectionTest {
    
@Test
public void testList(){

   List<String> listeFilms = new ArrayList<>();
   
   listeFilms.add("Dracula");
   listeFilms.add("matrix");
   listeFilms.add("Winnie L'Ourson");
  
   
    for (String film : listeFilms) {
        
        System.out.println( film );
     
        
    }

}

@Test

public void testSommeListeFranceBelgiquePluslisteEspagneItalieTotaOK (){
    
    List<String> ListeFrBe = new ArrayList<>();
    List<String> ListeEspIt = new ArrayList<>();
    
    ListeFrBe.add("Belgique");
    ListeFrBe.add("France");      
    
    ListeEspIt.add("Espagne");
    ListeEspIt.add("Italie");
  
    List<String> listeTotale.size();
    assert.assertEquals(4, nbElem)
            
    
}

}




    
        
    
   
    


