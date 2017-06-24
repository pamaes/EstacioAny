package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/*
 * By Paco Gomez
 * Esta ventana tendrá dos JTextFields
 * El primero recojerá el DNI
 * El segundo calculará la letra al apretar el botón
 * 
 * */
public class VentanaEstacionAnyo extends JFrame {

	private JPanel contentPane;
	private JTextField textField_mes;
	private JTextField textField_estacion;



	/**
	 * Create the frame.
	 */
	public VentanaEstacionAnyo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{70, 162, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{60, 20, 35, 20, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblMes = new JLabel("Introducir mes:");
		GridBagConstraints gbc_lblMes = new GridBagConstraints();
		gbc_lblMes.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblMes.insets = new Insets(0, 0, 5, 5);
		gbc_lblMes.gridx = 1;
		gbc_lblMes.gridy = 1;
		panel.add(lblMes, gbc_lblMes);
		
		textField_mes = new JTextField();
		GridBagConstraints gbc_textField_mes = new GridBagConstraints();
		gbc_textField_mes.insets = new Insets(0, 0, 5, 5);
		gbc_textField_mes.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_mes.gridx = 2;
		gbc_textField_mes.gridy = 1;
		panel.add(textField_mes, gbc_textField_mes);
		textField_mes.setColumns(10);
		
		JLabel lblEstacion = new JLabel("Estaci\u00F3n seg\u00FAn el mes:");
		GridBagConstraints gbc_lblEstacion = new GridBagConstraints();
		gbc_lblEstacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstacion.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblEstacion.gridx = 1;
		gbc_lblEstacion.gridy = 3;
		panel.add(lblEstacion, gbc_lblEstacion);
		
		textField_estacion = new JTextField();
		GridBagConstraints gbc_textField_estacion = new GridBagConstraints();
		gbc_textField_estacion.insets = new Insets(0, 0, 5, 5);
		gbc_textField_estacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_estacion.gridx = 2;
		gbc_textField_estacion.gridy = 3;
		panel.add(textField_estacion, gbc_textField_estacion);
		textField_estacion.setColumns(10);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		JButton btnValidar = new JButton("VALIDAR");
		GridBagConstraints gbc_btnValidar = new GridBagConstraints();
		gbc_btnValidar.insets = new Insets(0, 0, 5, 5);
		gbc_btnValidar.gridx = 1;
		gbc_btnValidar.gridy = 6;
		panel.add(btnValidar, gbc_btnValidar);
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.insets = new Insets(0, 0, 5, 5);
		gbc_btnSalir.gridx = 2;
		gbc_btnSalir.gridy = 6;
		panel.add(btnSalir, gbc_btnSalir);
	}

}
