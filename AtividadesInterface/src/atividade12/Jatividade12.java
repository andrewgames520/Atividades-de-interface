package atividade12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.FlowLayout;

public class Jatividade12 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Integer contador =0;
    private JLabel nCliquesLabel;
    private JTextField valorInicialField;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Jatividade12 frame = new Jatividade12();
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
    public Jatividade12() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        //contentPane.setLayout(null);
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        nCliquesLabel = new JLabel("cliques: 0");
        contentPane.add(nCliquesLabel);

        JButton clicarButton = new JButton("Clique");
        clicarButton.setBackground(new Color(255, 255, 255));
        clicarButton.setForeground(new Color(0, 0, 0));
        //clicarButton.setBounds(10, 10, WIDTH, HEIGHT);
        clicarButton.setFont(new Font("Informal Roman", Font.PLAIN, 16));
        clicarButton.addActionListener(e -> incrementarContador());
        contentPane.add(clicarButton);

        valorInicialField = new JTextField();
        contentPane.add(valorInicialField);
        valorInicialField.setColumns(10);

    }
    private void incrementarContador() {
        contador++;
        try {
            if(valorInicialField.isEnabled())
                contador = Integer.parseInt(valorInicialField.getText());
            valorInicialField.setEnabled(false);
        }catch(Exception e) {
            valorInicialField.setEnabled(false);
        }

        nCliquesLabel.setText("Cliques:" + contador);
    }
}