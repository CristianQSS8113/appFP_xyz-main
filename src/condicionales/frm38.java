package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frm38 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtMes, txtAño, txtResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm38 frame = new frm38();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm38() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 250);
        setLayout(null);

        add(new JLabel("Mes (1-12):")).setBounds(30, 30, 100, 30);
        add(new JLabel("Año:")).setBounds(30, 70, 100, 30);
        txtMes = new JTextField(); txtMes.setBounds(150, 30, 100, 30); add(txtMes);
        txtAño = new JTextField(); txtAño.setBounds(150, 70, 100, 30); add(txtAño);
        txtResultado = new JTextField(); txtResultado.setBounds(150, 110, 200, 30); txtResultado.setEditable(false); add(txtResultado);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 150, 150, 30);
        btnCalcular.addActionListener(e -> calcularDiasYNombre());
        add(btnCalcular);
    }

    private void calcularDiasYNombre() {
        try {
            int mes = Integer.parseInt(txtMes.getText()), año = Integer.parseInt(txtAño.getText());
            String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
            int dias = (mes == 2) ? (esBisiesto(año) ? 29 : 28) : (mes == 4 || mes == 6 || mes == 9 || mes == 11) ? 30 : 31;

            if (mes < 1 || mes > 12) throw new NumberFormatException();
            txtResultado.setText("Mes: " + meses[mes - 1] + ", Días: " + dias);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}
