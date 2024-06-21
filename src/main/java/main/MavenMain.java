package main;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MavenMain {

	private JFrame frame;
	private JTextField tf_texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MavenMain window = new MavenMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MavenMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf_texto = new JTextField();
		tf_texto.setHorizontalAlignment(SwingConstants.CENTER);
		tf_texto.setText("Selecciona un color y pulsa el botón.");
		tf_texto.setBounds(33, 33, 344, 20);
		frame.getContentPane().add(tf_texto);
		tf_texto.setColumns(10);
		
		JComboBox cbox_colores = new JComboBox();
		cbox_colores.setModel(new DefaultComboBoxModel(new String[] {"Azul", "Rojo", "Verde"}));
		cbox_colores.setBounds(33, 102, 116, 22);
		frame.getContentPane().add(cbox_colores);
		
		JButton btn_cambiaColor = new JButton("Cambiar Color");
		btn_cambiaColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String colorSelec = (String) cbox_colores.getSelectedItem();
				Color colorTexto = new Color (0);
				
				switch (colorSelec) {
					
				case "Azul":
					colorTexto = Color.blue;
					break;
					
				case "Verde":
					colorTexto = Color.green;
					break;
					
				case "Rojo":
					colorTexto = Color.red;
					break;
					
				}
				
				tf_texto.setForeground(colorTexto);
				tf_texto.setText("Ahora soy de color " + colorSelec);
			}
		});
		btn_cambiaColor.setBounds(224, 102, 153, 23);
		frame.getContentPane().add(btn_cambiaColor);
	}

}
