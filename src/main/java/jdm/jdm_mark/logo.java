package jdm.jdm_mark;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class logo extends JLabel{
    
    private int x, y;
    private final String path;
    
    public logo(JPanel panel, String path){
        this.path = path;
        this.x = panel.getWidth();
        this.y = panel.getHeight();
        this.setSize(x,y);
    }
    @Override
    public void paint(Graphics g){
        ImageIcon log = new ImageIcon(getClass().getResource(path));
        g.drawImage(log.getImage(),0,0, x, y, null);
    }
}
