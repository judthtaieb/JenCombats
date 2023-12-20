package package1;

public abstract class Personnage {


	protected int musculation;
	protected int endurance ;
	protected int lachete;
	protected int sante;

	@Override
	public String toString() {
		return "Personnage [musculation=" + musculation + ", endurance=" + endurance + ", lachete=" + lachete
				+ ", sante=" + sante + "]";
	}

	/**
	 * @return the sante
	 */
	public int getSante() {
		return sante;
	}
	/**
	 * @param sante the sante to set
	 */
	public void setSante(int sante) {
		this.sante = sante;
	}



}
