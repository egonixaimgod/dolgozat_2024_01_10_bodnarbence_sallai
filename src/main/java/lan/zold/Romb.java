package lan.zold;

public class Romb {
    public double calcArea(double side, double degree) {
        return Math.pow(side, 2) * Math.sin(degree);
    }

    public double calcCircumference(double side) {
        return 4 * side;
    }
}
