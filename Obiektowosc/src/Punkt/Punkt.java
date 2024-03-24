package Punkt;

public class Punkt {
   double x;
   double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
    	return x;
    }
    
    public double getY() {
    	return y;
    }
    
    public void setX(double x) {
    	this.x = x;
    }
    
    public void setY(double y) {
    	this.y = y;
    }
    
    public void printValues() {
    	System.out.println("X: " + getX() + "\n" + "Y: " + getY());
    }
}