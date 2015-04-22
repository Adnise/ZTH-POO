package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Adina Radu on 4/21/2015.
 */
public class Point {

    int xPos, yPos;


    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        if (xPos != point.xPos)
            return false;
        return yPos == point.yPos;
    }

}
