package abstractFactory;

public class Engineer {

	public Vaate vaatteet;
	
	Engineer(Vaate vaatteet){
		this.vaatteet = vaatteet;
	}

	void listaaVaatteet() {
		System.out.println("Päälläni on: \n");
		System.out.println(vaatteet.getLippis().toString());
		System.out.println(vaatteet.getTpaita().toString());
		System.out.println(vaatteet.getFarkut().toString());
		System.out.println(vaatteet.getKengat().toString());
	}

	void setVaatteet(Vaate vaatteet) {
		this.vaatteet = vaatteet;
	}	
		
}
