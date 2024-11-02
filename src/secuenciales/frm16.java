package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHorasTrabajadas, txtTarifaHoraria, txtSueldoBasico, txtSueldoBruto, txtSueldoNeto;

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

        JLabel lblHorasTrabajadas = new JLabel("Horas Trabajadas:");
        lblHorasTrabajadas.setBounds(50, 30, 150, 30);
        getContentPane().add(lblHorasTrabajadas);

        JLabel lblTarifaHoraria = new JLabel("Tarifa Horaria:");
        lblTarifaHoraria.setBounds(50, 70, 150, 30);
        getContentPane().add(lblTarifaHoraria);

        JLabel lblSueldoBasico = new JLabel("Sueldo Básico:");
        lblSueldoBasico.setBounds(50, 110, 150, 30);
        getContentPane().add(lblSueldoBasico);

        JLabel lblSueldoBruto = new JLabel("Sueldo Bruto:");
        lblSueldoBruto.setBounds(50, 150, 150, 30);
        getContentPane().add(lblSueldoBruto);

        JLabel lblSueldoNeto = new JLabel("Sueldo Neto:");
        lblSueldoNeto.setBounds(50, 190, 150, 30);
        getContentPane().add(lblSueldoNeto);

        txtHorasTrabajadas = new JTextField();
        txtHorasTrabajadas.setBounds(220, 30, 80, 30);
        txtHorasTrabajadas.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtHorasTrabajadas);

        txtTarifaHoraria = new JTextField();
        txtTarifaHoraria.setBounds(220, 70, 80, 30);
        txtTarifaHoraria.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTarifaHoraria);

        txtSueldoBasico = new JTextField();
        txtSueldoBasico.setBounds(220, 110, 80, 30);
        txtSueldoBasico.setFocusable(false);
        txtSueldoBasico.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSueldoBasico);

        txtSueldoBruto = new JTextField();
        txtSueldoBruto.setBounds(220, 150, 80, 30);
        txtSueldoBruto.setFocusable(false);
        txtSueldoBruto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSueldoBruto);

        txtSueldoNeto = new JTextField();
        txtSueldoNeto.setBounds(220, 190, 80, 30);
        txtSueldoNeto.setFocusable(false);
        txtSueldoNeto.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtSueldoNeto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 230, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double horasTrabajadas = Double.parseDouble(txtHorasTrabajadas.getText());
        double tarifaHoraria = Double.parseDouble(txtTarifaHoraria.getText());

        double sueldoBasico = horasTrabajadas * tarifaHoraria;
        double sueldoBruto = sueldoBasico * 1.2; 
        double sueldoNeto = sueldoBruto * 0.9;   

        txtSueldoBasico.setText(String.format("%.2f", sueldoBasico));
        txtSueldoBruto.setText(String.format("%.2f", sueldoBruto));
        txtSueldoNeto.setText(String.format("%.2f", sueldoNeto));
    }
}
