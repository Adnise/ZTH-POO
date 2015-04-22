package ro.teamnet.zerotohero.oop.runapp;
import ro.teamnet.zerotohero.oop.canvas.Canvas;
import ro.teamnet.zerotohero.oop.graphicshape.*;

public class RunApp  {

    public static void main(String [] args){

        System.out.println(" The default circle aria is :" + new Circles().getAreaPub());
        new Circles().getAreaDef();

        Circle shape1 = new Circle(10);
        ShapeBehaviour square = new Square(10);

        System.out.println("The circle with " + shape1.toString() + " has an area of " + shape1.getRadius() * shape1.getRadius() * Math.PI);
        System.out.println("The square with" + square.toString() + "has an area of" + square.aria());

        Canvas canvas = new Canvas();

    }
}
