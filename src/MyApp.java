import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Талап\\IdeaProjects\\Assignment 1\\src\\source.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point point = new Point(x, y);
           shape.add(point);
       }

       System.out.println(shape.perimetr());
       System.out.println(shape.longestSide());
    }
}