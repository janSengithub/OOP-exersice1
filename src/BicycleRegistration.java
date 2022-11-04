class BicycleRegistration{
	public static void main(String[] args){

		Bicycle bikeone, biketwo, bikethree;
		Bicycle bike1, bike2;
		String owner1, owner2, owner3;
		String tag1, tag2;

		bike1 = new Bicycle ();
		bike1.setOwnerName("K L");

		bike2 = new Bicycle ();
		bike2.setOwnerName("L K");

		bikeone = new Bicycle();
		bikeone.setTagNo("2004-134R.");

		biketwo = new Bicycle();
		biketwo.setTagNo("2002-139J.");

		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		tag1 = bikeone.getTagNo();

		owner1 = bike1.getOwnerName();
		owner2 = bike2.getOwnerName();
		tag2 = biketwo.getTagNo();

		bikethree = new Bicycle("2003-13I7", "S M");
		String tag3 = bikethree.setId();
		owner3 = bikethree.getOwnerName();


		System.out.println(owner1 + " owns a bicycle.");
		System.out.println("Bike tag no. is " + tag1);
		System.out.println();
		System.out.println(owner2 + " owns a bicycle too.");
		System.out.println("Bike tag no. is " + tag2);
		System.out.println();
		System.out.println(tag3 + " is the tag no. " + owner3 + " is the owner.");

	}
}
