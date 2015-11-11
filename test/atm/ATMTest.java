package atm;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class ATMTest {

	private static ATM atmTest;
	@Before
	public void setUP()
	{
		atmTest = new ATM(42, "Gordon College", "First National Bank of Podunk",null);
	}
	
	@Test
	public void testSwitchOn() {
		Scanner scan = new Scanner(System.in);
		atmTest.switchOn();
		assertEquals(atmTest.switchOn, true);
	}
	
	

}
