package package1;

public class Lutin extends Personnage implements Monstre{
	private int mechancete;
	private int salete;
	
	public Lutin (){
		this.mechancete =8;
		this.salete=15;
		super.endurance =100;
		super.musculation =8;
		super.lachete =10;
		super.sante =100;
	}
	
	@Override
	public String toString() {
		return "Lutin [mechancete=" + mechancete + ", salete=" + salete + "]";
	}

	/**
	 * @return the mechancete
	 */
	public int getMechancete() {
		return mechancete;
	}

	/**
	 * @param mechancete the mechancete to set
	 */
	public void setMechancete(int mechancete) {
		this.mechancete = mechancete;
	}

	/**
	 * @return the salete
	 */
	public int getSalete() {
		return salete;
	}

	/**
	 * @param salete the salete to set
	 */
	public void setSalete(int salete) {
		this.salete = salete;
	}

	public void rugir() {
		
	}

	@Override
	public void rugir(Hero hero) {
		hero.setSante(hero.getSante()-10);
		
	}

	@Override
	public void coupdesalete(Hero hero) {
		hero.setSante(hero.getSante()-4);
		
	}

}
