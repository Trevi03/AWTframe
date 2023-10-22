import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    static Frame frame = new Frame();
    static Drawing drawing = new Drawing().circ(50,new Point(50,50),Color.red).
            rect(100,60,new Point(150,100),Color.blue).sqre(10,new Point(150,40),Color.green);
    public static void main(String[] args) {
        frame.add(drawing);
        drawing.setSize(300, 200);
        drawing.setBackground(Color.white);
        frame.setLayout(null);
        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
