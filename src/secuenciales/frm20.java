package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    JTextField txtCantidad, txt200, txt100, txt50, txt20, txt10, txt5, txt2, txt1;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                frm20 frame = new frm20();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public frm20() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 400, 500);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblCantidad = new JLabel("Cantidad en Soles:");
        lblCantidad.setBounds(50, 30, 150, 30);
        getContentPane().add(lblCantidad);

        JLabel lbl200 = new JLabel("Billetes de 200:");
        lbl200.setBounds(50, 70, 150, 30);
        getContentPane().add(lbl200);

        JLabel lbl100 = new JLabel("Billetes de 100:");
        lbl100.setBounds(50, 110, 150, 30);
        getContentPane().add(lbl100);

        JLabel lbl50 = new JLabel("Billetes de 50:");
        lbl50.setBounds(50, 150, 150, 30);
        getContentPane().add(lbl50);

        JLabel lbl20 = new JLabel("Billetes de 20:");
        lbl20.setBounds(50, 190, 150, 30);
        getContentPane().add(lbl20);

        JLabel lbl10 = new JLabel("Billetes de 10:");
        lbl10.setBounds(50, 230, 150, 30);
        getContentPane().add(lbl10);

        JLabel lbl5 = new JLabel("Monedas de 5:");
        lbl5.setBounds(50, 270, 150, 30);
        getContentPane().add(lbl5);

        JLabel lbl2 = new JLabel("Monedas de 2:");
        lbl2.setBounds(50, 310, 150, 30);
        getContentPane().add(lbl2);

        JLabel lbl1 = new JLabel("Monedas de 1:");
        lbl1.setBounds(50, 350, 150, 30);
        getContentPane().add(lbl1);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(220, 30, 80, 30);
        txtCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txtCantidad);

        txt200 = new JTextField();
        txt200.setBounds(220, 70, 80, 30);
        txt200.setFocusable(false);
        txt200.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txt200);

        txt100 = new JTextField();
        txt100.setBounds(220, 110, 80, 30);
        txt100.setFocusable(false);
        txt100.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txt100);

        txt50 = new JTextField();
        txt50.setBounds(220, 150, 80, 30);
        txt50.setFocusable(false);
        txt50.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txt50);

        txt20 = new JTextField();
        txt20.setBounds(220, 190, 80, 30);
        txt20.setFocusable(false);
        txt20.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txt20);

        txt10 = new JTextField();
        txt10.setBounds(220, 230, 80, 30);
        txt10.setFocusable(false);
        txt10.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txt10);

        txt5 = new JTextField();
        txt5.setBounds(220, 270, 80, 30);
        txt5.setFocusable(false);
        txt5.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txt5);

        txt2 = new JTextField();
        txt2.setBounds(220, 310, 80, 30);
        txt2.setFocusable(false);
        txt2.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txt2);

        txt1 = new JTextField();
        txt1.setBounds(220, 350, 80, 30);
        txt1.setFocusable(false);
        txt1.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(txt1);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 390, 100, 30);
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(e -> btnCalcular_actionPerformed());
    }

    protected void btnCalcular_actionPerformed() {
        int cantidad = Integer.parseInt(txtCantidad.getText());

        int billetes200 = cantidad / 200;
        cantidad %= 200;
        
        int billetes100 = cantidad / 100;
        cantidad %= 100;
        
        int billetes50 = cantidad / 50;
        cantidad %= 50;
        
        int billetes20 = cantidad / 20;
        cantidad %= 20;
        
        int billetes10 = cantidad / 10;
        cantidad %= 10;
        
        int monedas5 = cantidad / 5;
        cantidad %= 5;
        
        int monedas2 = cantidad / 2;
        cantidad %= 2;
        
        int monedas1 = cantidad;

        txt200.setText(String.valueOf(billetes200));
        txt100.setText(String.valueOf(billetes100));
        txt50.setText(String.valueOf(billetes50));
        txt20.setText(String.valueOf(billetes20));
        txt10.setText(String.valueOf(billetes10));
        txt5.setText(String.valueOf(monedas5));
        txt2.setText(String.valueOf(monedas2));
        txt1.setText(String.valueOf(monedas1));
    }
}
