package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frm31 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtHorasTrabajadas, txtCategoria, txtSueldoBruto, txtDescuento, txtSueldoNeto;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm31 frame = new frm31();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm31() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setLayout(null);

        JLabel lblHorasTrabajadas = new JLabel("Horas trabajadas:");
        lblHorasTrabajadas.setBounds(30, 30, 150, 30);
        add(lblHorasTrabajadas);

        JLabel lblCategoria = new JLabel("Categoría (A, B, C, D):");
        lblCategoria.setBounds(30, 70, 150, 30);
        add(lblCategoria);

        JLabel lblSueldoBruto = new JLabel("Sueldo bruto:");
        lblSueldoBruto.setBounds(30, 110, 150, 30);
        add(lblSueldoBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(30, 150, 150, 30);
        add(lblDescuento);

        JLabel lblSueldoNeto = new JLabel("Sueldo neto:");
        lblSueldoNeto.setBounds(30, 190, 150, 30);
        add(lblSueldoNeto);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(200, 30, 150, 30);
        add(txtHorasTrabajadas);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(200, 70, 150, 30);
        add(txtCategoria);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(200, 110, 150, 30);
        txtSueldoBruto.setEditable(false);
        add(txtSueldoBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(200, 150, 150, 30);
        txtDescuento.setEditable(false);
        add(txtDescuento);

        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(200, 190, 150, 30);
        txtSueldoNeto.setEditable(false);
        add(txtSueldoNeto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> calcularSueldo());
    }

    private void calcularSueldo() {
        try {
            double horas = Double.parseDouble(txtHorasTrabajadas.getText());
            String categoria = txtCategoria.getText().toUpperCase();
            double tarifa = 0;

            if (categoria.equals("A")) tarifa = 21.00;
            else if (categoria.equals("B")) tarifa = 19.50;
            else if (categoria.equals("C")) tarifa = 17.00;
            else if (categoria.equals("D")) tarifa = 15.50;
            else {
                JOptionPane.showMessageDialog(this, "Categoría inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double sueldoBruto = horas * tarifa;
            double descuento = (sueldoBruto > 2500) ? sueldoBruto * 0.20 : sueldoBruto * 0.15;
            double sueldoNeto = sueldoBruto - descuento;

            txtSueldoBruto.setText(String.format("%.2f", sueldoBruto));
            txtDescuento.setText(String.format("%.2f", descuento));
            txtSueldoNeto.setText(String.format("%.2f", sueldoNeto));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
