package repetitivos;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frm01 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtDividendo, txtDivisor, txtCociente, txtResto;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frm01 frame = new frm01();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public frm01() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 350, 250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblDividendo = new JLabel("Dividendo:");
        lblDividendo.setBounds(30, 30, 100, 30);
        getContentPane().add(lblDividendo);

        JLabel lblDivisor = new JLabel("Divisor:");
        lblDivisor.setBounds(30, 70, 100, 30);
        getContentPane().add(lblDivisor);

        JLabel lblCociente = new JLabel("Cociente:");
        lblCociente.setBounds(30, 110, 100, 30);
        getContentPane().add(lblCociente);

        JLabel lblResto = new JLabel("Resto:");
        lblResto.setBounds(30, 150, 100, 30);
        getContentPane().add(lblResto);

        txtDividendo = new JTextField();
        txtDividendo.setBounds(140, 30, 100, 30);
        txtDividendo.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDividendo);

        txtDivisor = new JTextField();
        txtDivisor.setBounds(140, 70, 100, 30);
        txtDivisor.setMargin(new Insets(5, 5, 5, 5));
        getContentPane().add(txtDivisor);

        txtCociente = new JTextField();
        txtCociente.setBounds(140, 110, 100, 30);
        txtCociente.setEditable(false);
        getContentPane().add(txtCociente);

        txtResto = new JTextField();
        txtResto.setBounds(140, 150, 100, 30);
        txtResto.setEditable(false);
        getContentPane().add(txtResto);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 190, 120, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnCalcular_actionPerformed();
            }
        });
    }

    protected void btnCalcular_actionPerformed() {
        int dividendo = Integer.parseInt(txtDividendo.getText());
        int divisor = Integer.parseInt(txtDivisor.getText());

        int[] resultado = obtenerCocienteYResto(dividendo, divisor);

        txtCociente.setText(String.valueOf(resultado[0]));
        txtResto.setText(String.valueOf(resultado[1]));
    }

    private int[] obtenerCocienteYResto(int dividendo, int divisor) {
        int cociente = 0;
        int resto = dividendo;

        while (resto >= divisor) {
            resto -= divisor;
            cociente++;
        }

        return new int[]{cociente, resto};
    }
}
