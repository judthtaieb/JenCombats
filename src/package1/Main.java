package package1;

public class Main {

	public static void main(String[] args) {
		
		Lutin lutin1= new Lutin();
		System.out.println(lutin1.toString());
		
		Ogre ogre1 =new Ogre();
		System.out.println(ogre1.toString());
		
		Princesse princesse1 =new Princesse();
		System.out.println(princesse1.toString());

		
		Chevalier chevalier1 =new Chevalier();
		System.out.println(chevalier1.toString());
		
		princesse1.Gifle(ogre1);
		System.out.println(ogre1.getSante());
		
		princesse1.Coupspecial(lutin1);
		System.out.println(lutin1.getSante());
		
		chevalier1.Gifle(ogre1);
		System.out.println(ogre1.getSante());
		
		chevalier1.Coupspecial(lutin1);
		System.out.println(lutin1.getSante());
		
		lutin1.rugir(chevalier1);
		System.out.println(chevalier1.getSante());
		
		lutin1.coupdesalete(princesse1);
		System.out.println(princesse1.getSante());
		
		ogre1.rugir(chevalier1);
		System.out.println(chevalier1.getSante());
		
		ogre1.coupdesalete(princesse1);
		System.out.println(princesse1.getSante());
		
		

	}

}
