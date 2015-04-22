package ro.teamnet.zerotohero.oop.graphicshape;

public class Circles {

    public double getAreaPub() {
        return new Circle().aria();
    }

    public void getAreaDef(){
        Circle circle =  new Circle();
        circle.fillColor();
        circle.fillColor(20);
        circle.fillColor(30.5f);
    }
}
