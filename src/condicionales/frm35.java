package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class frm35 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextField txtCodigo, txtTipoEmpleado;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm35 frame = new frm35();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm35() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200);
        setLayout(null);

        JLabel lblCodigo = new JLabel("Código de empleado:");
        lblCodigo.setBounds(30, 30, 150, 30);
        add(lblCodigo);

        JLabel lblTipoEmpleado = new JLabel("Tipo de empleado:");
        lblTipoEmpleado.setBounds(30, 70, 150, 30);
        add(lblTipoEmpleado);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(180, 30, 150, 30);
        add(txtCodigo);

        txtTipoEmpleado = new JTextField();
        txtTipoEmpleado.setBounds(180, 70, 150, 30);
        txtTipoEmpleado.setEditable(false);
        add(txtTipoEmpleado);

        JButton btnCalcular = new JButton("Determinar Tipo");
        btnCalcular.setBounds(130, 110, 150, 30);
        add(btnCalcular);

        btnCalcular.addActionListener(e -> determinarTipoEmpleado());
    }

    private void determinarTipoEmpleado() {
        try {
            int codigo = Integer.parseInt(txtCodigo.getText());

            String tipoEmpleado;

            if (codigo % 2 == 0 && codigo % 3 == 0 && codigo % 5 == 0) {
                tipoEmpleado = "Administrativo";
            } else if (codigo % 3 == 0 && codigo % 5 == 0) {
                tipoEmpleado = "Directivo";
            } else if (codigo % 2 == 0) {
                tipoEmpleado = "Vendedor";
            } else {
                tipoEmpleado = "Seguridad";
            }

            txtTipoEmpleado.setText(tipoEmpleado);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese un código válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
