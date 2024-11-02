package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMontoVendido, txtComision, txtSueldoBruto, txtDescuento, txtSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm19 frame = new frm19();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm19() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMontoVendido = new JLabel("Monto Total Vendido:");
        lblMontoVendido.setBounds(50, 30, 150, 30);
        getContentPane().add(lblMontoVendido);

        JLabel lblComision = new JLabel("Comisión:");
        lblComision.setBounds(50, 70, 150, 30);
        getContentPane().add(lblComision);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(50, 110, 150, 30);
        getContentPane().add(lblSueldoBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
        lblSueldoNeto.setBounds(50, 190, 150, 30);
        getContentPane().add(lblSueldoNeto);

        txtMontoVendido = new JTextField();
        txtMontoVendido.setBounds(220, 30, 80, 30);
        txtMontoVendido.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtMontoVendido);

        txtComision = new JTextField();
        txtComision.setBounds(220, 70, 80, 30);
        txtComision.setFocusable(false);
        txtComision.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtComision);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(220, 110, 80, 30);
        txtSueldoBruto.setFocusable(false);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSueldoBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(220, 150, 80, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDescuento);

        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(220, 190, 80, 30);
        txtSueldoNeto.setFocusable(false);
        txtSueldoNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSueldoNeto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double montoVendido = Double.parseDouble(txtMontoVendido.getText());
        double sueldoBasico = 500.0;

        double comision = montoVendido * 0.09;
        double sueldoBruto = sueldoBasico + comision;
        double descuento = sueldoBruto * 0.11;
        double sueldoNeto = sueldoBruto - descuento;

        txtComision.setText(String.format("%.2f", comision));
        txtSueldoBruto.setText(String.format("%.2f", sueldoBruto));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtSueldoNeto.setText(String.format("%.2f", sueldoNeto));
    }
}
