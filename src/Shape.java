import java.util.ArrayList;
public class Shape {
    private ArrayList<Point> p;
    private int size;
    private int buffer = 3;

    public Shape() {
        p = new ArrayList<Point>();
        ;
    }

    public void add(Point point) {
        p.add(point);
    }

    public double perimetr(){
        double d = 0;
        for(int i = 0; i < p.size() - 1; i++){
           d += p.get(i).distanceTo(p.get(i + 1).getX(), p.get(i + 1).getY());
        }
        d += p.getLast().distanceTo(p.getFirst().getX(), p.getFirst().getY());
        return d;
    }

    public double longestSide(){
        double d = 0;
        for(int i = 0; i < p.size() - 2; i++){
            if (p.get(i).distanceTo(p.get(i + 1).getX(), p.get(i + 1).getY()) > p.get(i + 1).distanceTo(p.get(i + 2).getX(), p.get(i + 2).getY())){
                d = p.get(i).distanceTo(p.get(i + 1).getX(), p.get(i + 1).getY());
            }
            else {
                d = p.get(i + 1).distanceTo(p.get(i + 2).getX(), p.get(i + 2).getY());
            }

            if(d < p.getLast().distanceTo(p.getFirst().getX(), p.getFirst().getY())){
                d = p.getLast().distanceTo(p.getFirst().getX(), p.getFirst().getY());
            }
        }
        return d;
    }

    public double AvarageSide(){
        double d = 0;
        for(int i = 0; i < p.size() - 1; i++){
            d += p.get(i).distanceTo(p.get(i + 1).getX(), p.get(i + 1).getY());
        }
        d += p.getLast().distanceTo(p.getFirst().getX(), p.getFirst().getY());
        return d / p.size();
    }

}