import java.awt.*;

public class Austin extends Critter {
    public String toString() {
        return "A";
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
        return Color.CYAN;
    }
}