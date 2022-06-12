import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ComboBoxTextArea extends JFrame
{
   private String[] carTitles = { "Mustang", "Camaro", "Challenger", "Corvette" };
   
   private ImageIcon[] carImage = {
      new ImageIcon("mustang.jpg"),
      new ImageIcon("Camaro.jpg"),
      new ImageIcon("Challenger.jpg"),
      new ImageIcon("Corvette.jpg")

   };
   
   private String[] carDescription = new String[4];
   
   private DescriptionPanel descriptionPanel = new DescriptionPanel();
   
   private JComboBox jcbo = new JComboBox(carTitles);
   
   private JSlider redSlider = new JSlider(JSlider.VERTICAL, 0, 255, 0);
   private JSlider greenSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
   private JSlider blueSlider = new JSlider(JSlider.VERTICAL, 0, 255, 0);
   
   
   public ComboBoxTextArea()
   {
      carDescription[0] = "The Mustang is an American muscle car manufactured by Ford since April 17, 1964.";
      carDescription[1] = "The Camaro is an American muscle car manufactured by Cheverolet since September 29, 1966";
      carDescription[2] = "The Challenger is an American muscle car manufactured by Dodge since Fall, 1970";
      carDescription[3] = "The Corvette is an American muscle car manufactured by Cheverolet since June 30, 1952";
      setDisplay(0);
      
      add(jcbo, BorderLayout.NORTH);
      
      add(descriptionPanel, BorderLayout.CENTER);
      
      jcbo.setForeground(Color.red);
      jcbo.setBackground(Color.black);
      
      jcbo.addItemListener(new ItemListener(){
         @Override
         public void itemStateChanged(ItemEvent e) {
            setDisplay(jcbo.getSelectedIndex());
         }
      });
      
      add(redSlider, BorderLayout.WEST);
      add(greenSlider, BorderLayout.SOUTH);
      add(blueSlider, BorderLayout.EAST);
      
      event e = new event();
      redSlider.addChangeListener(e);
      greenSlider.addChangeListener(e);
      blueSlider.addChangeListener(e);
  }
  public void setDisplay(int index){
   descriptionPanel.setTitle(carTitles[index]);
   descriptionPanel.setImageIcon(carImage[index]);
   descriptionPanel.setDescription(carDescription[index]);
   }
   public class event implements ChangeListener {
      public void stateChanged(ChangeEvent e) {
         int r = redSlider.getValue();
         int g = greenSlider.getValue();
         int b = blueSlider.getValue();
            
         jcbo.setForeground(new Color(r,g,b));
         }
   }
}