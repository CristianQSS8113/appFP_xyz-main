package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNota1, txtNota2, txtNota3, txtPropinaTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm08 frame = new frm08();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm08() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNota1 = new JLabel("Nota 1:");
        lblNota1.setBounds(50, 30, 100, 30);
        getContentPane().add(lblNota1);

        JLabel lblNota2 = new JLabel("Nota 2:");
        lblNota2.setBounds(50, 70, 100, 30);
        getContentPane().add(lblNota2);

        JLabel lblNota3 = new JLabel("Nota 3:");
        lblNota3.setBounds(50, 110, 100, 30);
        getContentPane().add(lblNota3);

        JLabel lblPropinaTotal = new JLabel("Propina Total:");
        lblPropinaTotal.setBounds(50, 150, 100, 30);
        getContentPane().add(lblPropinaTotal);

        txtNota1 = new JTextField();
        txtNota1.setBounds(150, 30, 100, 30);
        txtNota1.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNota1);

        txtNota2 = new JTextField();
        txtNota2.setBounds(150, 70, 100, 30);
        txtNota2.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNota2);

        txtNota3 = new JTextField();
        txtNota3.setBounds(150, 110, 100, 30);
        txtNota3.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNota3);

        txtPropinaTotal = new JTextField();
        txtPropinaTotal.setBounds(150, 150, 100, 30);
        txtPropinaTotal.setFocusable(false);
        txtPropinaTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPropinaTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 200, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int nota1 = Integer.parseInt(txtNota1.getText());
        int nota2 = Integer.parseInt(txtNota2.getText());
        int nota3 = Integer.parseInt(txtNota3.getText());

        int propinaBase = 20;
        int propinaExtra = 0;

        if (nota1 >= 10) {
            propinaExtra += 5;
        }
        if (nota2 >= 10) {
            propinaExtra += 5;
        }
        if (nota3 >= 10) {
            propinaExtra += 5;
        }

        int propinaTotal = propinaBase + propinaExtra;
        txtPropinaTotal.setText(String.valueOf(propinaTotal));
    }
}
