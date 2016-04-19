package JavaRGBPhysicalPixel;

import processing.core.PApplet;

/**
 *
 * @author prajankya
 */
public class MainClass {

    public static final String LINE = "--------------------------------------------------\n";
    public static String comPort;
    public static int RED;
    public static int GREEN;
    public static int BLUE;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        comPort = "/dev/ttyACM0";
        RED = 11;
        GREEN = 10;
        BLUE = 9;

        if (args.length == 0) {
            System.out.println("By Default using " + comPort + " as the COM Port\n"
                    + "Red on pin " + RED + "\n"
                    + "Green on pin " + GREEN + "\n"
                    + "Blue on pin " + BLUE + "\n"
                    + "To change the default, use, first parameter as COM Port\n"
                    + "Then pin for red then green then blue separated by space\n"
                    + LINE);
        }

        if (args.length > 0) {
            comPort = args[0];
            System.out.println("Using COM Port :" + comPort);
        }

        try {
            if (args.length > 1) {
                RED = Integer.parseInt(args[1]);
                System.out.println("Using RED pin :" + RED);
            }
            if (args.length > 2) {
                GREEN = Integer.parseInt(args[2]);
                System.out.println("Using GREEN pin :" + GREEN);
            }

            if (args.length > 3) {
                BLUE = Integer.parseInt(args[3]);
                System.out.println("Using BLUE pin :" + BLUE);
            }
        } catch (NumberFormatException e) {
            System.err.println("argument pin number is not a number");
        }

        try {
            String myargs[] = new String[2];

            myargs[0] = "--present";
            myargs[1] = "JavaRGBPhysicalPixel.LaunchApplet";

            LaunchApplet constructedSketch = new LaunchApplet();
            
            //constructedSketch.shininess(0.1f);
            
            PApplet.runSketch(myargs, constructedSketch);
            //PApplet.main();
        } catch (RuntimeException runEx) {
            System.err.println(runEx.getLocalizedMessage());
        }
    }
}
