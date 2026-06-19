package atividade10;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Jatividade10 extends JFrame {
    private final JPanel contentPane;
    private final JTextField userField,senhaField ;
    private final JButton entrarButton;
    private final JLabel respostaLabel = new JLabel();

    /**
     * Launch the application.
     */
    static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Jatividade10 frame = new Jatividade10();
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
    public Jatividade10() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        userField  = new JTextField();
        userField .setBounds(10,20,100,20);
        contentPane.add(userField );

        senhaField = new JTextField();
        senhaField.setBounds(10,50,100,20);
        contentPane.add(senhaField);

        entrarButton = new JButton("Entrar");
        entrarButton.setBounds(120,20,100,20);
        contentPane.add(entrarButton);

        entrarButton.addActionListener(e->entrar());
    }

    void entrar(){
        respostaLabel.setBounds(10,80,250,20);
        if(userField.getText().equals("admin") && senhaField.getText().equals("1234")){
            respostaLabel.setText("Login realizado com sucesso");
        }else{
            respostaLabel.setText("Usuário ou senha inválidos");
        }
        userField .setEnabled(false);
        entrarButton.setEnabled(false);
        contentPane.add(respostaLabel);
        contentPane.repaint();
    }
}

