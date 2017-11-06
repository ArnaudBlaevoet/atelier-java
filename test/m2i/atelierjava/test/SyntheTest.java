/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import junit.framework.Assert;
import m2iatelierjava.entite.Synthe;
import org.junit.Test;

public class SyntheTest {

    

    @Test
    public void testVolumePlusOK() {

        Synthe s = new Synthe();
  //    System.out.println(s.getVolume());
        s.volumePlus();
        s.volumePlus();
        s.volumePlus();
        s.volumePlus();
        s.volumePlus();
        s.volumePlus();
        Assert.assertEquals(10, s.getVolume());

    }

    @Test
    public void testAllumerOnOffOK() {
        
        Synthe s = new Synthe ();
        Assert.assertFalse(s.isOn());
        
        s.allumageOnOff();
        // Assert.assertTrue(s.isOn());   

        s.allumageOnOff();
        // Assert.assertFalse(s.isOn());   
    }
    @Test
    
    public void testJouerNoteOK(){
        
        Synthe synth = new Synthe();
        synth.jouerNote("FA#3");
        
    }
    
    @Test
    
    public void b() throws MidiUnavailableException, InterruptedException {
        
    Synthesizer synth = MidiSystem.getSynthesizer();
    
    synth.open();
    MidiChannel[] channels = synth.getChannels();
    Instrument[] intrus = synth.getDefaultSoundbank().getInstruments();
    channels[5].noteOn(30, 600);
    Thread.sleep(10000);
    
    
 //   public SyntheTest(){
        
    }    
        
}
