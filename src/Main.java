import javax.swing.*;
import java.awt.*;

<<<<<<< HEAD
public class Main extends JFrame{
    
    public static void main(String[] args) throws Exception {
        Main window = new Main();
=======
class Main extends JFrame {
    
    class App extends JPanel {
        
        Grid grid;

        public App() {
            setPreferredSize(new Dimension(720, 720));
            grid = new Grid();
        }

        @Override
        public void paint(Graphics g) {
            grid.paint(g, getMousePosition());
        }

    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            this.repaint();
        }
>>>>>>> 107838d3f77372ae27d363979ee598475a276dcd
    }

    public class Canvas extends JPanel {
        public Canvas(){
            setPreferredSize(new Dimension(720,720));
        }

        @Override
        public void paint(Graphics g){
            for (int i=10; i<710; i+=35){
                for (int j=10; j<710; j+=35){
                    g.setColor(Color.WHITE);
                    g.fillRect(i, j, 35, 35);
                    g.setColor(Color.BLACK);
                    g.drawRect(i, j, 35, 35);

            }

        }
    }
    }
    public Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

}