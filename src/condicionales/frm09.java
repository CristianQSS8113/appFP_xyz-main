package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm09 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCodigo, txtUnidades, txtImporteCompra, txtDescuento, txtTotalPagar;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm09 frame = new frm09();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm09() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(50, 30, 100, 30);
        getContentPane().add(lblCodigo);

        JLabel lblUnidades = new JLabel("Unidades:");
        lblUnidades.setBounds(50, 70, 100, 30);
        getContentPane().add(lblUnidades);

        JLabel lblImporteCompra = new JLabel("Importe Compra:");
        lblImporteCompra.setBounds(50, 110, 100, 30);
        getContentPane().add(lblImporteCompra);

        JLabel lblDescuento = new JLabel("Descuento:");
        lblDescuento.setBounds(50, 150, 100, 30);
        getContentPane().add(lblDescuento);

        JLabel lblTotalPagar = new JLabel("Total a Pagar:");
        lblTotalPagar.setBounds(50, 190, 100, 30);
        getContentPane().add(lblTotalPagar);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(150, 30, 100, 30);
        txtCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCodigo);

        txtUnidades = new JTextField();
        txtUnidades.setBounds(150, 70, 100, 30);
        txtUnidades.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtUnidades);

        txtImporteCompra = new JTextField();
        txtImporteCompra.setBounds(150, 110, 100, 30);
        txtImporteCompra.setFocusable(false);
        txtImporteCompra.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtImporteCompra);

        txtDescuento = new JTextField();
        txtDescuento.setBounds(150, 150, 100, 30);
        txtDescuento.setFocusable(false);
        txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDescuento);

        txtTotalPagar = new JTextField();
        txtTotalPagar.setBounds(150, 190, 100, 30);
        txtTotalPagar.setFocusable(false);
        txtTotalPagar.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTotalPagar);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 240, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int codigo = Integer.parseInt(txtCodigo.getText());
        int unidades = Integer.parseInt(txtUnidades.getText());
        double precioUnitario = 0;
        double descuentoPorcentaje = 0;

        if (codigo == 101) {
            precioUnitario = 17;
            if (unidades >= 1 && unidades <= 10) {
                descuentoPorcentaje = 5;
            }
        } else if (codigo == 102) {
            precioUnitario = 25;
            if (unidades >= 11 && unidades <= 20) {
                descuentoPorcentaje = 8;
            }
        } else if (codigo == 103) {
            precioUnitario = 16;
            if (unidades >= 21 && unidades <= 30) {
                descuentoPorcentaje = 10;
            }
        } else if (codigo == 104) {
            precioUnitario = 27;
            if (unidades >= 31) {
                descuentoPorcentaje = 13;
            }
        }

        double importeCompra = precioUnitario * unidades;
        double descuento = (importeCompra * descuentoPorcentaje) / 100;
        double totalPagar = importeCompra - descuento;

        txtImporteCompra.setText(String.format("%.2f", importeCompra));
        txtDescuento.setText(String.format("%.2f", descuento));
        txtTotalPagar.setText(String.format("%.2f", totalPagar));
    }
}
