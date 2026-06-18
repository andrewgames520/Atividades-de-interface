package atividade3;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Jatividade3 extends JFrame {
    private JPanel contentPane;
    private JTextField n1FIeld;
    private JTextField n2FIeld;
    private JLabel n1Label, n2Label;
    private JButton somarButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Jatividade3 frame = new Jatividade3();
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
    public Jatividade3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        n1Label = new JLabel("Digite o primeiro numero:");
        n1Label.setBounds(10, 20, 150, 20);
        contentPane.add(n1Label);

        n1FIeld = new JTextField();
        n1FIeld.setBounds(160, 20, 50, 20);
        contentPane.add(n1FIeld);

        n2Label = new JLabel("Digite o segundo numero:");
        n2Label.setBounds(10, 50, 150, 20);
        contentPane.add(n2Label);

        n2FIeld = new JTextField();
        n2FIeld.setBounds(160, 50, 50, 20);
        contentPane.add(n2FIeld);

        somarButton = new JButton("Somar");
        somarButton.setBounds(10, 80, 100, 20);
        contentPane.add(somarButton);

        somarButton.addActionListener(e -> Somar());

    }

    void Somar() {
        try {
            Integer soma = Integer.parseInt(n1FIeld.getText()) + Integer.parseInt(n2FIeld.getText());
            JLabel resultado = new JLabel("Resultado: " + soma);
            resultado.setBounds(120,80,100,20);
            contentPane.add(resultado);
            contentPane.repaint();
        } catch (Exception e) {
            JLabel erro = new JLabel("Input invalido");
            erro.setBounds(120,80,100,20);
            contentPane.add(erro);
            contentPane.repaint();
        }
            n1FIeld.setEnabled(false);
            n2FIeld.setEnabled(false);
    }
}
