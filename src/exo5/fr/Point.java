package exo5.fr;

public class Point {

   private double X,Y;

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public double distance(Point p1, Point p2) {
        double calcP1 = (p2.getX() - p1.getX());
        double calcP2 = (p2.getY() - p1.getY());
        calcP1 *= calcP1;


        calcP2 *= calcP2;

        return Math.sqrt(calcP1 + calcP2);
    }
}
