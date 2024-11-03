package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm23 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtMatematicas, txtFisica, txtPropina, txtRegalo;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm23 frame = new frm23();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm23() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 350, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblMatematicas = new JLabel("Nota Matemáticas:");
        lblMatematicas.setBounds(30, 30, 130, 30);
        add(lblMatematicas);

        JLabel lblFisica = new JLabel("Nota Física:");
        lblFisica.setBounds(30, 70, 130, 30);
        add(lblFisica);

        JLabel lblPropina = new JLabel("Propina Total:");
        lblPropina.setBounds(30, 110, 130, 30);
        add(lblPropina);

        JLabel lblRegalo = new JLabel("Regalo:");
        lblRegalo.setBounds(30, 150, 130, 30);
        add(lblRegalo);

        txtMatematicas = new JTextField();
        txtMatematicas.setBounds(170, 30, 100, 30);
        txtMatematicas.setHorizontalAlignment(SwingConstants.RIGHT);
        add(txtMatematicas);

        txtFisica = new JTextField();
        txtFisica.setBounds(170, 70, 100, 30);
        txtFisica.setHorizontalAlignment(SwingConstants.RIGHT);
        add(txtFisica);

        txtPropina = new JTextField();
        txtPropina.setBounds(170, 110, 100, 30);
        txtPropina.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPropina.setFocusable(false);
        add(txtPropina);

        txtRegalo = new JTextField();
        txtRegalo.setBounds(170, 150, 100, 30);
        txtRegalo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRegalo.setFocusable(false);
        add(txtRegalo);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 200, 100, 30);
        btnCalcular.addActionListener(e -> calcular());
        add(btnCalcular);
    }

    private void calcular() {
        double notaMatematicas = Double.parseDouble(txtMatematicas.getText());
        double notaFisica = Double.parseDouble(txtFisica.getText());

        double propinaMatematicas = (notaMatematicas > 17) ? 3 : notaMatematicas;
        double propinaFisica = (notaFisica > 15) ? 2 : notaFisica * 0.5;
        double propinaTotal = propinaMatematicas + propinaFisica;

        double promedio = (notaMatematicas + notaFisica) / 2;
        String regalo = (promedio > 16) ? "Reloj" : "No hay regalo";

        txtPropina.setText(String.format("%.2f", propinaTotal));
        txtRegalo.setText(regalo);
    }
}
