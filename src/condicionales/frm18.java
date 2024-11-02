package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm18 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDonacion, txtCentroSalud, txtComedorNinos, txtInversion;

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

        JLabel lblDonacion = new JLabel("Monto de la donación:");
        lblDonacion.setBounds(50, 50, 150, 30);
        getContentPane().add(lblDonacion);

        JLabel lblCentroSalud = new JLabel("Centro de Salud:");
        lblCentroSalud.setBounds(50, 90, 150, 30);
        getContentPane().add(lblCentroSalud);

        JLabel lblComedorNinos = new JLabel("Comedor de Niños:");
        lblComedorNinos.setBounds(50, 130, 150, 30);
        getContentPane().add(lblComedorNinos);

        JLabel lblInversion = new JLabel("Inversión en la Bolsa:");
        lblInversion.setBounds(50, 170, 150, 30);
        getContentPane().add(lblInversion);

        txtDonacion = new JTextField();
        txtDonacion.setBounds(220, 50, 100, 30);
        txtDonacion.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDonacion);

        txtCentroSalud = new JTextField();
        txtCentroSalud.setBounds(220, 90, 100, 30);
        txtCentroSalud.setFocusable(false);
        txtCentroSalud.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCentroSalud);

        txtComedorNinos = new JTextField();
        txtComedorNinos.setBounds(220, 130, 100, 30);
        txtComedorNinos.setFocusable(false);
        txtComedorNinos.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtComedorNinos);

        txtInversion = new JTextField();
        txtInversion.setBounds(220, 170, 100, 30);
        txtInversion.setFocusable(false);
        txtInversion.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtInversion);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 210, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double donacion = Double.parseDouble(txtDonacion.getText());
        double centroSalud, comedorNinos, inversion;

        if (donacion >= 10000) {
            centroSalud = donacion * 0.30;
            comedorNinos = donacion * 0.50;
        } else {
            centroSalud = donacion * 0.25;
            comedorNinos = donacion * 0.60;
        }
        
        inversion = donacion - (centroSalud + comedorNinos);

        txtCentroSalud.setText(String.format("S/. %.2f", centroSalud));
        txtComedorNinos.setText(String.format("S/. %.2f", comedorNinos));
        txtInversion.setText(String.format("S/. %.2f", inversion));
    }
}
