package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm21 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtNumero, txtEstadoCivil, txtEdad, txtSexo;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm21 frame = new frm21();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm21() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 350);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblNumero = new JLabel("Número (4 cifras):");
        lblNumero.setBounds(50, 30, 120, 30);
        getContentPane().add(lblNumero);

        JLabel lblEstadoCivil = new JLabel("Estado Civil:");
        lblEstadoCivil.setBounds(50, 70, 100, 30);
        getContentPane().add(lblEstadoCivil);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(50, 110, 100, 30);
        getContentPane().add(lblEdad);

        JLabel lblSexo = new JLabel("Sexo:");
        lblSexo.setBounds(50, 150, 100, 30);
        getContentPane().add(lblSexo);

        txtNumero = new JTextField();
        txtNumero.setBounds(180, 30, 100, 30);
        txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(txtNumero);

        txtEstadoCivil = new JTextField();
        txtEstadoCivil.setBounds(180, 70, 100, 30);
        txtEstadoCivil.setFocusable(false);
        txtEstadoCivil.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(txtEstadoCivil);

        txtEdad = new JTextField();
        txtEdad.setBounds(180, 110, 100, 30);
        txtEdad.setFocusable(false);
        txtEdad.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(txtEdad);

        txtSexo = new JTextField();
        txtSexo.setBounds(180, 150, 100, 30);
        txtSexo.setFocusable(false);
        txtSexo.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(txtSexo);

        JButton btnVerificar = new JButton("Verificar");
        btnVerificar.setBounds(100, 190, 120, 30);
        getContentPane().add(btnVerificar);

        btnVerificar.addActionListener(e -> btnVerificar_actionPerformed());
    }

    protected void btnVerificar_actionPerformed() {
        int numero = Integer.parseInt(txtNumero.getText());
        int estadoCivil = numero / 1000;
        int edad = (numero / 10) % 100;
        int sexo = numero % 10;

        String estadoCivilStr;
        switch (estadoCivil) {
            case 1: estadoCivilStr = "Soltero"; break;
            case 2: estadoCivilStr = "Casado"; break;
            case 3: estadoCivilStr = "Divorciado"; break;
            case 4: estadoCivilStr = "Viudo"; break;
            default: estadoCivilStr = "Desconocido"; break;
        }

        String sexoStr = (sexo == 1) ? "Masculino" : (sexo == 2) ? "Femenino" : "Desconocido";

        txtEstadoCivil.setText(estadoCivilStr);
        txtEdad.setText(String.valueOf(edad));
        txtSexo.setText(sexoStr);
    }
}
