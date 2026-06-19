package atividade11;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Jatividade11 extends JFrame {
    private JPanel contentPane;
    private JTextField n1FIeld;
    private JTextField n2FIeld;
    private JLabel n1Label, n2Label,resultadoLabel = new JLabel();
    private JButton somarButton,subtrairButton,multiplicarButton,dividirButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Jatividade11 frame = new Jatividade11();
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
    public Jatividade11() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        n1Label = new JLabel("Digite o primeiro número:");
        n1Label.setBounds(10, 20, 150, 20);
        contentPane.add(n1Label);

        n1FIeld = new JTextField();
        n1FIeld.setBounds(160, 20, 50, 20);
        contentPane.add(n1FIeld);

        n2Label = new JLabel("Digite o segundo número:");
        n2Label.setBounds(10, 50, 150, 20);
        contentPane.add(n2Label);

        n2FIeld = new JTextField();
        n2FIeld.setBounds(160, 50, 50, 20);
        contentPane.add(n2FIeld);

        somarButton = new JButton("Somar");
        somarButton.setBounds(10, 80, 100, 20);
        contentPane.add(somarButton);
        somarButton.addActionListener(e -> {

            Double n1 = converter(n1FIeld);
            Double n2 = converter(n2FIeld);
            if(n1 !=null && n2!=null)
                resultadoLabel.setText(String.valueOf(n1+n2));
        });

        subtrairButton = new JButton("Subtrair");
        subtrairButton.setBounds(120, 80, 100, 20);
        contentPane.add(subtrairButton);
        subtrairButton.addActionListener(e -> {
            Double n1 = converter(n1FIeld);
            Double n2 = converter(n2FIeld);
            if(n1 !=null && n2!=null)
                resultadoLabel.setText(String.valueOf(n1-n2));
        });

        multiplicarButton = new JButton("Multiplicar");
        multiplicarButton.setBounds(10, 110, 100, 20);
        contentPane.add(multiplicarButton);
        multiplicarButton.addActionListener(e -> {
            Double n1 = converter(n1FIeld);
            Double n2 = converter(n2FIeld);
            if(n1 !=null && n2!=null)
                resultadoLabel.setText(String.valueOf(n1*n2));
        });

        dividirButton = new JButton("Dividir");
        dividirButton.setBounds(120, 110, 100, 20);
        contentPane.add(dividirButton);
        dividirButton.addActionListener(e -> {
            Double n1 = converter(n1FIeld);
            Double n2 = converter(n2FIeld);
            if(n1 !=null && n2!=null) {
                if (n2 == 0) {
                    resultadoLabel.setText("Náo é possível dividir por zero");
                    return;
                }
                resultadoLabel.setText(String.valueOf(n1 / n2));
            }
        });
        resultadoLabel.setBounds(160,140,200,20);
        contentPane.add(resultadoLabel);
    }

    Double converter(JTextField n1) {
        Double valor;
        try {
           valor = Double.parseDouble(n1.getText());
        } catch (Exception e) {
            resultadoLabel.setText("Input invalido");
            resultadoLabel.setBounds(160,140,100,20);
            contentPane.add(resultadoLabel);
            contentPane.repaint();
            valor = null;
        }
        return valor;
    }
}
