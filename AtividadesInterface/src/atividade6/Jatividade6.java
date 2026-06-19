package atividade6;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Jatividade6 extends JFrame {
    private JPanel contentPane;
    private JTextField n1Field;
    private  JButton verificarButton;
    private JLabel respostaLabel = new JLabel();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Jatividade6 frame = new Jatividade6();
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
    public Jatividade6() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        n1Field = new JTextField();
        n1Field.setBounds(10,20,100,20);
        contentPane.add(n1Field);

        verificarButton = new JButton("Analisar");
        verificarButton.setBounds(120,20,100,20);
        contentPane.add(verificarButton);

        verificarButton.addActionListener(e->verificador());
    }

    void verificador(){
        respostaLabel.setBounds(10,50,100,20);
        try {
            Integer n1 = Integer.parseInt(n1Field.getText());
            if(n1<0){
                respostaLabel.setText("Negativo");
            }else if(n1==0){
                respostaLabel.setText("Zero");
            }else{
                respostaLabel.setText("Positivo");
            }
        } catch (Exception e) {
            respostaLabel.setText("Numero inválido");
        }
        n1Field.setEnabled(true);
        verificarButton.setEnabled(true);
        contentPane.add(respostaLabel);
        contentPane.repaint();
    }
}

