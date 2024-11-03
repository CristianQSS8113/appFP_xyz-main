package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frm29 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtHorasTrabajadas, txtTarifaHora, txtSueldoBruto, txtDescuento, txtTotalPagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm29 frame = new frm29();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm29() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setLayout(null);

        JLabel lblHorasTrabajadas = new JLabel("Horas trabajadas:");
        lblHorasTrabajadas.setBounds(30, 30, 120, 30);
        add(lblHorasTrabajadas);

        JLabel lblTarifaHora = new JLabel("Tarifa por hora:");
        lblTarifaHora.setBounds(30, 70, 120, 30);
        add(lblTarifaHora);

        JLabel lblSueldoBruto = new JLabel("Sueldo bruto:");
        lblSueldoBruto.setBounds(30, 110, 120, 30);
        add(lblSueldoBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(30, 150, 120, 30);
        add(lblDescuento);

        JLabel lblTotalPagar = new JLabel("Total a pagar:");
        lblTotalPagar.setBounds(30, 190, 120, 30);
        add(lblTotalPagar);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(160, 30, 150, 30);
        add(txtHorasTrabajadas);

        txtTarifaHora = new JTextField();
        txtTarifaHora.setBounds(160, 70, 150, 30);
        add(txtTarifaHora);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(160, 110, 150, 30);
        txtSueldoBruto.setEditable(false);
        add(txtSueldoBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(160, 150, 150, 30);
        txtDescuento.setEditable(false);
        add(txtDescuento);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(160, 190, 150, 30);
        txtTotalPagar.setEditable(false);
        add(txtTotalPagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130, 230, 100, 30);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> calcularSueldo());
    }

    private void calcularSueldo() {
        try {
            int horasTrabajadas = Integer.parseInt(txtHorasTrabajadas.getText());
            double tarifaHora = Double.parseDouble(txtTarifaHora.getText());

            double sueldoBruto, descuento = 0, totalPagar;

            if (horasTrabajadas <= 48) {
                sueldoBruto = horasTrabajadas * tarifaHora;
            } else {
                int horasExtras = horasTrabajadas - 48;
                sueldoBruto = (48 * tarifaHora) + (horasExtras * tarifaHora * 1.2);
            }

            if (sueldoBruto > 1500) {
                descuento = sueldoBruto * 0.11;
            }

            totalPagar = sueldoBruto - descuento;

            txtSueldoBruto.setText(String.format("%.2f", sueldoBruto));
            txtDescuento.setText(String.format("%.2f", descuento));
            txtTotalPagar.setText(String.format("%.2f", totalPagar));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
