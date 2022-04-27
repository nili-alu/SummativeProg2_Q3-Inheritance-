// explaination in Readme.txt file
public class Fish implements Prey, Predator {

	@Override
	public void hunt() {
		System.out.println("Big Fish hunting for small fishes ");
		
	}

	@Override
	public void flee() {
		System.out.println("Small fishes are fleeing from big fishes");
		
	}

}
