import java.applet.Applet;
import java.awt.*;

public class BasicApplet extends Applet {
    public void init() {
        setBackground(Color.white);
        setLayout(new FlowLayout(FlowLayout.CENTER));
    }

    public void paint(Graphics g) {
        super.paint(g); // Call the superclass paint method to ensure proper rendering
        g.drawString("Hello World", 50, 50); // Adjusted coordinates for visibility
    }
}
