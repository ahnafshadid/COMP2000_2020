import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    
    class App extends JPanel {
        
        Stage stage;

        public App() {
            setPreferredSize(new Dimension(880, 720));
            stage = StageReader.readStage("data/stage1.rvb");
        }

        @Override
        public void paint(Graphics g) {
            stage.paint(g, getMousePosition());
        }

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




