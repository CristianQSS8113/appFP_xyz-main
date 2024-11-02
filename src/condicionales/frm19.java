package condicionales;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtSexo, txtEdad, txtCategoria;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm19 frame = new frm19();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm19() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblSexo = new JLabel("Sexo (M/F):");
        lblSexo.setBounds(50, 50, 100, 30);
        getContentPane().add(lblSexo);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(50, 90, 100, 30);
        getContentPane().add(lblEdad);

        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setBounds(50, 130, 100, 30);
        getContentPane().add(lblCategoria);

        txtSexo = new JTextField();
        txtSexo.setBounds(150, 50, 50, 30);
        txtSexo.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(txtSexo);

        txtEdad = new JTextField();
        txtEdad.setBounds(150, 90, 50, 30);
        txtEdad.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(txtEdad);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(150, 130, 100, 30);
        txtCategoria.setFocusable(false);
        txtCategoria.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(txtCategoria);

        JButton btnCalcular = new JButton("Categorizar");
        btnCalcular.setBounds(100, 170, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        String sexo = txtSexo.getText().toUpperCase();
        int edad = Integer.parseInt(txtEdad.getText());
        String categoria;

        if (sexo.equals("F")) {
            categoria = (edad < 23) ? "FA" : "FB";
        } else if (sexo.equals("M")) {
            categoria = (edad < 25) ? "MA" : "MB";
        } else {
            categoria = "Sexo no válido";
        }

        txtCategoria.setText(categoria);
    }
}
