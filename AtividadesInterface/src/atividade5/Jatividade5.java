package atividade5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Jatividade5 extends JFrame {
    private JPanel contentPane;
    private JTextField idadeField;
    private  JButton verificarButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Jatividade5 frame = new Jatividade5();
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
    public Jatividade5() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        idadeField = new JTextField();
        idadeField.setBounds(10,20,100,20);
        contentPane.add(idadeField);

        verificarButton = new JButton("Verificar");
        verificarButton.setBounds(120,20,100,20);
        contentPane.add(verificarButton);

        verificarButton.addActionListener(e->verificador());
    }

    void verificador(){
        JLabel respostaLabel = new JLabel();
        respostaLabel.setBounds(10,50,100,20);
        try {
        Integer idade = Integer.parseInt(idadeField.getText());
        if(idade<18){
            respostaLabel.setText("Menor de idade");
        }else{
            respostaLabel.setText("Maior de idade");
        }
        } catch (Exception e) {
            respostaLabel.setText("Idade inválida");
        }
        idadeField.setEnabled(false);
        verificarButton.setEnabled(false);
        contentPane.add(respostaLabel);
        contentPane.repaint();
    }
}

