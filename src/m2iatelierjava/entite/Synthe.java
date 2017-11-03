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
public class Synthe {
   
    private boolean on;
    private String instrument;
    private int volume;

    
        
    
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Synthe(boolean on, String instrument, int volume) {
        this.on = on;
        this.instrument = instrument;
        this.volume = volume;
    }
    
    public void allumageOnOff(boolean On){
        
        if (On == false){
           on = true;
           instrument ="piano";
           volume = 5;
        } else {
           on = false;
       
        }
        
            
        }
        
    public void volumePlus(){
            
            if (volume < 10)
            
            volume = volume + 1;
            
        }
                   
        public void volumeMoins(){

            if (volume >0)

              volume --;
        }
    public void jouerNote ();
    
            
    

}
