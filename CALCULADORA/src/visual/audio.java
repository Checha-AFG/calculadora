
package visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class audio {

    
    File wavFile;
    static URL defaultSound;
    public static Clip clip;
    public static AudioInputStream audioInputStream;
    static String s="file:C:\\UMG\\CUARTO SEMESTRE\\PROGRAMACION 2\\CALCULADORA\\ext\\song.wav";
    
    
        public static void play() {
            
           try{
               defaultSound = new URL (s);
            audioInputStream = AudioSystem.getAudioInputStream(defaultSound);

            try {
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();

            } catch (LineUnavailableException e) {
            }

        } catch (UnsupportedAudioFileException | IOException e) {
        }
    }

    public static void stop() {
        clip.stop();
    }

  
  
    
}
