package package1;

public class Princesse extends Personnage implements Hero{
	private int epee;
	private int intelligence ;
	
	public Princesse(){
		this.epee = 6;
		this.intelligence =15;
		super.endurance=120;
		super.sante=100;
		super.lachete =2;
		super.musculation = 6;
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
	public String toString() {
		return "Princesse [epee=" + epee + ", intelligence=" + intelligence + "]";
	}
	
	public void Gifle (Monstre monstre) {
		monstre.setSante(monstre.getSante()-10);
	}
	
	public void Coupspecial(Monstre monstre) {
		monstre.setSante(monstre.getSante()-12);
	}

}
