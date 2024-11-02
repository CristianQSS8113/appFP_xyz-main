package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtAngulo, txtClasificacion;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm03 frame = new frm03();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm03() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblAngulo = new JLabel("Ángulo en grados:");
        lblAngulo.setBounds(50, 30, 150, 30);
        getContentPane().add(lblAngulo);

        JLabel lblClasificacion = new JLabel("Clasificación:");
        lblClasificacion.setBounds(50, 70, 150, 30);
        getContentPane().add(lblClasificacion);

        txtAngulo = new JTextField();
        txtAngulo.setBounds(220, 30, 80, 30);
        txtAngulo.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtAngulo);

        txtClasificacion = new JTextField();
        txtClasificacion.setBounds(220, 70, 80, 30);
        txtClasificacion.setFocusable(false);
        txtClasificacion.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtClasificacion);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 130, 100, 30);
        btnCalcular.setMnemonic('a');
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int angulo = Integer.parseInt(txtAngulo.getText());
        String clasificacion;

        if (angulo == 0) {
            clasificacion = "Nulo";
        } else if (angulo > 0 && angulo < 90) {
            clasificacion = "Agudo";
        } else if (angulo == 90) {
            clasificacion = "Recto";
        } else if (angulo > 90 && angulo < 180) {
            clasificacion = "Obtuso";
        } else if (angulo == 180) {
            clasificacion = "Llano";
        } else if (angulo > 180 && angulo < 360) {
            clasificacion = "Cóncavo";
        } else if (angulo == 360) {
            clasificacion = "Completo";
        } else {
            clasificacion = "Ángulo no válido";
        }

        txtClasificacion.setText(clasificacion);
    }
}
