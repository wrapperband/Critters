import java.awt.*;

public class Snake extends Critter {
	  
	 public String toString() {
        return "S";
    }

    public Action getMove(CritterInfo info) {
	 	  if (info.getFront() == Neighbor.WALL) {
            return Action.LEFT;
        }else if (info.getFront() == Neighbor.EMPTY) {
		  		 if (info.getInfectCount() < 100) {	
					return Action.HOP;
				 }else {
					return Action.LEFT;
			    }
		  }else if (info.getFront() == Neighbor.SAME) {
				double r = Math.random();
            if (r < 0.5){
               return Action.LEFT;
            }else{
               return Action.RIGHT;
				}
		  }else {
            return Action.INFECT;
        }
    }

    public Color getColor() {
        return Color.GRAY;
    }
	 
}

