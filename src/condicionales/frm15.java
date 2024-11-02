package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtVentas, txtComision, txtBruto, txtDescuento, txtNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm15 frame = new frm15();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblVentas = new JLabel("Monto vendido:");
        lblVentas.setBounds(50, 50, 150, 30);
        getContentPane().add(lblVentas);

        JLabel lblComision = new JLabel("Comisión:");
        lblComision.setBounds(50, 90, 150, 30);
        getContentPane().add(lblComision);

        JLabel lblBruto = new JLabel("Sueldo Bruto:");
        lblBruto.setBounds(50, 130, 150, 30);
        getContentPane().add(lblBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 170, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblNeto = new JLabel("Sueldo Neto:");
        lblNeto.setBounds(50, 210, 150, 30);
        getContentPane().add(lblNeto);

        txtVentas = new JTextField();
        txtVentas.setBounds(200, 50, 100, 30);
        txtVentas.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtVentas);

        txtComision = new JTextField();
        txtComision.setBounds(200, 90, 100, 30);
        txtComision.setFocusable(false);
        txtComision.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtComision);

        txtBruto = new JTextField();
        txtBruto.setBounds(200, 130, 100, 30);
        txtBruto.setFocusable(false);
        txtBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(200, 170, 100, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDescuento);

        txtNeto = new JTextField();
        txtNeto.setBounds(200, 210, 100, 30);
        txtNeto.setFocusable(false);
        txtNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNeto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 260, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double ventas = Double.parseDouble(txtVentas.getText());
        double sueldoBasico = 250;
        double porcentajeComision;

        if (ventas <= 5000) porcentajeComision = 0.05;
        else if (ventas <= 10000) porcentajeComision = 0.08;
        else if (ventas <= 20000) porcentajeComision = 0.10;
        else porcentajeComision = 0.15;

        double comision = ventas * porcentajeComision;
        double sueldoBruto = sueldoBasico + comision;
        double porcentajeDescuento = sueldoBruto > 3500 ? 0.15 : 0.08;
        double descuento = sueldoBruto * porcentajeDescuento;
        double sueldoNeto = sueldoBruto - descuento;

        txtComision.setText(String.format("S/. %.2f", comision));
        txtBruto.setText(String.format("S/. %.2f", sueldoBruto));
        txtDescuento.setText(String.format("S/. %.2f", descuento));
        txtNeto.setText(String.format("S/. %.2f", sueldoNeto));
    }
}
