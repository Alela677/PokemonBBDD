package Daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Models.Pokémon;
import Models.Usuario;

public class PokemonDAO {
	final String DB_URL = "jdbc:mysql://localhost/pokedex";
	final String USER = "Pokemones";
	final String PASS = "Alela677";

	public void insertaPokemon(Pokémon Pokemon) {
		final String INSERT = "INSERT INTO pokemons (Numero,Nombre,Tipo,Altura,Peso,Categoria,Habilidad,url)"
				+ "values ('" + Pokemon.getNumero() + "','" + Pokemon.getNombre() + "','" + Pokemon.getTipo() + "','"
				+ Pokemon.getAltura() + "','" + Pokemon.getPeso() + "','" + Pokemon.getCategoria() + "','"
				+ Pokemon.getHabilidad() + "','" + Pokemon.getUrl() + "')";
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(INSERT);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Pokémon> viewPokemon() {
		final String QUERY = "SELECT Numero,Nombre,Tipo,Altura,Peso,Categoria,Habilidad,url FROM Pokemons LIMIT 1";
		var pokemon = new ArrayList<Pokémon>();	
		try {
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);
			while(rs.next()){
				int Numero = rs.getInt("Numero");
				String Nombre = rs.getString("Nombre");
				String Tipo = rs.getString("Tipo");
				double Altura = rs.getDouble("Altura");
				double Peso = rs.getDouble("Peso");
				String Categoria = rs.getString("Categoria");
				String Habilidad = rs.getString("Habilidad");
				String url = rs.getString("url");
				Pokémon poke = new Pokémon(Nombre, Numero, Tipo, Altura, Peso, Categoria, Habilidad,url);
				pokemon.add(poke);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pokemon;
	}
}