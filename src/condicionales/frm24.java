package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm24 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontoVendido, txtSueldo;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm24 frame = new frm24();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm24() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoVendido = new JLabel("Monto vendido:");
        lblMontoVendido.setBounds(30, 30, 120, 30);
        add(lblMontoVendido);

        JLabel lblSueldo = new JLabel("Sueldo:");
        lblSueldo.setBounds(30, 70, 120, 30);
        add(lblSueldo);

        txtMontoVendido = new JTextField();
        txtMontoVendido.setBounds(150, 30, 100, 30);
        txtMontoVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        add(txtMontoVendido);

        txtSueldo = new JTextField();
        txtSueldo.setBounds(150, 70, 100, 30);
        txtSueldo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldo.setFocusable(false);
        add(txtSueldo);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 130, 100, 30);
        btnCalcular.addActionListener(e -> calcular());
        add(btnCalcular);
    }

    private void calcular() {
        double montoVendido = Double.parseDouble(txtMontoVendido.getText());
        double sueldoBase = montoVendido * 0.10;
        double sueldoExtra = (montoVendido > 5000) ? ((montoVendido - 5000) / 500) * 25 : 0;
        double sueldoTotal = sueldoBase + sueldoExtra;

        txtSueldo.setText(String.format("%.2f", sueldoTotal));
    }
}
