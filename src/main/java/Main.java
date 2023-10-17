import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    static Frame frame = new Frame();
    static Drawing drawing = new Drawing();
    //frame.add(drawing);
    public static void main(String[] args) {
        frame.add(drawing);
        drawing.setSize(200, 200);
        drawing.setBackground(Color.white);
        frame.setLayout(null);
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
