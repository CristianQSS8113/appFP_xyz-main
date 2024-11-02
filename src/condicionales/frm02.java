package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm02 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txtImporte, txtDescuento, txtTotal, txtCaramelos;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm02 frame = new frm02();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm02() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
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

        JLabel lblCaramelos = new JLabel("Caramelos de regalo:");
        lblCaramelos.setBounds(50, 190, 150, 30);
        getContentPane().add(lblCaramelos);

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

        txtCaramelos = new JTextField();
        txtCaramelos.setBounds(220, 190, 80, 30);
        txtCaramelos.setFocusable(false);
        txtCaramelos.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCaramelos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 250, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double precioUnitario = 20;
        double importe = cantidad * precioUnitario;
        double descuento;
        int caramelos;

        if (importe > 700) {
            descuento = importe * 0.16;
        } else if (importe >= 501) {
            descuento = importe * 0.14;
        } else {
            descuento = importe * 0.12;
        }

        if (cantidad > 100) {
            caramelos = 15;
        } else if (cantidad >= 51) {
            caramelos = 10;
        } else {
            caramelos = 5;
        }

        double total = importe - descuento;

        txtImporte.setText(String.format("%.2f", importe));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtTotal.setText(String.format("%.2f", total));
        txtCaramelos.setText(String.valueOf(caramelos));
    }
}