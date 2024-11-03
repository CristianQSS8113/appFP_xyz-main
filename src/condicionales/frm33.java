package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frm33 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtMinutosTardanza, txtObservaciones, txtPuntajeTotal, txtBonificacion;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm33 frame = new frm33();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm33() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setLayout(null);

        JLabel lblMinutosTardanza = new JLabel("Minutos de tardanza:");
        lblMinutosTardanza.setBounds(30, 30, 150, 30);
        add(lblMinutosTardanza);

        JLabel lblObservaciones = new JLabel("Observaciones:");
        lblObservaciones.setBounds(30, 70, 150, 30);
        add(lblObservaciones);

        JLabel lblPuntajeTotal = new JLabel("Puntaje total:");
        lblPuntajeTotal.setBounds(30, 110, 150, 30);
        add(lblPuntajeTotal);

        JLabel lblBonificacion = new JLabel("Bonificación:");
        lblBonificacion.setBounds(30, 150, 150, 30);
        add(lblBonificacion);

        txtMinutosTardanza = new JTextField();
        txtMinutosTardanza.setBounds(200, 30, 150, 30);
        add(txtMinutosTardanza);

        txtObservaciones = new JTextField();
        txtObservaciones.setBounds(200, 70, 150, 30);
        add(txtObservaciones);

        txtPuntajeTotal = new JTextField();
        txtPuntajeTotal.setBounds(200, 110, 150, 30);
        txtPuntajeTotal.setEditable(false);
        add(txtPuntajeTotal);

        txtBonificacion = new JTextField();
        txtBonificacion.setBounds(200, 150, 150, 30);
        txtBonificacion.setEditable(false);
        add(txtBonificacion);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 200, 100, 30);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> calcularBonificacion());
    }

    private void calcularBonificacion() {
        try {
            int minutosTardanza = Integer.parseInt(txtMinutosTardanza.getText());
            int observaciones = Integer.parseInt(txtObservaciones.getText());

            int puntajePuntualidad = calcularPuntajePuntualidad(minutosTardanza);
            int puntajeRendimiento = calcularPuntajeRendimiento(observaciones);
            int puntajeTotal = puntajePuntualidad + puntajeRendimiento;

            double bonificacion = calcularBonificacion(puntajeTotal);

            txtPuntajeTotal.setText(String.valueOf(puntajeTotal));
            txtBonificacion.setText(String.format("%.2f", bonificacion));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int calcularPuntajePuntualidad(int minutosTardanza) {
        if (minutosTardanza == 0) return 10;
        if (minutosTardanza >= 1 && minutosTardanza <= 2) return 8;
        if (minutosTardanza >= 3 && minutosTardanza <= 5) return 6;
        if (minutosTardanza >= 6 && minutosTardanza <= 9) return 4;
        return 0; 
    }

    private int calcularPuntajeRendimiento(int observaciones) {
        if (observaciones == 0) return 10;
        if (observaciones == 1) return 8;
        if (observaciones == 2) return 5;
        if (observaciones == 3) return 1;
        return 0; 
    }

    private double calcularBonificacion(int puntajeTotal) {
        if (puntajeTotal < 11) return puntajeTotal * 2.5; 
        if (puntajeTotal >= 11 && puntajeTotal <= 13) return puntajeTotal * 5.0; 
        if (puntajeTotal >= 14 && puntajeTotal <= 16) return puntajeTotal * 7.5;
        if (puntajeTotal >= 17 && puntajeTotal <= 19) return puntajeTotal * 10.0; 
        return puntajeTotal * 12.5; 
    }
}
