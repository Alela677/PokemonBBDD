
import Enum.Tipo;
import Models.Pok�mon;
import Models.Usuario;
import UI.LoginView;
import Utils.Almacen;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 
		 
		Pok�mon nuevo = new Pok�mon("Charmander",1, "Fuego", 0.6, 8.5, "Lagartija", "Mar LLamas",
				"https://assets.pokemon.com/assets/cms2/img/pokedex/full/004.png");
		Almacen.Pok�mon.add(nuevo);
		Pok�mon nuevo2 = new Pok�mon("Blastoise", 2, "Agua", 1.6, 85.5, "Armazon", "Torrente",
				"https://assets.pokemon.com/assets/cms2/img/pokedex/full/009.png");
		Almacen.Pok�mon.add(nuevo2);
		*/
		new LoginView();

	} 

}
