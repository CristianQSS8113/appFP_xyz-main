package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtNumero3, txtNumeroIntermedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm07 frame = new frm07();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm07() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero1 = new JLabel("Número 1:");
        lblNumero1.setBounds(50, 30, 100, 30);
        getContentPane().add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Número 2:");
        lblNumero2.setBounds(50, 70, 100, 30);
        getContentPane().add(lblNumero2);

        JLabel lblNumero3 = new JLabel("Número 3:");
        lblNumero3.setBounds(50, 110, 100, 30);
        getContentPane().add(lblNumero3);

        JLabel lblNumeroIntermedio = new JLabel("Número Intermedio:");
        lblNumeroIntermedio.setBounds(50, 150, 150, 30);
        getContentPane().add(lblNumeroIntermedio);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(180, 30, 100, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero1);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(180, 70, 100, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero2);

        txtNumero3 = new JTextField();
        txtNumero3.setBounds(180, 110, 100, 30);
        txtNumero3.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero3);

        txtNumeroIntermedio = new JTextField();
        txtNumeroIntermedio.setBounds(180, 150, 100, 30);
        txtNumeroIntermedio.setFocusable(false);
        txtNumeroIntermedio.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumeroIntermedio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 200, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int num1 = Integer.parseInt(txtNumero1.getText());
        int num2 = Integer.parseInt(txtNumero2.getText());
        int num3 = Integer.parseInt(txtNumero3.getText());

        int intermedio;

        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            intermedio = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            intermedio = num2;
        } else {
            intermedio = num3;
        }

        txtNumeroIntermedio.setText(String.valueOf(intermedio));
    }
}
