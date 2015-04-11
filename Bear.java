import java.awt.*;

public class Bear extends Critter {
 
	private boolean polar;
	
  	 public Bear(boolean polar) {
		this.polar = polar;
	 }
	 
	 public String toString() {
        return "B";
    }

    public Action getMove(CritterInfo info) {
  		  if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
		  }else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        }else {
		  		double r = Math.random();
            if (r < 0.5){
               return Action.LEFT;
            }else{
               return Action.RIGHT;
				}
		  }
    }

    public Color getColor() {
		if (this.polar) {
		return Color.WHITE;
		} else {
		return Color.BLACK;
		}
    }
}