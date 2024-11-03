package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm26 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtMontoCompra, txtPrestamo, txtInteres, txtPropio;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm26 frame = new frm26();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm26() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 300);
        setLayout(null);

        JLabel lblMontoCompra = new JLabel("Monto de Compra:");
        lblMontoCompra.setBounds(30, 30, 120, 30);
        add(lblMontoCompra);

        JLabel lblPrestamo = new JLabel("Préstamo:");
        lblPrestamo.setBounds(30, 70, 120, 30);
        add(lblPrestamo);

        JLabel lblInteres = new JLabel("Interés:");
        lblInteres.setBounds(30, 110, 120, 30);
        add(lblInteres);

        JLabel lblPropio = new JLabel("Monto Propio:");
        lblPropio.setBounds(30, 150, 120, 30);
        add(lblPropio);

        txtMontoCompra = new JTextField();
        txtMontoCompra.setBounds(160, 30, 120, 30);
        add(txtMontoCompra);

        txtPrestamo = new JTextField();
        txtPrestamo.setBounds(160, 70, 120, 30);
        txtPrestamo.setEditable(false);
        add(txtPrestamo);

        txtInteres = new JTextField();
        txtInteres.setBounds(160, 110, 120, 30);
        txtInteres.setEditable(false);
        add(txtInteres);

        txtPropio = new JTextField();
        txtPropio.setBounds(160, 150, 120, 30);
        txtPropio.setEditable(false);
        add(txtPropio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 200, 100, 30);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> calcular());
    }

    private void calcular() {
        double montoCompra = Double.parseDouble(txtMontoCompra.getText());
        double porcentajePrestamo = (montoCompra > 5000) ? 0.30 : 0.20;
        double prestamo = montoCompra * porcentajePrestamo;
        double interes = prestamo * 0.10;
        double propio = montoCompra - prestamo;

        txtPrestamo.setText(String.format("%.2f", prestamo));
        txtInteres.setText(String.format("%.2f", interes));
        txtPropio.setText(String.format("%.2f", propio));
    }
}
