//class for GUI Project

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class GUIbuttons extends JFrame
{
   private JLabel jlblMessage = new JLabel("Welcome to Muscle Car Parts where you can find " +
                                             "new and used parts for your muscle car", JLabel.CENTER);
                                             
   private JCheckBox jchkUsed = new JCheckBox("Used");
   private JCheckBox jchkNew = new JCheckBox("New");
   
   private JRadioButton jrbMustang = new JRadioButton("Mustang");
   private JRadioButton jrbCamaro = new JRadioButton("Camaro");
   private JRadioButton jrbChallenger = new JRadioButton("Challenger");
   private JRadioButton jrbCorvette = new JRadioButton("Corvette");
   
   private JTextField jtfMessage = new JTextField(10);
   
   public GUIbuttons()
   {
      jlblMessage.setBorder( new LineBorder(Color.BLACK, 2));
      add(jlblMessage, BorderLayout.CENTER);
      
      Font font1 = new Font("Onyx", Font.BOLD, 32);
      jlblMessage.setFont(font1);
      
      JPanel jpCheckBoxes = new JPanel();
      jpCheckBoxes.setLayout(new GridLayout(2,1));
      jpCheckBoxes.add(jchkUsed);
      jpCheckBoxes.add(jchkNew);
      add(jpCheckBoxes, BorderLayout.EAST);
      
      JPanel jpRadioButtons = new JPanel();
      jpRadioButtons.setLayout(new GridLayout(4, 1));
      jpRadioButtons.add(jrbMustang);
      jpRadioButtons.add(jrbCamaro);
      jpRadioButtons.add(jrbChallenger);
      jpRadioButtons.add(jrbCorvette);
      add(jpRadioButtons, BorderLayout.WEST);
      
      ButtonGroup group = new ButtonGroup();
      group.add(jrbMustang);
      group.add(jrbCamaro);
      group.add(jrbChallenger);
      group.add(jrbCorvette);
      
      
      JPanel jpTextField = new JPanel();
      jpTextField.setLayout(new BorderLayout(5,0));
      jpTextField.add( new JLabel("Search for parts..."), BorderLayout.WEST);
      jpTextField.add( jtfMessage, BorderLayout.CENTER);
      jtfMessage.setHorizontalAlignment(JTextField.RIGHT);
      add(jpTextField, BorderLayout.NORTH);
      
      jchkUsed.addActionListener( new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            setNewText();
         }
      });
      jchkNew.addActionListener( new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            setNewText();
         }
      });
      jrbMustang.addActionListener( new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            jlblMessage.setForeground(Color.red);
            setNewText();
         }
      });
      jrbCamaro.addActionListener( new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            jlblMessage.setForeground(Color.magenta);
            setNewText();
         }
      });
      jrbChallenger.addActionListener( new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            jlblMessage.setForeground(Color.blue);
            setNewText();
         }
      });
      jrbCorvette.addActionListener( new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            jlblMessage.setForeground(Color.yellow);
            setNewText();
         }
      });
      jtfMessage.addActionListener( new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            jlblMessage.setText(jtfMessage.getText());
            jtfMessage.requestFocusInWindow();
         }
      });
   }
   private void setNewText(){
      if(jrbMustang.isSelected() && jchkUsed.isSelected() && jchkNew.isSelected())
      {
         jlblMessage.setText("You are looking for new and used Mustang parts");
      }
      if(jrbMustang.isSelected() && !(jchkUsed.isSelected()) && jchkNew.isSelected())
      {
         jlblMessage.setText("You are looking for new Mustang parts");
      }
      if(jrbMustang.isSelected() && jchkUsed.isSelected() && !(jchkNew.isSelected()))
      {
         jlblMessage.setText("You are looking for used Mustang parts");
      }
      if(jrbCamaro.isSelected() && jchkUsed.isSelected() && jchkNew.isSelected())
      {
         jlblMessage.setText("You are looking for new and used Camaro parts");
      }
      if(jrbCamaro.isSelected() && !(jchkUsed.isSelected()) && jchkNew.isSelected())
      {
         jlblMessage.setText("You are looking for new Camaro parts");
      }
      if(jrbCamaro.isSelected() && jchkUsed.isSelected() && !(jchkNew.isSelected()))
      {
         jlblMessage.setText("You are looking for used Camaro parts");
      }
      if(jrbChallenger.isSelected() && jchkUsed.isSelected() && jchkNew.isSelected())
      {
         jlblMessage.setText("You are looking for new and used Challenger parts");
      }
      if(jrbChallenger.isSelected() && !(jchkUsed.isSelected()) && jchkNew.isSelected())
      {
         jlblMessage.setText("You are looking for new Challenger parts");
      }
      if(jrbChallenger.isSelected() && jchkUsed.isSelected() && !(jchkNew.isSelected()))
      {
         jlblMessage.setText("You are looking for used Challenger parts");
      }
      if(jrbCorvette.isSelected() && jchkUsed.isSelected() && jchkNew.isSelected())
      {
         jlblMessage.setText("You are looking for new and used Corvette parts");
      }
      if(jrbCorvette.isSelected() && !(jchkUsed.isSelected()) && jchkNew.isSelected())
      {
         jlblMessage.setText("You are looking for new Corvette parts");
      }
      if(jrbCorvette.isSelected() && jchkUsed.isSelected() && !(jchkNew.isSelected()))
      {
         jlblMessage.setText("You are looking for used Corvette parts");
      }
      if(jrbChallenger.isSelected() && !(jchkUsed.isSelected() || jchkNew.isSelected()))
      {
         jlblMessage.setText("You are looking for Challenger parts");
      }
      if(jrbMustang.isSelected() && !(jchkUsed.isSelected() || jchkNew.isSelected()))
      {
         jlblMessage.setText("You are looking for Mustang parts");
      }
      if(jrbCamaro.isSelected() && !(jchkUsed.isSelected() || jchkNew.isSelected()))
      {
         jlblMessage.setText("You are looking for Camaro parts");
      }
      if(jrbCorvette.isSelected() && !(jchkUsed.isSelected() || jchkNew.isSelected()))
      {
         jlblMessage.setText("You are looking for Corvette parts");
      }
      
   }
}
