public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        addPoint(x, y);
    }
    public void addPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double distanceTo (double x, double y){
        double d;
        d = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return d;
    }

    public String ToString(){
        return "x = " + this.x + " y = " + this.y;
    }
}