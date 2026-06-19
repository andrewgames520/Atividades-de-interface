package atividade8;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Jatividade8 extends JFrame {
    private JPanel contentPane;
    private  JTextField valorHField, qntHField;
    private  JButton calcularButton;
    private  JLabel resultadorLabel = new JLabel();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Jatividade8 frame = new Jatividade8();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Jatividade8() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        valorHField =  new JTextField();
        valorHField.setBounds(10,20,100,20);
        contentPane.add(valorHField);

        qntHField = new JTextField();
        qntHField.setBounds(10,50,100,20);
        contentPane.add(qntHField);

        calcularButton = new JButton("Calcular salário");
        calcularButton.setBounds(10,80,150,20);
        contentPane.add(calcularButton);

        calcularButton.addActionListener(e->{
            resultadorLabel.setBounds(10,110,100,50);
            try {
            Double total = (Double.parseDouble(valorHField.getText())*Double.parseDouble(qntHField.getText()));
            resultadorLabel.setText(String.valueOf(total));
            }catch (Exception f){
                resultadorLabel.setText("Valores inválidos");
            }
            contentPane.add(resultadorLabel);
            contentPane.repaint();
            valorHField.setEnabled(false);
            qntHField.setEnabled(false);
        });
    }
}

