package ro.teamnet.zerotohero.oop.graphicshape;
import  static java.lang.Math.PI;

public class Circle extends Shape {

    private int xPos, yPos, radius;

    public Circle() {
        radius = 4;
        xPos = 10;
        yPos = 7;
    }

    public Circle(int xPos) {
        this.xPos = xPos;
    }

    public Circle(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int getRadius() {
        return radius;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double aria() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "center= (" + xPos +  yPos +  ")" + "radius =" + radius;
    }

    public void fillColor(){
        System.out.println(color);
    }

    public void fillColor(int parametru){
        super.setColor(parametru);
        System.out.println("The circle color is now" + parametru);
    }
    public void fillColor(float parametruDoi ){
        super.setSaturation(parametruDoi);
    }



}
