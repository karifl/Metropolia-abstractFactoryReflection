package boss;

import abstractFactory.Vaate;
import abstractFactory.Farkut;
import abstractFactory.Kengat;
import abstractFactory.Lippis;
import abstractFactory.Tpaita;

public class BossFactory implements Vaate {
	
	public BossFactory() {
		
	}

	public Farkut getFarkut() {
		return new Bossfarkut();
	}

	public Lippis getLippis() {
		return new Bosslippis();
	}

	public Tpaita getTpaita() {
		return new Bosspaita();
	}

	public Kengat getKengat() {
		return new Bosskengat();
	}

}
