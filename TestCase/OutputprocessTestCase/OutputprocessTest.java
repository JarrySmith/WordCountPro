package project;
import static org.junit.Assert.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class OutputprocessTest {

	@Test
	public void testcase1() {
		Map<String, Integer>   map1   =   new  HashMap();
    	String s=Outputprocess.sort(map1);
		assertEquals("", s);
	}
	
	@Test
	public void testcase2() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("a", 1);
    	String s=Outputprocess.sort(map1);
		assertEquals("a 1", s);
	}
	
	@Test
	public void testcase3() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("a", 2);
    	String s=Outputprocess.sort(map1);
		assertEquals("a 2", s);
	}
	
	@Test
	public void testcase4() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("a", 1);
		map1.put("b", 1);
    	String s=Outputprocess.sort(map1);
		assertEquals("a 1\nb 1", s);
	}
	
	@Test
	public void testcase5() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("a", 1);
		map1.put("c", 1);
		map1.put("b", 1);
    	String s=Outputprocess.sort(map1);
		assertEquals("a 1\nb 1\nc 1", s);
	}
	
	@Test
	public void testcase6() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("c", 1);
		map1.put("b", 1);
		map1.put("a", 1);
    	String s=Outputprocess.sort(map1);
		assertEquals("a 1\nb 1\nc 1", s);
	}
	
	@Test
	public void testcase7() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
    	String s=Outputprocess.sort(map1);
		assertEquals("c 3\nb 2\na 1", s);
	}
	
	@Test
	public void testcase8() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("a", 1);
		map1.put("b", 3);
		map1.put("c", 2);
    	String s=Outputprocess.sort(map1);
		assertEquals("b 3\nc 2\na 1", s);
	}
	
	@Test
	public void testcase9() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("a", 3);
		map1.put("b", 2);
		map1.put("c", 1);
    	String s=Outputprocess.sort(map1);
		assertEquals("a 3\nb 2\nc 1", s);
	}
	
	@Test
	public void testcase10() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("a", 1);
		map1.put("c", 2);
		map1.put("b", 3);
    	String s=Outputprocess.sort(map1);
		assertEquals("b 3\nc 2\na 1", s);
	}
	
	@Test
	public void testcase11() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("a", 1);
		map1.put("c", 3);
		map1.put("b", 2);
    	String s=Outputprocess.sort(map1);
		assertEquals("c 3\nb 2\na 1", s);
	}
	
	@Test
	public void testcase12() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("a", 3);
		map1.put("c", 2);
		map1.put("b", 1);
    	String s=Outputprocess.sort(map1);
		assertEquals("a 3\nc 2\nb 1", s);
	}
	
	@Test
	public void testcase13() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("c", 1);
		map1.put("b", 2);
		map1.put("a", 3);
    	String s=Outputprocess.sort(map1);
		assertEquals("a 3\nb 2\nc 1", s);
	}
	
	@Test
	public void testcase14() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("c", 1);
		map1.put("b", 3);
		map1.put("a", 2);
    	String s=Outputprocess.sort(map1);
		assertEquals("b 3\na 2\nc 1", s);
	}
	
	@Test
	public void testcase15() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("c", 3);
		map1.put("b", 2);
		map1.put("a", 1);
    	String s=Outputprocess.sort(map1);
		assertEquals("c 3\nb 2\na 1", s);
	}
	
	@Test
	public void testcase16() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("a", 3);
		map1.put("b", 3);
		map1.put("c", 3);
    	String s=Outputprocess.sort(map1);
		assertEquals("a 3\nb 3\nc 3", s);
	}
	
	@Test
	public void testcase17() {
		Map<String, Integer>   map1   =   new  HashMap();
		map1.put("asd-c", 6);
		map1.put("adcc", 6);
		map1.put("pob", 9);
		map1.put("cvbyu-nj", 2);
		map1.put("aqwmklxz", 5);
		map1.put("asd-op", 2);
    	String s=Outputprocess.sort(map1);
		assertEquals("pob 9\nadcc 6\nasd-c 6\naqwmklxz 5\nasd-op 2\ncvbyu-nj 2", s);
	}
	
	@Test
	public void testcase18() throws IOException {
		Outputprocess.outPutToText("");
		FileReader fr = new FileReader("result.txt");
		int ch=0;
		String s="";
		while((ch=fr.read())!=-1){
			s=s+ch;
		}
		fr.close();
		assertEquals("", s);
	}
	
	@Test
	public void testcase19() throws IOException {
		Outputprocess.outPutToText("a 1");
		FileReader fr = new FileReader("result.txt");
		int ch=0;
		String s="";
		while((ch=fr.read())!=-1){
			s=s+(char)ch;
		}
		fr.close();
		System.out.println(s);
		assertEquals("a 1", s);
	}
	
	@Test
	public void testcase20() throws IOException {
		Outputprocess.outPutToText("c 3\nb 2\na 1");
		FileReader fr = new FileReader("result.txt");
		int ch=0;
		String s="";
		while((ch=fr.read())!=-1){
			s=s+(char)ch;
		}
		fr.close();
		assertEquals("c 3\nb 2\na 1", s);
	}
}
