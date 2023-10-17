import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static Point p = new Point(100,75);
    static Frame frame = new Frame();
    static Drawing drawing = new Drawing(100,p,Color.red,20,30,p,Color.blue);
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
