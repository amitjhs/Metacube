package metacube.testng.Asserts;

import org.testng.Assert;

public class MAssert {

	public static void assertAreEqual(Object A, Object B){
		try{
			Assert.assertEquals(A, B);
		}catch(Exception e)
		{
			System.out.println("Assert Error: " + e.getMessage());
		}
	}
}
