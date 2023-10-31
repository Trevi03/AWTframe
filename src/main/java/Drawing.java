import Shapes.Circle;
import Shapes.Rect;
import Shapes.Shape;
import Shapes.Square;

import java.awt.*;
import java.util.ArrayList;

public class Drawing extends Canvas {
    private ArrayList<Shape> arr = new ArrayList<>();

// UseBuilder design pattern
    public Drawing(){}
    public Drawing circ(int rad,Point pnt,Color col){
        this.arr.add(new Circle(rad,pnt,col));
        return this;
    }
    public Drawing rect(int width,int height,Point pnt,Color col){
        this.arr.add(new Rect(width,height,pnt,col));
        return this;
    }
    public Drawing square(int side,Point pnt,Color col){
        this.arr.add(new Square(side,pnt,col));
        return this;
    }
    public void paint(Graphics g){
        for (int i=0; i<=arr.size();i++){
            arr.get(i).draw(g);
        }
    }
}