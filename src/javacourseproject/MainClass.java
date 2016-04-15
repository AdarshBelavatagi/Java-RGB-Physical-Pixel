/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourseproject;

import processing.core.PApplet;

/**
 *
 * @author prajankya
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            PApplet.main(new String[] { "--present", "javacourseproject.LaunchApplet" });
        } catch (Exception e) {

        }
    }
}
