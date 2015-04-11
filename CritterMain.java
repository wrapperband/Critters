/* Authors: Stuart Reges and Marty Stepp
 * Editor: Muhammad Osama
 * Description: CritterMain provides the main method for a simple simulation program.  Alter
 * the number of each critter added to the simulation if you want to experiment
 * with different scenarios.  You can also alter the width and height passed to
 * the CritterFrame constructor.
 */

public class CritterMain {
    public static void main(String[] args) {
        CritterFrame frame = new CritterFrame(90, 55);

        frame.add(30, Lion.class);
        frame.add(30, Tiger.class);
		frame.add(30, FlyTrap.class);
		frame.add(30, Bear.class);
		frame.add(30, Snake.class);
		frame.add(30, Food.class);
        frame.start();
    }
}


/************ OTHER CLASSES *************/
// frame.add(30, Dragon.class);
// frame.add(30, Pheonix.class);