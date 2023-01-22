import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConverter extends JFrame  {
    private JPanel mainPane;
    private JTextField textField1;
    private JComboBox tempBox;
    private JButton convertButton;
    private JComboBox tempBox2;
    private JLabel finalValue;

    public TempConverter() {
        this.setTitle("Temperature Converter");
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
        this.setContentPane(mainPane);
        this.pack();



        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //celsius to Fahrenheit
                if ((tempBox.getSelectedItem() == "Celsius") && (tempBox2.getSelectedItem() == "Fahrenheit")) {
                    double convertTemp = Double.parseDouble(textField1.getText()) * 1.8 + 32;
                    finalValue.setText(String.valueOf(convertTemp));
                    //celsius to kelvin
                } else if ((tempBox.getSelectedItem() == "Celsius") && (tempBox2.getSelectedItem() == "Kelvin")) {
                    double convertTemp = Double.parseDouble(textField1.getText()) + 273.15;
                    finalValue.setText(String.valueOf(convertTemp));
                }
                //celsius to celsius
                else if ((tempBox.getSelectedItem() == "Celsius") && (tempBox2.getSelectedItem() == "Celsius")) {
                    double convertTemp = Double.parseDouble(textField1.getText());
                    finalValue.setText(String.valueOf(convertTemp));
                }
                //Fahrenheit to celsius
                else if ((tempBox.getSelectedItem() == "Fahrenheit") && (tempBox2.getSelectedItem() == "Celsius")) {
                    double convertTemp = Double.parseDouble(textField1.getText());
                    convertTemp = (convertTemp-32)*5/9;

                    finalValue.setText(String.valueOf(convertTemp));
                }
                //Fahrenheit to kelvin
                else if ((tempBox.getSelectedItem() == "Fahrenheit") && (tempBox2.getSelectedItem() == "Kelvin")) {
                    double convertTemp = Double.parseDouble((textField1.getText()));
                    double tempValue = (convertTemp - 32) * 5 / 9 + 273.15;
                    finalValue.setText(String.valueOf(tempValue));
                } else if ((tempBox.getSelectedItem() == "Kelvin") && (tempBox2.getSelectedItem() == "Celsius")) {
                    double convertTemp = Double.parseDouble((textField1.getText()));
                    double tempValue = convertTemp - 273.15;
                    finalValue.setText(String.valueOf(tempValue));
                } else if ((tempBox.getSelectedItem() == "Kelvin") && (tempBox2.getSelectedItem() == "Fahrenheit")) {
                    double convertTemp = Double.parseDouble((textField1.getText()));
                    double tempValue = (convertTemp - 273.15) * 5 / 9 + 32;
                    finalValue.setText(String.valueOf(tempValue));
                }


            }
        });
    }

}
