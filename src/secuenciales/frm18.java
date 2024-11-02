package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtUnidades, txtPrecioUnitario, txtImporteCompra, txtDescuento, txtImportePagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm18 frame = new frm18();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm18() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblUnidades = new JLabel("Cantidad de unidades:");
        lblUnidades.setBounds(50, 30, 150, 30);
        getContentPane().add(lblUnidades);

        JLabel lblPrecioUnitario = new JLabel("Precio unitario:");
        lblPrecioUnitario.setBounds(50, 70, 150, 30);
        getContentPane().add(lblPrecioUnitario);

        JLabel lblImporteCompra = new JLabel("Importe de la compra:");
        lblImporteCompra.setBounds(50, 110, 150, 30);
        getContentPane().add(lblImporteCompra);

        JLabel lblDescuento = new JLabel("Descuento total:");
        lblDescuento.setBounds(50, 150, 150, 30);
        getContentPane().add(lblDescuento);

        JLabel lblImportePagar = new JLabel("Importe a pagar:");
        lblImportePagar.setBounds(50, 190, 150, 30);
        getContentPane().add(lblImportePagar);

        txtUnidades = new JTextField();
        txtUnidades.setBounds(220, 30, 80, 30);
        txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtUnidades);

        txtPrecioUnitario = new JTextField();
        txtPrecioUnitario.setBounds(220, 70, 80, 30);
        txtPrecioUnitario.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPrecioUnitario);

        txtImporteCompra = new JTextField();
        txtImporteCompra.setBounds(220, 110, 80, 30);
        txtImporteCompra.setFocusable(false);
        txtImporteCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtImporteCompra);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(220, 150, 80, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDescuento);

        txtImportePagar = new JTextField();
        txtImportePagar.setBounds(220, 190, 80, 30);
        txtImportePagar.setFocusable(false);
        txtImportePagar.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtImportePagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int unidades = Integer.parseInt(txtUnidades.getText());
        double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());

        double importeCompra = unidades * precioUnitario;
        double primerDescuento = importeCompra * 0.15;
        double importeDespuesPrimerDescuento = importeCompra - primerDescuento;
        double segundoDescuento = importeDespuesPrimerDescuento * 0.15;
        double descuentoTotal = primerDescuento + segundoDescuento;
        double importePagar = importeCompra - descuentoTotal;

        txtImporteCompra.setText(String.format("%.2f", importeCompra));
        txtDescuento.setText(String.format("%.2f", descuentoTotal));
        txtImportePagar.setText(String.format("%.2f", importePagar));
    }
}
