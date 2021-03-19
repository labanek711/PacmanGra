package com.company;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


public class Muzyka {
    public static void soundtrack() {
        File soundtrack = new File("./Muzyka/bgmuza.wav");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundtrack);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

        } catch (UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}

