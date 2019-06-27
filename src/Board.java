import java.awt.*; //Graphics
import java.awt.event.*; //Events triggered by mouse or keys

public class Board extends Frame{
    public static final long serialVersionUID = 78;
    int width = 1000;
    int height = 1000;
    Board(){
        super("Game of HELL");
        config();
        setVisible(true);

    }    
    Board(int width, int height){
        super("Custom: Game of hell");
        this.width = width; 
        this.height = height; 
        config();
        setVisible(true);

    }    

    void config(){
        setSize(width, height);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });

    }

    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        Font font = new Font("Serif", Font.PLAIN, 24);
        g2.setFont(font);
        g2.drawString("Welcome to the Game of Hell, prepare for divine retribution", 500, 500);
    }

}
