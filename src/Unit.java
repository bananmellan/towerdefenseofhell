import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;


public abstract class Unit extends Image{
    int positionX;
    int positionY;
    public Unit(int x, int y, String imageName) {
        positionX = x;
        positionY = y;
        BufferedImage img = null;
        try {
            String path = "../resources/towers/";
            path = path + imageName;
            img = ImageIO.read(new File(path));
        } catch (IOException e) {
        }

    }
}


