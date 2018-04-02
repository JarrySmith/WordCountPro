package test.sample; 

import org.junit.Rule;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.rules.ExpectedException;
import project.WordCount;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
* WordCount Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 29, 2018</pre> 
* @version 1.0 
*/ 
public class WordCountTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

    /**
     *
     * Method: readFilecontent(String path)
     *
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void rightpath() throws Exception {
        String path = "C:\\Users\\f\\IdeaProjects\\WORDCOUNT\\count1.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        assertEquals("Let’s",temp);
    }
    @Test
    public void wrongpath1() throws Exception {
            thrown.expect(FileNotFoundException.class);
            String path = "C:\\Users\\f\\IdeaProjects\\count1.txt";
            WordCount wc = new WordCount();
            String temp = wc.readFilecontent(path);
    }
    @Test
    public void wrongpath2() throws Exception {
        thrown.expect(FileNotFoundException.class);
        String path = "count0.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
    }
    @Test
    public void emptypath() throws Exception {
        thrown.expect(FileNotFoundException.class);
        String path = "";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);

    }
    @Test
    public void absolutepath() throws Exception {
//TODO: Test goes here...
        String path = "count1.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        assertEquals("Let’s",temp);
    }
    @Test
    public void emptyfile() throws Exception {
        String path = "count6.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        assertEquals("",temp);
    }
    /**
     *
     * Method: processString(String context)
     *
     */
    @Test
    public void count1() throws Exception {
        String path = "count1.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        hope.put("let",1);
        hope.put("s",1);
        assertEquals(hope,w);
    }
    @Test
    public void count2() throws Exception {
        String path = "count2.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        hope.put("night",1);
        assertEquals(hope,w);
    }
    @Test
    public void count3() throws Exception {
        String path = "count3.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        hope.put("i",1);
        assertEquals(hope,w);
    }
    @Test
    public void count4() throws Exception {
        String path = "count4.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        hope.put("table",1);
        assertEquals(hope,w);
    }
    @Test
    public void count5() throws Exception {
        String path = "count5.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        hope.put("see",1);
        hope.put("c",1);
        hope.put("d",1);
        hope.put("box",1);
        assertEquals(hope,w);
    }
    @Test
    public void count6() throws Exception {
        String path = "count6.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        assertEquals(hope,w);
    }
    @Test
    public void count7() throws Exception {
        String path = "count7.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        hope.put("x-y",1);
        hope.put("y-x",1);
        assertEquals(hope,w);    }
    @Test
    public void count8() throws Exception {
        String path = "count8.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        assertEquals(hope,w);
    }
    @Test
    public void count9() throws Exception {
        String path = "count9.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        hope.put("table",1);
        assertEquals(hope,w);
    }
    @Test
    public void count10() throws Exception {
        String path = "count10.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        hope.put("sofa",1);
        hope.put("chair",2);
        hope.put("table",3);
        assertEquals(hope,w);
    }
    @Test
    public void count11() throws Exception {
        String path = "count11.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        hope.put("abc",1);
        hope.put("def",1);
        hope.put("ghi",1);
        assertEquals(hope,w);
    }
    @Test
    public void count12() throws Exception {
        String path = "count12.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        hope.put("abc",1);
        assertEquals(hope,w);
    }
    @Test
    public void count13() throws Exception {
        String path = "count13.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        hope.put("gba",8);
        assertEquals(hope,w);
    }
    @Test
    public void count14() throws Exception {
        String path = "count14.txt";
        WordCount wc = new WordCount();
        String temp = wc.readFilecontent(path);
        Map<String,Integer> w =new HashMap<>();
        w = wc.processString(temp);
        Map<String,Integer> hope =new HashMap<>();
        hope.put("sd",1);
        hope.put("vmoljkn",1);
        hope.put("safd",1);
        hope.put("j",1);
        hope.put("b-g",1);
        hope.put("skdf",1);
        assertEquals(hope,w);
    }




}

