package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtIngreso, txtCostoCasa, txtCuotaInicial, txtCuotaMensual;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm16 frame = new frm16();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm16() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblIngreso = new JLabel("Ingreso mensual:");
        lblIngreso.setBounds(50, 50, 150, 30);
        getContentPane().add(lblIngreso);

        JLabel lblCostoCasa = new JLabel("Costo de la casa:");
        lblCostoCasa.setBounds(50, 90, 150, 30);
        getContentPane().add(lblCostoCasa);

        JLabel lblCuotaInicial = new JLabel("Cuota inicial:");
        lblCuotaInicial.setBounds(50, 130, 150, 30);
        getContentPane().add(lblCuotaInicial);

        JLabel lblCuotaMensual = new JLabel("Cuota mensual:");
        lblCuotaMensual.setBounds(50, 170, 150, 30);
        getContentPane().add(lblCuotaMensual);

        txtIngreso = new JTextField();
        txtIngreso.setBounds(200, 50, 100, 30);
        txtIngreso.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtIngreso);

        txtCostoCasa = new JTextField();
        txtCostoCasa.setBounds(200, 90, 100, 30);
        txtCostoCasa.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCostoCasa);

        txtCuotaInicial = new JTextField();
        txtCuotaInicial.setBounds(200, 130, 100, 30);
        txtCuotaInicial.setFocusable(false);
        txtCuotaInicial.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCuotaInicial);

        txtCuotaMensual = new JTextField();
        txtCuotaMensual.setBounds(200, 170, 100, 30);
        txtCuotaMensual.setFocusable(false);
        txtCuotaMensual.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCuotaMensual);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 220, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double ingreso = Double.parseDouble(txtIngreso.getText());
        double costoCasa = Double.parseDouble(txtCostoCasa.getText());

        double porcentajeInicial = ingreso < 1250 ? 0.15 : 0.30;
        int cuotas = ingreso < 1250 ? 120 : 75;

        double cuotaInicial = costoCasa * porcentajeInicial;
        double cuotaMensual = (costoCasa - cuotaInicial) / cuotas;

        txtCuotaInicial.setText(String.format("S/. %.2f", cuotaInicial));
        txtCuotaMensual.setText(String.format("S/. %.2f", cuotaMensual));
    }
}
