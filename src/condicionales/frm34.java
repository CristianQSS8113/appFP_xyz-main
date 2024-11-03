package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frm34 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtPeso, txtEstatura, txtIMC, txtGradoObesidad;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm34 frame = new frm34();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm34() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 250);
        setLayout(null);

        JLabel lblPeso = new JLabel("Peso (kg):");
        lblPeso.setBounds(30, 30, 100, 30);
        add(lblPeso);

        JLabel lblEstatura = new JLabel("Estatura (m):");
        lblEstatura.setBounds(30, 70, 100, 30);
        add(lblEstatura);

        JLabel lblIMC = new JLabel("IMC:");
        lblIMC.setBounds(30, 110, 100, 30);
        add(lblIMC);

        JLabel lblGradoObesidad = new JLabel("Grado de Obesidad:");
        lblGradoObesidad.setBounds(30, 150, 120, 30);
        add(lblGradoObesidad);

        txtPeso = new JTextField();
        txtPeso.setBounds(150, 30, 150, 30);
        add(txtPeso);

        txtEstatura = new JTextField();
        txtEstatura.setBounds(150, 70, 150, 30);
        add(txtEstatura);

        txtIMC = new JTextField();
        txtIMC.setBounds(150, 110, 150, 30);
        txtIMC.setEditable(false);
        add(txtIMC);

        txtGradoObesidad = new JTextField();
        txtGradoObesidad.setBounds(150, 150, 150, 30);
        txtGradoObesidad.setEditable(false);
        add(txtGradoObesidad);

        JButton btnCalcular = new JButton("Calcular IMC");
        btnCalcular.setBounds(130, 200, 120, 30);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> calcularIMC());
    }

    private void calcularIMC() {
        try {
            double peso = Double.parseDouble(txtPeso.getText());
            double estatura = Double.parseDouble(txtEstatura.getText());

            double imc = peso / (estatura * estatura);
            String gradoObesidad = obtenerGradoObesidad(imc);

            txtIMC.setText(String.format("%.2f", imc));
            txtGradoObesidad.setText(gradoObesidad);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String obtenerGradoObesidad(double imc) {
        if (imc < 20) return "Delgado";
        if (imc >= 20 && imc <= 25) return "Normal";
        if (imc > 25 && imc <= 27) return "Sobrepeso";
        return "Obesidad";
    }
}
