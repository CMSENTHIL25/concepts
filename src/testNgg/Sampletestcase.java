package testNgg;

import org.testng.annotations.Test;

public class Sampletestcase {
	@Test(groups ="bullet")
	public void bullet() {
		System.out.println("bullet ");
	}
	@Test(groups ="bullet")
	public void bullet2() {
		System.out.println("bullet2 ");
	
	
}

	@Test(groups ="harley")
	public void harley() {
		System.out.println("harley");

	}

	@Test(groups ="harley")
	public void harley2() {
		System.out.println("harley 2");

	}

	@Test(groups ="royal")
	public void royal() {
		System.out.println("royal");

	}
	@Test(groups ="royal")
	public void royal2() {
		System.out.println("royal2");
	
	
}

}