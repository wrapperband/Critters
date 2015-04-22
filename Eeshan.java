import java.awt.*;

public class Eeshan extends Critter {
    public String toString() {
        return "E";
    }

    public Action getMove(CritterInfo info) {
		  if (info.getFront() == Neighbor.OTHER) {
				return Action.INFECT;
		  }else if (info.getFront() == Neighbor.EMPTY) {
				return Action.HOP;
		  }else {
		 		return Action.LEFT.LEFT.RIGHT.RIGHT;
		  }
    }

    public Color getColor() {
        return Color.BLUE;
    }
}
