package removeA;

import static org.junit.Assert.*;

import org.junit.Test;
import stringupdate.*;
public class removeATest {
RemoveA r=new RemoveA();
	@Test
	public void test() {
		String ans=r.remove("ABCD");
		assertEquals("BCD",ans);
	}
	@Test
	public void test1()
	{
		String ans=r.remove("AACD");
		assertEquals("CD",ans);
	}
	@Test
	public void test2()
	{
		String ans=r.remove("BACD");
		assertEquals("BCD",ans);
	}
	@Test
	public void test3()
	{
		String ans=r.remove("AA");
		assertEquals("",ans);
	}
	@Test
	public void test4()
	{
		String ans=r.remove("A");
		assertEquals("",ans);
	}
	@Test
	public void test5()
	{
		String ans=r.remove("B");
		assertEquals("B",ans);
	}
}
