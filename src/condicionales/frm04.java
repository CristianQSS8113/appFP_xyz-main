package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNota1, txtNota2, txtNota3, txtPromedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm04 frame = new frm04();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm04() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNota1 = new JLabel("Nota 1:");
        lblNota1.setBounds(50, 30, 150, 30);
        getContentPane().add(lblNota1);

        JLabel lblNota2 = new JLabel("Nota 2:");
        lblNota2.setBounds(50, 70, 150, 30);
        getContentPane().add(lblNota2);

        JLabel lblNota3 = new JLabel("Nota 3:");
        lblNota3.setBounds(50, 110, 150, 30);
        getContentPane().add(lblNota3);

        JLabel lblPromedio = new JLabel("Promedio Final:");
        lblPromedio.setBounds(50, 150, 150, 30);
        getContentPane().add(lblPromedio);

        txtNota1 = new JTextField();
        txtNota1.setBounds(220, 30, 80, 30);
        txtNota1.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNota1);

        txtNota2 = new JTextField();
        txtNota2.setBounds(220, 70, 80, 30);
        txtNota2.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNota2);

        txtNota3 = new JTextField();
        txtNota3.setBounds(220, 110, 80, 30);
        txtNota3.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNota3);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(220, 150, 80, 30);
        txtPromedio.setFocusable(false);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPromedio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 210, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double nota1 = Double.parseDouble(txtNota1.getText());
        double nota2 = Double.parseDouble(txtNota2.getText());
        double nota3 = Double.parseDouble(txtNota3.getText());

        if (nota3 >= 10) {
            nota3 += 2;
        }

        double promedio = (nota1 + nota2 + nota3) / 3;
        txtPromedio.setText(String.format("%.2f", promedio));
    }
}
