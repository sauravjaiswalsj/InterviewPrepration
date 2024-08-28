package begineer.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.DirectoryStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Coordinates {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

}
class Polygon extends Coordinates{
    private ArrayList<Coordinates> coordinates;
    private ArrayList<Double> sides = new ArrayList<>();
    private double perimeter;

    public Polygon(ArrayList<Coordinates> coordinates){
        super(0,0);
        this.coordinates = coordinates;
    }

    public double getPerimeter(){
        for (Coordinates c : coordinates){
            double length = this.getSides(c.getX(), c.getY());
            sides.add(length);
            perimeter += length;
        }
        return  perimeter;
    }

    public double averageLength(){
        return perimeter / coordinates.size();
    }

    public double getLongest(){
        double max = Double.MIN_VALUE;

        for (double s : sides){
            max = Math.max(max, s);
        }
        return max;
    }

    private double getSides(int x, int y) {
        DecimalFormat df = new DecimalFormat("#.##");
        double res = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double result = Double.parseDouble(df.format(res));

        return result;
    }
    public int sideCount(){
        if (coordinates.isEmpty())
            return 0;
        return coordinates.size();
    }
}


public class FindPerimeterFromDataSet {
    public static void main(String[] args) throws Exception {
        //datatest1.txt
        String[] arr = new String[]{"example1.txt", "example2.txt", "example3.txt", "example4.txt"};
        for (String file : arr){
            perimeter(file);
        }

    }

    public static void perimeter(String file) throws Exception{
        File filePath = new File("/Users/sauravjaiswal/Downloads/perimeter_quiz/" + file);
        ArrayList<Coordinates> list = new ArrayList<>();
        Coordinates c;
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String cordinates;
        while ((cordinates = br.readLine()) != null){
            String[] arr = cordinates.split(",");
            int x = Integer.parseInt(arr[0].trim());
            int y = Integer.parseInt(arr[1].trim());
            c = new Coordinates(x,y);
            list.add(c);
        }

        System.out.println(" File +: " + file);
        Polygon p = new Polygon(list);
        System.out.println("Perimeter: " + p.getPerimeter());
        System.out.println("Avg Length: "+ p.averageLength());

        System.out.println("Max Length: "+ p.getLongest());

        System.out.println("---------------------------------");
    }
}
