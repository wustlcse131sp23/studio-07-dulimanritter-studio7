package studio7;

public class Die {

	private int n;

public Die(int initn)
	{
		n = initn;
}
public int getN() {
	return n;
}

public int rollDie() {
	return (int)(n * Math.random()) +1;
}
public static void main(String[] args)
{
	Die n1 = new Die (50);
	System.out.println("die rolled: " + n1.rollDie());	
	}
}
