package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDocenas, txtPrecioUnitario, txtMontoCompra, txtDescuento, txtTotalPagar, txtLapiceros;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm17 frame = new frm17();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm17() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDocenas = new JLabel("Cantidad de docenas:");
        lblDocenas.setBounds(50, 50, 150, 30);
        getContentPane().add(lblDocenas);

        JLabel lblPrecioUnitario = new JLabel("Precio unitario por docena:");
        lblPrecioUnitario.setBounds(50, 90, 200, 30);
        getContentPane().add(lblPrecioUnitario);

        JLabel lblMontoCompra = new JLabel("Monto de la compra:");
        lblMontoCompra.setBounds(50, 130, 150, 30);
        getContentPane().add(lblMontoCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 170, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotalPagar = new JLabel("Total a pagar:");
        lblTotalPagar.setBounds(50, 210, 150, 30);
        getContentPane().add(lblTotalPagar);

        JLabel lblLapiceros = new JLabel("Lapiceros de obsequio:");
        lblLapiceros.setBounds(50, 250, 150, 30);
        getContentPane().add(lblLapiceros);

        txtDocenas = new JTextField();
        txtDocenas.setBounds(230, 50, 100, 30);
        txtDocenas.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDocenas);

        txtPrecioUnitario = new JTextField();
        txtPrecioUnitario.setBounds(230, 90, 100, 30);
        txtPrecioUnitario.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPrecioUnitario);

        txtMontoCompra = new JTextField();
        txtMontoCompra.setBounds(230, 130, 100, 30);
        txtMontoCompra.setFocusable(false);
        txtMontoCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMontoCompra);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(230, 170, 100, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDescuento);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(230, 210, 100, 30);
        txtTotalPagar.setFocusable(false);
        txtTotalPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTotalPagar);

        txtLapiceros = new JTextField();
        txtLapiceros.setBounds(230, 250, 100, 30);
        txtLapiceros.setFocusable(false);
        txtLapiceros.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtLapiceros);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 290, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int docenas = Integer.parseInt(txtDocenas.getText());
        double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());
        
        double montoCompra = docenas * precioUnitario;
        double descuento = 0;
        double totalPagar;
        int lapiceros = 0;

        if (docenas >= 6) {
            if (docenas >= 30) {
                descuento = montoCompra * 0.15;
            } else {
                descuento = montoCompra * 0.10;
            }
        }

        totalPagar = montoCompra - descuento;

        if (docenas >= 30) {
            lapiceros = (docenas / 3) * 2;
        }

        txtMontoCompra.setText(String.format("S/. %.2f", montoCompra));
        txtDescuento.setText(String.format("S/. %.2f", descuento));
        txtTotalPagar.setText(String.format("S/. %.2f", totalPagar));
        txtLapiceros.setText(String.valueOf(lapiceros));
    }
}
