package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm27 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtMontoVendido, txtSueldoBruto, txtDescuento, txtSueldoNeto, txtPolos;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm27 frame = new frm27();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm27() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 350);
        setLayout(null);

        JLabel lblMontoVendido = new JLabel("Monto Vendido:");
        lblMontoVendido.setBounds(30, 30, 120, 30);
        add(lblMontoVendido);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(30, 70, 120, 30);
        add(lblSueldoBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(30, 110, 120, 30);
        add(lblDescuento);

        JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
        lblSueldoNeto.setBounds(30, 150, 120, 30);
        add(lblSueldoNeto);

        JLabel lblPolos = new JLabel("Polos Obsequiados:");
        lblPolos.setBounds(30, 190, 120, 30);
        add(lblPolos);

        txtMontoVendido = new JTextField();
        txtMontoVendido.setBounds(160, 30, 120, 30);
        add(txtMontoVendido);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(160, 70, 120, 30);
        txtSueldoBruto.setEditable(false);
        add(txtSueldoBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(160, 110, 120, 30);
        txtDescuento.setEditable(false);
        add(txtDescuento);

        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(160, 150, 120, 30);
        txtSueldoNeto.setEditable(false);
        add(txtSueldoNeto);

        txtPolos = new JTextField();
        txtPolos.setBounds(160, 190, 120, 30);
        txtPolos.setEditable(false);
        add(txtPolos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 250, 100, 30);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> calcular());
    }

    private void calcular() {
        double montoVendido = Double.parseDouble(txtMontoVendido.getText());
        double sueldoBasico = 600;
        double comision = montoVendido * 0.15;
        double sueldoBruto = sueldoBasico + comision;
        double descuento = sueldoBruto > 1800 ? sueldoBruto * 0.10 : sueldoBruto * 0.05;
        double sueldoNeto = sueldoBruto - descuento;
        int polos = montoVendido > 1000 ? 3 : 1;

        txtSueldoBruto.setText(String.format("%.2f", sueldoBruto));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtSueldoNeto.setText(String.format("%.2f", sueldoNeto));
        txtPolos.setText(String.valueOf(polos));
    }
}
