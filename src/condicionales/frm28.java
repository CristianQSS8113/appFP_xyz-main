package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frm28 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtHora24, txtHora12;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm28 frame = new frm28();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm28() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        setLayout(null);

        JLabel lblHora24 = new JLabel("Hora (24h):");
        lblHora24.setBounds(30, 30, 80, 30);
        add(lblHora24);

        JLabel lblHora12 = new JLabel("Hora (12h):");
        lblHora12.setBounds(30, 70, 80, 30);
        add(lblHora12);

        txtHora24 = new JTextField();
        txtHora24.setBounds(120, 30, 100, 30);
        add(txtHora24);

        txtHora12 = new JTextField();
        txtHora12.setBounds(120, 70, 100, 30);
        txtHora12.setEditable(false);
        add(txtHora12);

        JButton btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(90, 120, 100, 30);
        add(btnConvertir);

        btnConvertir.addActionListener(e -> convertirHora());
    }

    private void convertirHora() {
        try {
            String[] partes = txtHora24.getText().split(":");
            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);

            if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
                txtHora12.setText("");
                JOptionPane.showMessageDialog(this, "Hora inválida. Ingrese un valor entre 00:00 y 23:59.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String periodo = horas < 12 ? "AM" : "PM";
            int horas12 = horas % 12;
            if (horas12 == 0) horas12 = 12;

            txtHora12.setText(String.format("%02d:%02d %s", horas12, minutos, periodo));
        } catch (Exception ex) {
            txtHora12.setText("");
            JOptionPane.showMessageDialog(this, "Formato inválido. Use HH:MM.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
