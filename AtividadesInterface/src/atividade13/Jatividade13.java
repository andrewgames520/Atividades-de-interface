package atividade13;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Jatividade13 extends JFrame {
    private JPanel contentPane;
    private JTextField n1FIeld;
    private JTextField n2FIeld;
    private JTextField nomeField;
    private JLabel n1Label, n2Label,nomeLabel, resultadoLabel = new JLabel();
    private JButton calcularButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Jatividade13 frame = new Jatividade13();
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
    public Jatividade13() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        nomeLabel = new JLabel("Nome do Aluno:");
        nomeLabel.setBounds(10,20,110,20);
        contentPane.add(nomeLabel);

        nomeField = new JTextField();
        nomeField.setBounds(160,20,110,20);
        contentPane.add(nomeField);

        n1Label = new JLabel("Digite a primeira nota:");
        n1Label.setBounds(10, 50, 150, 20);
        contentPane.add(n1Label);

        n1FIeld = new JTextField();
        n1FIeld.setBounds(160, 50, 50, 20);
        contentPane.add(n1FIeld);

        n2Label = new JLabel("Digite a segunda nota:");
        n2Label.setBounds(10, 80, 150, 20);
        contentPane.add(n2Label);

        n2FIeld = new JTextField();
        n2FIeld.setBounds(160, 80, 50, 20);
        contentPane.add(n2FIeld);

        calcularButton = new JButton("Calcular Situação");
        calcularButton.setBounds(10, 110, 140, 20);
        contentPane.add(calcularButton);

        calcularButton.addActionListener(e -> CalcularMedia());

    }

    void CalcularMedia() {
        try {
            double media = (Integer.parseInt(n1FIeld.getText()) + Integer.parseInt(n2FIeld.getText())) / 2.;
            String status;
            if(media<5){
                status = "Reprovado";
            } else if (media<7) {
                status = "Recuperação";
            }else {
                status = "Aprovado";
            }
            resultadoLabel.setText(nomeField.getText() + " - Média: " + media + " - " + status);
        } catch (Exception e) {
            resultadoLabel.setText("Input invalido");
        }
        resultadoLabel.setBounds(10,140,200,20);
        contentPane.add(resultadoLabel);
        contentPane.repaint();
        n1FIeld.setEnabled(false);
        n2FIeld.setEnabled(false);
    }
}
