package adidas;

import abstractFactory.Vaate;
import abstractFactory.Farkut;
import abstractFactory.Kengat;
import abstractFactory.Lippis;
import abstractFactory.Tpaita;

public class AdidasFactory implements Vaate {
	
	public AdidasFactory() {
		
	}
	
	public Farkut getFarkut() {
		return new Adifarkut();
	}

	public Lippis getLippis() {
		return new Adilippis();
	}

	public Tpaita getTpaita() {
		return new Adipaita();
	}

	public Kengat getKengat() {
		return new Adikengat();
	}
}