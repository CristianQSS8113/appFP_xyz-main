package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm12 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtDia;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm12 frame = new frm12();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm12() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número (1-7):");
        lblNumero.setBounds(50, 50, 100, 30);
        getContentPane().add(lblNumero);

        JLabel lblDia = new JLabel("Día de la semana:");
        lblDia.setBounds(50, 90, 120, 30);
        getContentPane().add(lblDia);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 50, 80, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtNumero);

        txtDia = new JTextField();
        txtDia.setBounds(180, 90, 80, 30);
        txtDia.setFocusable(false);
        txtDia.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtDia);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 150, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        String[] dias = {"Número inválido", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        txtDia.setText((numero >= 1 && numero <= 7) ? dias[numero] : dias[0]);
    }
}
