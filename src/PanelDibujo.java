import java.awt.Graphics;
import javax.swing.JPanel;
public class PanelDibujo extends JPanel{

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int anchura = getWidth();
        int altura = getHeight();

        g.drawLine(20,10,20,100);
        g.drawLine(20,10,70,60);
        g.drawLine(70,60,120,10);
        g.drawLine(120,10,120,100);

        //g.drawLine(80,10,20,30);
    }
}


