package Practicetestng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
@Test (priority=1)
public void testcase()
{
	System.out.println("1st test case")
	;
	}

@Test
public void testcase2()
{
	System.out.println("2nd test case");
	}
@BeforeTest
public void beforetest()
{
	System.out.println("before test");
	}
@BeforeClass
public void beforeclass()
{
	System.out.println("before class");
	}

@BeforeMethod
public void beforeMethod()
{
	System.out.println("before method");
	}

}
