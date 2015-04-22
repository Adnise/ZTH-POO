package ro.teamnet.zerotohero.oop.graphicshape;

public class Shape extends AbstractShape implements ShapeBehaviour{
    protected int color;
    protected float saturation;

    public double aria() {
        return 0;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int newColor) {
        color = newColor;
    }


    public float getSaturation() {
        return saturation;
    }

    public void setSaturation(float newSaturation) {
        saturation = newSaturation;
    }

}
