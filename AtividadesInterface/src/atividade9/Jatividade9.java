package atividade9;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Jatividade9 extends JFrame {
    private final JPanel contentPane;
    private final JTextField nomefield ;
    private final JButton cadastrarButton;
    private final JLabel respostaLabel = new JLabel();

    /**
     * Launch the application.
     */
    static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Jatividade9 frame = new Jatividade9();
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
    public Jatividade9() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        nomefield  = new JTextField();
        nomefield .setBounds(10,20,100,20);
        contentPane.add(nomefield );

        cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(120,20,100,20);
        contentPane.add(cadastrarButton);

        cadastrarButton.addActionListener(e->cadastrar());
    }

    void cadastrar(){
        respostaLabel.setBounds(10,50,250,20);
        if(nomefield.getText().isBlank()){
            respostaLabel.setText("O nome é obrigatório");
        }else{
            respostaLabel.setText("Cadastra realizado para: " + nomefield.getText().trim());
        }
        nomefield .setEnabled(false);
        cadastrarButton.setEnabled(false);
        contentPane.add(respostaLabel);
        contentPane.repaint();
    }
}

