package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frm30 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtCuota, txtDiaPago, txtTotalAPagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm30 frame = new frm30();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm30() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 250);
        setLayout(null);

        JLabel lblCuota = new JLabel("Monto de la cuota:");
        lblCuota.setBounds(30, 30, 120, 30);
        add(lblCuota);

        JLabel lblDiaPago = new JLabel("Día de pago:");
        lblDiaPago.setBounds(30, 70, 120, 30);
        add(lblDiaPago);

        JLabel lblTotalAPagar = new JLabel("Total a pagar:");
        lblTotalAPagar.setBounds(30, 110, 120, 30);
        add(lblTotalAPagar);

        txtCuota = new JTextField();
        txtCuota.setBounds(160, 30, 150, 30);
        add(txtCuota);

        txtDiaPago = new JTextField();
        txtDiaPago.setBounds(160, 70, 150, 30);
        add(txtDiaPago);

        txtTotalAPagar = new JTextField();
        txtTotalAPagar.setBounds(160, 110, 150, 30);
        txtTotalAPagar.setEditable(false);
        add(txtTotalAPagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130, 150, 100, 30);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> calcularPago());
    }

    private void calcularPago() {
        try {
            double cuota = Double.parseDouble(txtCuota.getText());
            int diaPago = Integer.parseInt(txtDiaPago.getText());

            double totalAPagar;

            if (diaPago <= 10) {
                double descuento = Math.max(5, 0.02 * cuota);
                totalAPagar = cuota - descuento;
            } else if (diaPago <= 20) {
                totalAPagar = cuota; // Sin descuento
            } else {
                double recargo = Math.max(10, 0.03 * cuota);
                totalAPagar = cuota + recargo;
            }

            txtTotalAPagar.setText(String.format("%.2f", totalAPagar));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
