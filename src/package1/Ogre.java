package package1;

public class Ogre extends Personnage implements Monstre{
	private int arme ;
	private int mechancete ;



	public Ogre() {
		this.arme = 15;
		this.mechancete =12;
		this.lachete =3;
		super.endurance = 100;
		super.sante =100;
		super.musculation =10;
		super.lachete =3;

	}



	@Override
	public String toString() {
		return "Ogre [arme=" + arme + ", mechancete=" + mechancete + "]";
	}



	/**
	 * @return the arme
	 */
	public int getArme() {
		return arme;
	}



	/**
	 * @param arme the arme to set
	 */
	public void setArme(int arme) {
		this.arme = arme;
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




	@Override
	public void rugir(Hero hero) {
		hero.setSante(hero.getSante()-5);
	}



	@Override
	public void coupdesalete(Hero hero) {
		hero.setSante(hero.getSante()-15);

	}
}
