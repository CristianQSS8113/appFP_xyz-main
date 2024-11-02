package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm01 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtImporte, txtDescuento, txtTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm01 frame = new frm01();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm01() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad de unidades:");
        lblCantidad.setBounds(50, 30, 150, 30);
        getContentPane().add(lblCantidad);

        JLabel lblImporte = new JLabel("Importe de la compra:");
        lblImporte.setBounds(50, 70, 150, 30);
        getContentPane().add(lblImporte);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 110, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotal = new JLabel("Total a pagar:");
        lblTotal.setBounds(50, 150, 150, 30);
        getContentPane().add(lblTotal);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(220, 30, 80, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCantidad);

        txtImporte = new JTextField();
        txtImporte.setBounds(220, 70, 80, 30);
        txtImporte.setFocusable(false);
        txtImporte.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtImporte);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(220, 110, 80, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDescuento);

        txtTotal = new JTextField();
        txtTotal.setBounds(220, 150, 80, 30);
        txtTotal.setFocusable(false);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 200, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double precioUnitario;

        if (cantidad >= 1 && cantidad <= 25) {
            precioUnitario = 27;
        } else if (cantidad >= 26 && cantidad <= 50) {
            precioUnitario = 25;
        } else {
            precioUnitario = 23;
        }

        double importe = cantidad * precioUnitario;
        double descuento = (cantidad > 50) ? importe * 0.15 : importe * 0.05;
        double total = importe - descuento;

        txtImporte.setText(String.format("%.2f", importe));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtTotal.setText(String.format("%.2f", total));
    }
}
