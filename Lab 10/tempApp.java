/*
Aliaa Abobakr Elshiekh
120210151
CSE 3
Lab 10
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class tempApp extends JFrame {
    private JTextField textInput;
    private JRadioButton rbCelsius, rbKelvin;
    private JButton result;
    private JLabel lbResult;
    public tempApp() {
        setTitle("Temperature App");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        textInput = new JTextField();

        rbCelsius = new JRadioButton("to Celsius", true);
        rbKelvin = new JRadioButton("to Kelvin");
        ButtonGroup conversionGroup = new ButtonGroup();
        conversionGroup.add(rbCelsius);
        conversionGroup.add(rbKelvin);

        result = new JButton("Show Result");
        lbResult = new JLabel();

        add(textInput);
        add(rbCelsius);
        add(rbKelvin);
        add(result);
        add(lbResult);

        result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convTemp();
            }
        });
    }
    private void convTemp() {
        try {
            double f = Double.parseDouble(textInput.getText());
            double c = (5.0 / 9) * (f - 32);

            if (rbKelvin.isSelected()) {
                c += 273.15;
            }

            lbResult.setText(String.format("Result: %.2f %s", c, rbKelvin.isSelected() ? "Kelvin" : "Celsius"));
        } catch (NumberFormatException ex) {
            lbResult.setText("Invalid input, try again!");
        }
    }
     public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {
                 new tempApp().setVisible(true);
             }
         });
     }
 }