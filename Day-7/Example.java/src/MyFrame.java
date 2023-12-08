import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

     private JButton closeButton;

         MyFrame(){

                setSize(400,400);
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                setTitle("My First Frame");
                setLocationRelativeTo(null);
                setLayout(new FlowLayout());


                closeButton = new JButton("Close");
                closeButton.setFont(new Font(@));


     }

}
