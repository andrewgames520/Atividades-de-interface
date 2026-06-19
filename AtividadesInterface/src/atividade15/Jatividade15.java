package atividade15;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Jatividade15 extends JFrame {
    private JPanel contentPane;
    private JTextField idadeField;
    private JTextField CursoField;
    private JTextField nomeField;
    private  JTextField cidadeField;
    private JLabel idadeLabel, cursoLabel,nomeLabel,cidadeLabel, resultadoLabel = new JLabel();
    private JButton calcularButton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Jatividade15 frame = new Jatividade15();
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
    public Jatividade15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(10,20,40,20);
        contentPane.add(nomeLabel);

        nomeField = new JTextField();
        nomeField.setBounds(50,20,150,20);
        contentPane.add(nomeField);

        idadeLabel = new JLabel("Digite a idade:");
        idadeLabel.setBounds(10, 50, 100, 20);
        contentPane.add(idadeLabel);

        idadeField = new JTextField();
        idadeField.setBounds(110, 50, 25, 20);
        contentPane.add(idadeField);

        cursoLabel = new JLabel("Digite o curso:");
        cursoLabel.setBounds(10, 80, 100, 20);
        contentPane.add(cursoLabel);

        CursoField = new JTextField();
        CursoField.setBounds(110, 80, 125, 20);
        contentPane.add(CursoField);

        cidadeLabel = new JLabel("Digite a cidade:");
        cidadeLabel.setBounds(10, 110, 150, 20);
        contentPane.add(cidadeLabel);

        cidadeField = new JTextField();
        cidadeField.setBounds(110, 110, 125, 20);
        contentPane.add(cidadeField);

        calcularButton = new JButton("Gerar resumo");
        calcularButton.setBounds(10, 140, 140, 20);
        contentPane.add(calcularButton);

        calcularButton.addActionListener(e -> resumir());

    }

    void resumir() {
        if(!nomeField.getText().isEmpty() && !idadeField.getText().isEmpty() && !cidadeField.getText().isEmpty() && !CursoField.getText().isEmpty()) {
            resultadoLabel.setText(nomeField.getText() + " tem " + idadeField.getText() + " anos, mora em " + cidadeField.getText() + " e estuda " + CursoField.getText() + ".");
        }else{
            resultadoLabel.setText("Input inválido");
        }
        resultadoLabel.setBounds(10,170,550,20);
        contentPane.add(resultadoLabel);
        contentPane.repaint();
        //idadeField.setEnabled(false);
        //CursoField.setEnabled(false);
    }
}
