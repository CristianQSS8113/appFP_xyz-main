package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm39 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtHorasAusencia, txtTornillosDefectuosos, txtTornillosNoDefectuosos, txtGradoEficiencia;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm39 frame = new frm39();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm39() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblHorasAusencia = new JLabel("Horas de Ausencia:");
        lblHorasAusencia.setBounds(50, 50, 150, 30);
        getContentPane().add(lblHorasAusencia);

        JLabel lblTornillosDefectuosos = new JLabel("Tornillos Defectuosos:");
        lblTornillosDefectuosos.setBounds(50, 90, 150, 30);
        getContentPane().add(lblTornillosDefectuosos);

        JLabel lblTornillosNoDefectuosos = new JLabel("Tornillos No Defectuosos:");
        lblTornillosNoDefectuosos.setBounds(50, 130, 150, 30);
        getContentPane().add(lblTornillosNoDefectuosos);

        JLabel lblGradoEficiencia = new JLabel("Grado de Eficiencia:");
        lblGradoEficiencia.setBounds(50, 170, 150, 30);
        getContentPane().add(lblGradoEficiencia);

        txtHorasAusencia = new JTextField();
        txtHorasAusencia.setBounds(220, 50, 100, 30);
        txtHorasAusencia.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtHorasAusencia);

        txtTornillosDefectuosos = new JTextField();
        txtTornillosDefectuosos.setBounds(220, 90, 100, 30);
        txtTornillosDefectuosos.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTornillosDefectuosos);

        txtTornillosNoDefectuosos = new JTextField();
        txtTornillosNoDefectuosos.setBounds(220, 130, 100, 30);
        txtTornillosNoDefectuosos.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtTornillosNoDefectuosos);

        txtGradoEficiencia = new JTextField();
        txtGradoEficiencia.setBounds(220, 170, 100, 30);
        txtGradoEficiencia.setFocusable(false);
        txtGradoEficiencia.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtGradoEficiencia);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 210, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> calcularGradoEficiencia());
    }

    protected void calcularGradoEficiencia() {
        try {
            double horasAusencia = Double.parseDouble(txtHorasAusencia.getText());
            int tornillosDefectuosos = Integer.parseInt(txtTornillosDefectuosos.getText());
            int tornillosNoDefectuosos = Integer.parseInt(txtTornillosNoDefectuosos.getText());

            boolean cumpleCond1 = horasAusencia <= 1.5;
            boolean cumpleCond2 = tornillosDefectuosos < 300;
            boolean cumpleCond3 = tornillosNoDefectuosos > 10000;
            int gradoEficiencia;

            if (cumpleCond1 && cumpleCond2 && cumpleCond3) {
                gradoEficiencia = 20;
            } else if (cumpleCond1 && cumpleCond2) {
                gradoEficiencia = 12;
            } else if (cumpleCond1 && cumpleCond3) {
                gradoEficiencia = 13;
            } else if (cumpleCond2 && cumpleCond3) {
                gradoEficiencia = 15;
            } else if (cumpleCond1) {
                gradoEficiencia = 7;
            } else if (cumpleCond2) {
                gradoEficiencia = 8;
            } else if (cumpleCond3) {
                gradoEficiencia = 9;
            } else {
                gradoEficiencia = 5;
            }

            txtGradoEficiencia.setText(String.valueOf(gradoEficiencia));
        } catch (Exception ex) {
            txtGradoEficiencia.setText("Error");
        }
    }
}
