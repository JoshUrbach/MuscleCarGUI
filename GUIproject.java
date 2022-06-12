//Josh Urbach GUI Project

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class GUIproject extends JFrame
{  
   public static void main(String [] args)
   {
      GUIbuttons frame = new GUIbuttons();
      frame.pack();
      frame.setSize(1000,250);
      frame.setTitle("Muscle Car Parts");
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      ComboBoxTextArea frame1 = new ComboBoxTextArea();
      frame1.pack();
      frame1.setSize(900,500);
      frame1.setTitle("Muscle Car Parts");
      frame1.setLocationRelativeTo(null);
      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame1.setVisible(true);
   }
}