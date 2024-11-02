package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtAporteJuan, txtAporteRosa, txtAporteDaniel, txtTotalDolares, txtPorcentajeJuan, txtPorcentajeRosa, txtPorcentajeDaniel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm15 frame = new frm15();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm15() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 450);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblAporteJuan = new JLabel("Aporte de Juan (USD):");
        lblAporteJuan.setBounds(50, 30, 150, 30);
        getContentPane().add(lblAporteJuan);

        JLabel lblAporteRosa = new JLabel("Aporte de Rosa (USD):");
        lblAporteRosa.setBounds(50, 70, 150, 30);
        getContentPane().add(lblAporteRosa);

        JLabel lblAporteDaniel = new JLabel("Aporte de Daniel (S/.):");
        lblAporteDaniel.setBounds(50, 110, 150, 30);
        getContentPane().add(lblAporteDaniel);

        JLabel lblTotalDolares = new JLabel("Total en Dólares:");
        lblTotalDolares.setBounds(50, 150, 150, 30);
        getContentPane().add(lblTotalDolares);

        JLabel lblPorcentajeJuan = new JLabel("Porcentaje Juan:");
        lblPorcentajeJuan.setBounds(50, 190, 150, 30);
        getContentPane().add(lblPorcentajeJuan);

        JLabel lblPorcentajeRosa = new JLabel("Porcentaje Rosa:");
        lblPorcentajeRosa.setBounds(50, 230, 150, 30);
        getContentPane().add(lblPorcentajeRosa);

        JLabel lblPorcentajeDaniel = new JLabel("Porcentaje Daniel:");
        lblPorcentajeDaniel.setBounds(50, 270, 150, 30);
        getContentPane().add(lblPorcentajeDaniel);

        txtAporteJuan = new JTextField();
        txtAporteJuan.setBounds(220, 30, 80, 30);
        txtAporteJuan.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtAporteJuan);

        txtAporteRosa = new JTextField();
        txtAporteRosa.setBounds(220, 70, 80, 30);
        txtAporteRosa.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtAporteRosa);

        txtAporteDaniel = new JTextField();
        txtAporteDaniel.setBounds(220, 110, 80, 30);
        txtAporteDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtAporteDaniel);

        txtTotalDolares = new JTextField();
        txtTotalDolares.setBounds(220, 150, 80, 30);
        txtTotalDolares.setFocusable(false);
        txtTotalDolares.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTotalDolares);

        txtPorcentajeJuan = new JTextField();
        txtPorcentajeJuan.setBounds(220, 190, 80, 30);
        txtPorcentajeJuan.setFocusable(false);
        txtPorcentajeJuan.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPorcentajeJuan);

        txtPorcentajeRosa = new JTextField();
        txtPorcentajeRosa.setBounds(220, 230, 80, 30);
        txtPorcentajeRosa.setFocusable(false);
        txtPorcentajeRosa.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPorcentajeRosa);

        txtPorcentajeDaniel = new JTextField();
        txtPorcentajeDaniel.setBounds(220, 270, 80, 30);
        txtPorcentajeDaniel.setFocusable(false);
        txtPorcentajeDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPorcentajeDaniel);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setMnemonic('a');
        btnCalcular.setBounds(220, 300, 80, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double aporteJuan = Double.parseDouble(txtAporteJuan.getText());
        double aporteRosa = Double.parseDouble(txtAporteRosa.getText());
        double aporteDaniel = Double.parseDouble(txtAporteDaniel.getText());

        double aporteDanielDolares = aporteDaniel / 3.0;
        double totalDolares = aporteJuan + aporteRosa + aporteDanielDolares;

        double porcentajeJuan = (aporteJuan / totalDolares) * 100;
        double porcentajeRosa = (aporteRosa / totalDolares) * 100;
        double porcentajeDaniel = (aporteDanielDolares / totalDolares) * 100;

        txtTotalDolares.setText(String.format("%.2f", totalDolares));
        txtPorcentajeJuan.setText(String.format("%.2f", porcentajeJuan) + " %");
        txtPorcentajeRosa.setText(String.format("%.2f", porcentajeRosa) + " %");
        txtPorcentajeDaniel.setText(String.format("%.2f", porcentajeDaniel) + " %");
    }
}