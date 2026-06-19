package atividade7;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Jatividade7 extends JFrame {
    private final JPanel contentPane;
    private final JTextField tempField ;
    private final JButton verificarButton;
    private final JLabel respostaLabel = new JLabel();

    /**
     * Launch the application.
     */
    static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Jatividade7 frame = new Jatividade7();
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
    public Jatividade7() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        tempField  = new JTextField();
        tempField .setBounds(10,20,100,20);
        contentPane.add(tempField );

        verificarButton = new JButton("Converter");
        verificarButton.setBounds(120,20,100,20);
        contentPane.add(verificarButton);

        verificarButton.addActionListener(e->verificador());
    }

    void verificador(){
        respostaLabel.setBounds(10,50,150,20);
        try {
            Integer temp = Integer.parseInt(tempField .getText());
            respostaLabel.setText(String.valueOf((temp * 1.8) + 32));
        } catch (Exception e) {
            respostaLabel.setText("Temperatura inválida");
        }
        tempField .setEnabled(false);
        verificarButton.setEnabled(false);
        contentPane.add(respostaLabel);
        contentPane.repaint();
    }
}

