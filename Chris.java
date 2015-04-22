import java.awt.*;

public class Chris extends Critter {
    int step;
    
	 public String toString() {
        if (step % 2 == 1) {
          return "/\\/\\";
        } else {
          return "\\/\\/";
        }
    }

    public Action getMove(CritterInfo info) {
        step++;
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
            if (r < 4.4){
               return Action.LEFT;
            }else{
               return Action.RIGHT;
				}
		  }else {
            return Action.INFECT;
        }
    }

    public Color getColor() {
        if (step % 2 == 1) {
            return Color.ORANGE;
        else {
            return Color.RED;
        }
    }
	 
}

