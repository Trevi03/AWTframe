import java.awt.*;

public class Drawing extends Canvas {
    private Circle c;
    private Rect r;
    private Square sq;
// UseBuilder design pattern
    public Drawing(){}
    public Drawing circ(int rad,Point pnt,Color col){
        this.c = new Circle(rad,pnt,col);
        return this;
    }
    public Drawing rect(int width,int height,Point pnt,Color col){
        this.r = new Rect(width,height,pnt,col);
        return this;
    }
    public Drawing sqre(int side,Point pnt,Color col){
        this.sq = new Square(side,pnt,col);
        return this;
    }
    public void paint(Graphics g){
        c.draw(g);
        r.draw(g);
        sq.draw(g);
    }
}