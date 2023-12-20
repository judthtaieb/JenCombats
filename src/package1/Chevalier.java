package package1;

public class Chevalier extends Personnage implements Hero{

	private int epee;
	private int intelligence;

	public Chevalier() {
		this.epee= 12;
		this.intelligence=8;
		super.endurance =100;
		super.musculation = 15;
		super.lachete =5;
		super.sante =100;
	}

	@Override
	public String toString() {
		return "Chevalier [epee=" + epee + ", intelligence=" + intelligence + "]";
	}

	/**
	 * @return the epee
	 */
	public int getEpee() {
		return epee;
	}

	/**
	 * @param epee the epee to set
	 */
	public void setEpee(int epee) {
		this.epee = epee;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	@Override
	public void Gifle(Monstre monstre) {
		monstre.setSante(monstre.getSante()-15);
		
	}

	@Override
	public void Coupspecial(Monstre monstre) {
		monstre.setSante(monstre.getSante()-8);
		
	}

}
