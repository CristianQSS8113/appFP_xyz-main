package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm22 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtUnidadesA, txtUnidadesB, txtImporteBruto, txtDescuento, txtTotal;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm22 frame = new frm22();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm22() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblUnidadesA = new JLabel("Unidades A:");
        lblUnidadesA.setBounds(30, 30, 100, 30);
        add(lblUnidadesA);

        JLabel lblUnidadesB = new JLabel("Unidades B:");
        lblUnidadesB.setBounds(30, 70, 100, 30);
        add(lblUnidadesB);

        JLabel lblImporteBruto = new JLabel("Importe Bruto:");
        lblImporteBruto.setBounds(30, 110, 100, 30);
        add(lblImporteBruto);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(30, 150, 100, 30);
        add(lblDescuento);

        JLabel lblTotal = new JLabel("Total a Pagar:");
        lblTotal.setBounds(30, 190, 100, 30);
        add(lblTotal);

        txtUnidadesA = new JTextField();
        txtUnidadesA.setBounds(150, 30, 100, 30);
        txtUnidadesA.setHorizontalAlignment(SwingConstants.RIGHT);
        add(txtUnidadesA);

        txtUnidadesB = new JTextField();
        txtUnidadesB.setBounds(150, 70, 100, 30);
        txtUnidadesB.setHorizontalAlignment(SwingConstants.RIGHT);
        add(txtUnidadesB);

        txtImporteBruto = new JTextField();
        txtImporteBruto.setBounds(150, 110, 100, 30);
        txtImporteBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        txtImporteBruto.setFocusable(false);
        add(txtImporteBruto);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(150, 150, 100, 30);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescuento.setFocusable(false);
        add(txtDescuento);

        txtTotal = new JTextField();
        txtTotal.setBounds(150, 190, 100, 30);
        txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        txtTotal.setFocusable(false);
        add(txtTotal);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 240, 100, 30);
        btnCalcular.addActionListener(e -> calcular());
        add(btnCalcular);
    }

    private void calcular() {
        int unidadesA = Integer.parseInt(txtUnidadesA.getText());
        int unidadesB = Integer.parseInt(txtUnidadesB.getText());

        double precioA = 25;
        double precioB = 30;

        double importeA = unidadesA * precioA;
        double importeB = unidadesB * precioB;

        double descuentoA = unidadesA > 50 ? importeA * 0.15 : 0;
        double descuentoB = unidadesB > 60 ? importeB * 0.10 : 0;

        double importeBruto = importeA + importeB;
        double totalDescuento = descuentoA + descuentoB;
        double total = importeBruto - totalDescuento;

        txtImporteBruto.setText(String.format("%.2f", importeBruto));
        txtDescuento.setText(String.format("%.2f", totalDescuento));
        txtTotal.setText(String.format("%.2f", total));
    }
}
