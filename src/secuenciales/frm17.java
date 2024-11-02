package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm17 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDonacionTotal, txtCentroSalud, txtComedorInfantil, txtEscuelaInfantil, txtAsiloAncianos;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm17 frame = new frm17();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm17() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDonacionTotal = new JLabel("Donacion Total:");
        lblDonacionTotal.setBounds(50, 30, 150, 30);
        getContentPane().add(lblDonacionTotal);

        JLabel lblCentroSalud = new JLabel("Centro de salud:");
        lblCentroSalud.setBounds(50, 70, 150, 30);
        getContentPane().add(lblCentroSalud);

        JLabel lblComedorInfantil = new JLabel("Comedor infantil:");
        lblComedorInfantil.setBounds(50, 110, 150, 30);
        getContentPane().add(lblComedorInfantil);
        
        JLabel lblEscuelaInfantil = new JLabel("Escuela infantil:");
        lblEscuelaInfantil.setBounds(50, 150, 150, 30);
        getContentPane().add(lblEscuelaInfantil);

        JLabel lblAsiloAncianos = new JLabel("Asilo de ancianos:");
        lblAsiloAncianos.setBounds(50, 190, 150, 30);
        getContentPane().add(lblAsiloAncianos);


        txtDonacionTotal = new JTextField();
        txtDonacionTotal.setBounds(220, 30, 80, 30);
        txtDonacionTotal.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDonacionTotal);

        txtCentroSalud = new JTextField();
        txtCentroSalud.setBounds(220, 70, 80, 30);
        txtCentroSalud.setFocusable(false);
        txtCentroSalud.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCentroSalud);

        txtComedorInfantil = new JTextField();
        txtComedorInfantil.setBounds(220, 110, 80, 30);
        txtComedorInfantil.setFocusable(false);
        txtComedorInfantil.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtComedorInfantil);

        txtEscuelaInfantil = new JTextField();
        txtEscuelaInfantil.setBounds(220, 150, 80, 30);
        txtEscuelaInfantil.setFocusable(false);
        txtEscuelaInfantil.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtEscuelaInfantil);

        txtAsiloAncianos = new JTextField();
        txtAsiloAncianos.setBounds(220, 190, 80, 30);
        txtAsiloAncianos.setFocusable(false);
        txtAsiloAncianos.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtAsiloAncianos);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double donacionTotal = Double.parseDouble(txtDonacionTotal.getText());

        double montoCentroSalud = donacionTotal * 0.25;
        double montoComedorInfantil = donacionTotal * 0.35;
        double montoEscuelaInfantil = donacionTotal * 0.25;
        double montoAsiloAncianos = donacionTotal * (1 - 0.25 - 0.35 - 0.25); // Resto

        txtCentroSalud.setText(String.format("%.2f", montoCentroSalud));
        txtComedorInfantil.setText(String.format("%.2f", montoComedorInfantil));
        txtEscuelaInfantil.setText(String.format("%.2f", montoEscuelaInfantil));
        txtAsiloAncianos.setText(String.format("%.2f", montoAsiloAncianos));
    }
}
