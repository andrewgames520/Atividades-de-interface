package atividade2;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Jatividade2 extends  JFrame {

        private static final long serialVersionUID = 1L;
        private JPanel contentPane;
        private JLabel nomeLabel;
        private JTextField userField;

        /**
         * Launch the application.
         */
        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Jatividade2 frame = new Jatividade2();
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
        public Jatividade2() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 300);
            contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(null);

            nomeLabel = new JLabel("Digite seu nome:");
            nomeLabel.setBounds(10, 20, 100, 40);
            contentPane.add(nomeLabel);

            userField = new JTextField();
            userField.setBounds(110, 30, 60, 20);
            contentPane.add(userField);

            JButton enviarButton = new JButton("Enviar");
            enviarButton.setBounds(180, 20, 100, 40);

            enviarButton.addActionListener(e -> FalarNome());

            contentPane.add(enviarButton);



        }
        private void FalarNome(){
                String nome = ("Olá" + " " + userField.getText() + "!");
                JLabel nomeLabel = new JLabel(nome);
                nomeLabel.setBounds(200,50,100,100);
                contentPane.add(nomeLabel);
                userField.setEnabled(false);
                contentPane.repaint();
        }
    }
