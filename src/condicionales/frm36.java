package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frm36 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtCuadernos, txtLapiceros;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm36 frame = new frm36();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm36() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200);
        setLayout(null);

        JLabel lblCuadernos = new JLabel("Número de cuadernos:");
        lblCuadernos.setBounds(30, 30, 150, 30);
        add(lblCuadernos);

        JLabel lblLapiceros = new JLabel("Total de lapiceros:");
        lblLapiceros.setBounds(30, 70, 150, 30);
        add(lblLapiceros);

        txtCuadernos = new JTextField();
        txtCuadernos.setBounds(180, 30, 150, 30);
        add(txtCuadernos);

        txtLapiceros = new JTextField();
        txtLapiceros.setBounds(180, 70, 150, 30);
        txtLapiceros.setEditable(false);
        add(txtLapiceros);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(130, 110, 100, 30);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> calcularLapiceros());
    }

    private void calcularLapiceros() {
        try {
            int cuadernos = Integer.parseInt(txtCuadernos.getText());
            int lapicerosLucas = 0, lapicerosFaber = 0, lapicerosPilot = 0;

            if (cuadernos < 12) {
                lapicerosLucas = 0;
            } else if (cuadernos < 24) {
                lapicerosLucas = cuadernos / 4;
            } else if (cuadernos < 36) {
                lapicerosFaber = 2 * (cuadernos / 4);
            } else {
                lapicerosPilot = 2 * (cuadernos / 4);
                lapicerosFaber += cuadernos / 6;
                lapicerosLucas += cuadernos / 12;
            }

            int totalLapiceros = lapicerosLucas + lapicerosFaber + lapicerosPilot;
            txtLapiceros.setText(totalLapiceros + " (Lucas: " + lapicerosLucas + ", Faber: " + lapicerosFaber + ", Pilot: " + lapicerosPilot + ")");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
