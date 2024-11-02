package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtTarjeta, txtCompra, txtDescuento;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm14 frame = new frm14();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblTarjeta = new JLabel("Número de tarjeta:");
        lblTarjeta.setBounds(50, 50, 120, 30);
        getContentPane().add(lblTarjeta);

        JLabel lblCompra = new JLabel("Monto de compra:");
        lblCompra.setBounds(50, 90, 120, 30);
        getContentPane().add(lblCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 130, 120, 30);
        getContentPane().add(lblDescuento);

        txtTarjeta = new JTextField();
        txtTarjeta.setBounds(180, 50, 80, 30);
        txtTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTarjeta);

        txtCompra = new JTextField();
        txtCompra.setBounds(180, 90, 80, 30);
        txtCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCompra);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(180, 130, 80, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDescuento);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 180, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int tarjeta = Integer.parseInt(txtTarjeta.getText());
        double compra = Double.parseDouble(txtCompra.getText());
        
        double descuento = (tarjeta >= 100 && tarjeta % 2 == 0) ? compra * 0.15 : compra * 0.05;
        txtDescuento.setText(String.format("S/. %.2f", descuento));
    }
}
