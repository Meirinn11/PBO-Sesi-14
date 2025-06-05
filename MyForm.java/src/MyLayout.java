import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Border

public class MyLayout extends JFrame { 
    public MyLayout(){


    }



    panel.add(b1,BorderLayout.NORTH);
    panel.add(b2,BOrderLayout.SOUTH);
    panel.add(b3,BorderLayout.EAST);
    panel.add(b4,BorderLayout.WEST);
    panel.add(b5,BorderLayout.CENTER);

    add(panel);
    setVisible(true);

    
}    
public static void main(String[]args){
    new MyLayout();
}
}
