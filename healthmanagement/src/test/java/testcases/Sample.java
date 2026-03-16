package testcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utility2.MyLister.class)
public class Sample {
	@Test
	public void a() {
		
		int a=10;
		int b=20;
		
		Assert.assertEquals(a,b);
	}

	@Test
	public void b() {
		
		int a=10;
		int b=20;
		
		Assert.assertEquals(a,b);
	}
	@Test
	public void c() {
		
		int a=10;
		int b=20;
		
		Assert.assertEquals(a,b);
	}

	@Test(dependsOnMethods= "a")
	public void d() {
		
		int a=10;
		int b=20;
		
		Assert.assertEquals(a,b);
	}


}
