import java.awt.*;

public class Bruce extends Critter {
    public String toString() {
        return "B";
    }

    public Action getMove(CritterInfo info) {
		  if (info.getFront() == Neighbor.OTHER) {
				return Action.INFECT;
		  }else if (info.getFront() == Neighbor.WALL) {
				return Action.RIGHT;
		  }else {
		  		return Action.LEFT.HOP.HOP.HOP.HOP.HOP;
		  }
    }

    public Color getColor() {
        return Color.RED;
    }
}