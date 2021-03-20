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
	
	@Test
	public void test13()
	{
		Assert.assertEquals(56+8, 13);
	}
	@Test
	public void test14()
	{
		Assert.assertEquals(6+8, 13);
	}

}
