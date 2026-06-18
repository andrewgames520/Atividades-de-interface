package atividade1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Jatividade1 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel panel1;
    private JButton cliqueAquiIdiotaButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Jatividade1 frame = new Jatividade1();
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
    public Jatividade1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel mensagemInicio = new JLabel("Bem vindo ao sistema");
        mensagemInicio.setHorizontalAlignment(SwingConstants.CENTER);
        mensagemInicio.setForeground(new Color(0, 0, 0));
        mensagemInicio.setEnabled(false);
        mensagemInicio.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        mensagemInicio.setBounds(87, 11, 281, 62);
        contentPane.add(mensagemInicio);

        JButton ButtomClique = new JButton("Clique Aqui!!");
        ButtomClique.setBounds(181, 84, 103, 23);
        contentPane.add(ButtomClique);
        ButtomClique.addActionListener(e -> Clicado(mensagemInicio));

    }
    private void Clicado(JLabel mensagemInicio) {
        mensagemInicio.setText("Botão clicado com sucesso!");
    }
}
