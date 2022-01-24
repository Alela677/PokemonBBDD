package UI;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Daos.PokemonDAO;
import Enum.Tipo;
import Models.Pokémon;
import Utils.Almacen;
import java.awt.Color;

public class Pokemones {

	private JFrame framePokemones;
	private JLabel lblNombre;
	JLabel lblPokemon;
	private JTextField textNombre;
	private JLabel lblNewLabel;
	private JTextField textNumero;
	private JLabel lblNewLabel_1;
	private JTextField textTipo;
	private JLabel lblNewLabel_2;
	private JTextField textAltura;
	private JLabel lblNewLabel_3;
	private JTextField textPeso;
	private JLabel lblNewLabel_4;
	private JTextField textCategoria;
	private JLabel lblNewLabel_5;
	private JTextField textHabilidad;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblURL;
	private JButton btnNewButton;
	private int indice;
	private ArrayList<Models.Pokémon> Pokémon;
	private JButton btnNewButton_4;
	private PokemonDAO PokemonDAO; 
	private ArrayList<Pokémon> pokemon;
	
	public Pokemones() {
		initialize();
		this.framePokemones.setVisible(true);
		indice = 0; 
		this.PokemonDAO= new PokemonDAO();
		this.pokemon = PokemonDAO.viewPokemon();
		
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framePokemones = new JFrame();
		framePokemones.getContentPane().setBackground(new Color(240, 128, 128));
		framePokemones.setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alejandro\\OneDrive\\Escritorio\\bola.png"));
		framePokemones.setTitle("Pok\u00E9mon");
		framePokemones.setBounds(100, 100, 705, 624);
		framePokemones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePokemones.getContentPane().setLayout(null);

		lblPokemon = new JLabel("Pokemones");
		lblPokemon.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		lblPokemon.setBounds(273, 17, 184, 38);
		framePokemones.getContentPane().add(lblPokemon);

		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(24, 76, 80, 20);
		framePokemones.getContentPane().add(lblNombre);

		textNombre = new JTextField();
		textNombre.setEditable(false);
		textNombre.setBounds(24, 106, 86, 20);
		framePokemones.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		

		lblNewLabel = new JLabel("Numero");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel.setBounds(164, 79, 80, 14);
		framePokemones.getContentPane().add(lblNewLabel);

		textNumero = new JTextField();
		textNumero.setEditable(false);
		textNumero.setBounds(164, 106, 86, 20);
		framePokemones.getContentPane().add(textNumero);
		textNumero.setColumns(10);
		

		lblNewLabel_1 = new JLabel("Tipo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(24, 156, 80, 14);
		framePokemones.getContentPane().add(lblNewLabel_1);

		textTipo = new JTextField();
		textTipo.setEditable(false);
		textTipo.setBounds(24, 181, 86, 20);
		framePokemones.getContentPane().add(textTipo);
		textTipo.setColumns(10);
		

		lblNewLabel_2 = new JLabel("Altura");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(170, 156, 80, 14);
		framePokemones.getContentPane().add(lblNewLabel_2);

		textAltura = new JTextField();
		textAltura.setEditable(false);
		textAltura.setBounds(164, 181, 86, 20);
		framePokemones.getContentPane().add(textAltura);
		textAltura.setColumns(10);
		

		lblNewLabel_3 = new JLabel("Peso");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(24, 222, 80, 14);
		framePokemones.getContentPane().add(lblNewLabel_3);

		textPeso = new JTextField();
		textPeso.setEditable(false);
		textPeso.setBounds(24, 247, 86, 20);
		framePokemones.getContentPane().add(textPeso);
		textPeso.setColumns(10);
		

		lblNewLabel_4 = new JLabel("Categoria");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(170, 222, 80, 14);
		framePokemones.getContentPane().add(lblNewLabel_4);

		textCategoria = new JTextField();
		textCategoria.setEditable(false);
		textCategoria.setBounds(164, 247, 86, 20);
		framePokemones.getContentPane().add(textCategoria);
		textCategoria.setColumns(10);
		

		lblNewLabel_5 = new JLabel("Habilidad");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(24, 291, 80, 14);
		framePokemones.getContentPane().add(lblNewLabel_5);

		textHabilidad = new JTextField();
		textHabilidad.setEditable(false);
		textHabilidad.setBounds(24, 316, 86, 20);
		framePokemones.getContentPane().add(textHabilidad);
		textHabilidad.setColumns(10);
		
		try {
			String path = pokemon.get(indice).getUrl();
			System.out.println("Get Image from " + path);
			URL url = new URL(path);
			BufferedImage image = ImageIO.read(url);
			System.out.println("Load image into frame...");
			lblURL = new JLabel(new ImageIcon(image));
			lblURL.setBackground(new Color(255, 192, 203));
		} catch (Exception e) {
			// TODO: handle exception
		}
		lblURL.setBounds(273, 94, 390, 445);
		framePokemones.getContentPane().add(lblURL);

		btnNewButton = new JButton("Crear Pokemon");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				framePokemones.dispose();
				new CrearPokemon();

			}
		});
		btnNewButton.setBounds(499, 550, 164, 23);
		framePokemones.getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("<");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				indice--;

				if (indice == pokemon.size()) {
					indice = 0;
				}

				printPokemon();
			}

		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(49, 13, 89, 42);
		framePokemones.getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton(">");
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indice++;

				if (indice == pokemon.size()) {
					indice = 0;
				}

				printPokemon();
			}});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(574, 18, 89, 44);
		framePokemones.getContentPane().add(btnNewButton_2);

		btnNewButton_3 = new JButton("Eliminar Pokemon");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pokemon.remove(indice);
			}
		});
		btnNewButton_3.setBounds(336, 550, 153, 23);
		framePokemones.getContentPane().add(btnNewButton_3);

		

		btnNewButton_4 = new JButton("Salir");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(24, 550, 89, 23);
		framePokemones.getContentPane().add(btnNewButton_4);

	} 

	private void printPokemon() {

		Pokémon poke = pokemon.get(indice);
		textNombre.setText(poke.getNombre());
		textNumero.setText(poke.getNumero() + "");
		textTipo.setText(poke.getTipo() + "");
		textAltura.setText(poke.getAltura() + "");
		textPeso.setText(poke.getPeso() + "");
		textCategoria.setText(poke.getCategoria());
		textHabilidad.setText(poke.getHabilidad());
		lblURL.setText(poke.getUrl());
		
	}	
}