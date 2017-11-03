/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iatelierjava.entite;

import java.util.Date;

/**
 *
 * @author Administrateur
 */
public class Serie {
  
    private String titre;
    private String synopsis;
    private int nbSaisons;
    private int anneeSortie;

    public void initialise(String titre, String synopsis, int nbSaisons, int anneeSortie){
    
        this.titre = titre;
        this.synopsis = synopsis;
        this.nbSaisons = nbSaisons;
        this.anneeSortie = anneeSortie;
        
    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getNbSaisons() {
        return nbSaisons;
    }

    public void setNbSaisons(int nbSaisons) {
        this.nbSaisons = nbSaisons;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }
    
    public void affiche (){
    
     System.out.println(titre+" "+synopsis+" "+nbSaisons+" "+anneeSortie);
           
    }
            
        
    

    
    
}
