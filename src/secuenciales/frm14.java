package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.util.Arrays;

public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero1, txtNumero2, txtNumero3, txtNumero4, txtNumero5, txtPromedio;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm14 frame = new frm14();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm14() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 400);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero1 = new JLabel("Numero 1:");
        lblNumero1.setBounds(50, 30, 80, 30);
        getContentPane().add(lblNumero1);

        JLabel lblNumero2 = new JLabel("Numero 2:");
        lblNumero2.setBounds(50, 70, 80, 30);
        getContentPane().add(lblNumero2);

        JLabel lblNumero3 = new JLabel("Numero 3:");
        lblNumero3.setBounds(50, 110, 80, 30);
        getContentPane().add(lblNumero3);

        JLabel lblNumero4 = new JLabel("Numero 4:");
        lblNumero4.setBounds(50, 150, 80, 30);
        getContentPane().add(lblNumero4);

        JLabel lblNumero5 = new JLabel("Numero 5:");
        lblNumero5.setBounds(50, 190, 80, 30);
        getContentPane().add(lblNumero5);

        JLabel lblPromedio = new JLabel("Promedio:");
        lblPromedio.setBounds(50, 230, 80, 30);
        getContentPane().add(lblPromedio);


        txtNumero1 = new JTextField();
        txtNumero1.setBounds(150, 30, 80, 30);
        txtNumero1.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero1);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(150, 70, 80, 30);
        txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero2);

        txtNumero3 = new JTextField();
        txtNumero3.setBounds(150, 110, 80, 30);
        txtNumero3.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero3);

        txtNumero4 = new JTextField();
        txtNumero4.setBounds(150, 150, 80, 30);
        txtNumero4.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero4);

        txtNumero5 = new JTextField();
        txtNumero5.setBounds(150, 190, 80, 30);
        txtNumero5.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero5);

        txtPromedio = new JTextField();
        txtPromedio.setBounds(150, 230, 80, 30);
        txtPromedio.setFocusable(false);
        txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtPromedio);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130, 300, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        double[] numeros = new double[5];
        numeros[0] = Double.parseDouble(txtNumero1.getText());
        numeros[1] = Double.parseDouble(txtNumero2.getText());
        numeros[2] = Double.parseDouble(txtNumero3.getText());
        numeros[3] = Double.parseDouble(txtNumero4.getText());
        numeros[4] = Double.parseDouble(txtNumero5.getText());

        Arrays.sort(numeros);

        double promedio = (numeros[2] + numeros[3] + numeros[4]) / 3;

        DecimalFormat df = new DecimalFormat("#.##");
        txtPromedio.setText(df.format(promedio));
    }
}
