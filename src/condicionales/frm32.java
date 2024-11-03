package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frm32 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtPromedio, txtPensionActual, txtDescuento, txtNuevaPension;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm32 frame = new frm32();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm32() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setLayout(null);

        JLabel lblPromedio = new JLabel("Promedio ponderado:");
        lblPromedio.setBounds(30, 30, 150, 30);
        add(lblPromedio);

        JLabel lblPensionActual = new JLabel("Pensión actual:");
        lblPensionActual.setBounds(30, 70, 150, 30);
        add(lblPensionActual);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(30, 110, 150, 30);
        add(lblDescuento);

        JLabel lblNuevaPension = new JLabel("Nueva pensión:");
        lblNuevaPension.setBounds(30, 150, 150, 30);
        add(lblNuevaPension);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(200, 30, 150, 30);
        add(txtPromedio);

        txtPensionActual = new JTextField();
        txtPensionActual.setBounds(200, 70, 150, 30);
        txtPensionActual.setEditable(false);
        add(txtPensionActual);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(200, 110, 150, 30);
        txtDescuento.setEditable(false);
        add(txtDescuento);

        txtNuevaPension = new JTextField();
        txtNuevaPension.setBounds(200, 150, 150, 30);
        txtNuevaPension.setEditable(false);
        add(txtNuevaPension);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 200, 100, 30);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> calcularPension());
    }

    private void calcularPension() {
        try {
            double promedio = Double.parseDouble(txtPromedio.getText());
            double pensionActual = 0;
            double descuento = 0;

            if (promedio < 14) {
                pensionActual = 550; // Categoría A
                descuento = 0;
            } else if (promedio < 16) {
                pensionActual = 500; // Categoría B
                descuento = 0.10 * pensionActual;
            } else if (promedio < 18) {
                pensionActual = 450; // Categoría C
                descuento = 0.12 * pensionActual;
            } else {
                pensionActual = 400; // Categoría D
                descuento = 0.15 * pensionActual;
            }

            double nuevaPension = pensionActual - descuento;

            txtPensionActual.setText(String.format("%.2f", pensionActual));
            txtDescuento.setText(String.format("%.2f", descuento));
            txtNuevaPension.setText(String.format("%.2f", nuevaPension));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un promedio válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
