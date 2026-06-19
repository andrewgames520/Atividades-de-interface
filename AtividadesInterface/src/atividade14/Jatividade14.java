package atividade14;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Jatividade14 extends JFrame {
    private JPanel contentPane;
    private JTextField valorField;
    private JTextField descontoField;
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
                    Jatividade14 frame = new Jatividade14();
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
    public Jatividade14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        nomeLabel = new JLabel("Nome do Produto:");
        nomeLabel.setBounds(10,20,110,20);
        contentPane.add(nomeLabel);

        nomeField = new JTextField();
        nomeField.setBounds(160,20,110,20);
        contentPane.add(nomeField);

        n1Label = new JLabel("Digite o valor do produto:");
        n1Label.setBounds(10, 50, 150, 20);
        contentPane.add(n1Label);

        valorField = new JTextField();
        valorField.setBounds(160, 50, 50, 20);
        contentPane.add(valorField);

        n2Label = new JLabel("Digite a porcentagem do desconto:");
        n2Label.setBounds(10, 80, 200, 20);
        contentPane.add(n2Label);

        descontoField = new JTextField();
        descontoField.setBounds(210, 80, 50, 20);
        contentPane.add(descontoField);

        calcularButton = new JButton("Calcular desconto");
        calcularButton.setBounds(10, 110, 140, 20);
        contentPane.add(calcularButton);

        calcularButton.addActionListener(e -> CalcularTotal());

    }

    void CalcularTotal() {
        try {
            Double total = Integer.parseInt(valorField.getText()) * (100 - Integer.parseInt(descontoField.getText())) / 100.;
            resultadoLabel.setText("Produto: " + nomeField.getText() + " | Valor final R$: " + total);
        } catch (Exception e) {
            resultadoLabel.setText("Input invalido");
        }
        resultadoLabel.setBounds(10,140,250,20);
        contentPane.add(resultadoLabel);
        contentPane.repaint();
        //valorField.setEnabled(false);
        //descontoField.setEnabled(false);
    }
}
