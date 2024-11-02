package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumeroA, txtNumeroB, txtNumeroC, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm20 frame = new frm20();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm20() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumeroA = new JLabel("Número A:");
        lblNumeroA.setBounds(50, 30, 100, 30);
        getContentPane().add(lblNumeroA);

        JLabel lblNumeroB = new JLabel("Número B:");
        lblNumeroB.setBounds(50, 70, 100, 30);
        getContentPane().add(lblNumeroB);

        JLabel lblNumeroC = new JLabel("Número C:");
        lblNumeroC.setBounds(50, 110, 100, 30);
        getContentPane().add(lblNumeroC);

        JLabel lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(50, 150, 100, 30);
        getContentPane().add(lblResultado);

        txtNumeroA = new JTextField();
        txtNumeroA.setBounds(150, 30, 100, 30);
        txtNumeroA.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(txtNumeroA);

        txtNumeroB = new JTextField();
        txtNumeroB.setBounds(150, 70, 100, 30);
        txtNumeroB.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(txtNumeroB);

        txtNumeroC = new JTextField();
        txtNumeroC.setBounds(150, 110, 100, 30);
        txtNumeroC.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(txtNumeroC);

        txtResultado = new JTextField();
        txtResultado.setBounds(150, 150, 100, 30);
        txtResultado.setFocusable(false);
        txtResultado.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(txtResultado);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(100, 190, 120, 30);
        getContentPane().add(btnVerificar);

        btnVerificar.addActionListener(e -> btnVerificar_actionPerformed());
    }

    protected void btnVerificar_actionPerformed() {
        int a = Integer.parseInt(txtNumeroA.getText());
        int b = Integer.parseInt(txtNumeroB.getText());
        int c = Integer.parseInt(txtNumeroC.getText());
        String resultado;

        if (a < b && b < c) {
            resultado = "Ascendente";
        } else if (a > b && b > c) {
            resultado = "Descendente";
        } else {
            resultado = "Desordenado";
        }

        txtResultado.setText(resultado);
    }
}
