package view;

import model.Temperature;
import obs.Observable;
import obs.Observer;
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TView implements Observer {


    JFrame frame;
    JTextField inputCelsius, outputFahrenheit;
    JButton button;
    JLabel outputlabel, inputlabel;


    public JTextField getInputCelsius() {
        return inputCelsius;
    }


    public JButton getButton() {
        return button;
    }


    public JTextField getOutputFahrenheit() {
        return outputFahrenheit;
    }

    public void init(){
        frame = new JFrame();
        frame.setBackground(Color.WHITE);
        frame.setTitle("TEMPERATURE CONVERTER");

        //Input Champs
        inputlabel=new JLabel("Temperature:");
        inputlabel.setFont(new Font("arial",Font.BOLD,14));

        inputCelsius = new JTextField(10);


        button = new JButton("Convert");
        button.setSize(80,30);
        button.setBackground(Color.LIGHT_GRAY);

        //Output Champs
        outputlabel = new JLabel("Output:");
        outputlabel.setFont(new Font("arial",Font.BOLD,14));

        outputFahrenheit = new JTextField(10);


        frame.getContentPane().add(inputlabel);
        frame.getContentPane().add(inputCelsius);
        frame.getContentPane().add(outputlabel);
        frame.getContentPane().add(outputFahrenheit);
        frame.getContentPane().add(button);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    @Override
    public void update(Observable observable) {
        Temperature temperature = (Temperature) observable;
        JTextField outputFahrenheit = getOutputFahrenheit();
        outputFahrenheit.setText(String.valueOf(temperature.getFahrenheit()));
    }
}
