package calci;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2+3, 5);
	}
	
	@Test
	public void test12()
	{
		Assert.assertEquals(5+8, 13);
	}

}
