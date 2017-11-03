/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2iatelierjava.entite;

/**
 *
 * @author Administrateur
 */
public class Sousmarin extends Vehicule{
    
    private boolean monte;
    

    public boolean isMonte(){
        
        return monte;
        
                
    }

    public void setMonte(boolean monte) {
        this.monte = monte;
       
    }
    
    
    
    public Sousmarin(String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int vitesse) {
        super(marque, utilitaire, modele, couleur, nbPlaces, x, y, z, vitesse);
        
    }
    
    
  

    @Override
    public void avancer() {
        
       super.avancer(); //To change body of generated methods, choose Tools | Templates.
       
       if (monte==true){
       
        y = y + pas/2;
       }
       else {
       y = y - pas/2;
       
       
       }
       
        
        
        
                
    }
    
    
    
    
}
