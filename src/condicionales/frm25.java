package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm25 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtSueldoBruto, txtHijos, txtBonificacion, txtSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm25 frame = new frm25();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm25() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 320, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(30, 30, 120, 30);
        add(lblSueldoBruto);

        JLabel lblHijos = new JLabel("Número de Hijos:");
        lblHijos.setBounds(30, 70, 120, 30);
        add(lblHijos);

        JLabel lblBonificacion = new JLabel("Bonificación:");
        lblBonificacion.setBounds(30, 110, 120, 30);
        add(lblBonificacion);

        JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
        lblSueldoNeto.setBounds(30, 150, 120, 30);
        add(lblSueldoNeto);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(160, 30, 100, 30);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        add(txtSueldoBruto);

        txtHijos = new JTextField();
        txtHijos.setBounds(160, 70, 100, 30);
        txtHijos.setHorizontalAlignment(SwingConstants.RIGHT);
        add(txtHijos);

        txtBonificacion = new JTextField();
        txtBonificacion.setBounds(160, 110, 100, 30);
        txtBonificacion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtBonificacion.setFocusable(false);
        add(txtBonificacion);

        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(160, 150, 100, 30);
        txtSueldoNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSueldoNeto.setFocusable(false);
        add(txtSueldoNeto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(90, 200, 120, 30);
        btnCalcular.addActionListener(e -> calcular());
        add(btnCalcular);
    }

    private void calcular() {
        double sueldoBruto = Double.parseDouble(txtSueldoBruto.getText());
        int hijos = Integer.parseInt(txtHijos.getText());
        double bonificacion;

        if (hijos > 1) {
            bonificacion = sueldoBruto * 0.125 + (40 * hijos);
        } else {
            bonificacion = sueldoBruto * 0.10;
        }

        double sueldoNeto = sueldoBruto + bonificacion;

        txtBonificacion.setText(String.format("%.2f", bonificacion));
        txtSueldoNeto.setText(String.format("%.2f", sueldoNeto));
    }
}
