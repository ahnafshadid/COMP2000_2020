import javax.swing.*;
import java.awt.*;

public class Stage extends JFrame{

    private static String[] args;

  public static void main(String[] args) throws Exception {
        Main window = new Main();
    }
/**
 * Actor
 */
public class Actor {
    public void paint( Graphics g){
        for (int i=10; i<710; i+=35){
            for (int j=10; j<710; j+=35){
                g.setColor(Color.WHITE);
                g.fillRect(i, j, 35, 35);
                g.setColor(Color.BLACK);
                g.drawRect(i, j, 35, 35);

        }
    
    }
       
}


public class Rabbit extends Actor {
    public Rabbit(){

    }
}

public class Lion extends Actor {
    public Lion(){

    }
}

public class Puppy extends Actor {
    public Puppy(){

    }
}

public Main (){
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }
