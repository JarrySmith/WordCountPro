package test.project; 

import org.junit.Test;
import project.InputProcess;

import java.io.*;

import static org.junit.Assert.*;

/** 
* InputProcess Tester. 
* 
* @author 周志为
* @since 2018/04/02
* @version 1.0 
*/ 
public class InputProcessTest {
    @Test(expected = IllegalArgumentException.class)
    public void testArgument1() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArgument2() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={""};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArgument3() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={"a"};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArgument4() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={"a.bat"};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArgument5() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={"a.bat",""};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArgument6() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={"a.bat","a"};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArgument7() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={"a.txt","b"};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArgument8() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={"","a"};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArgument9() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={"","a.txt"};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArgument10() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={"","a.bat"};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArguement11() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={"test.txt","b","c"};
        assertEquals(input[0],test.processInput(input));
    }

    @Test(expected = FileNotFoundException.class)
    public void testeNotFound1() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={"a.bat.txt"};
        test.processInput(input);
    }

    @Test(expected = FileNotFoundException.class)
    public void testeNotFound2() throws Exception {
        InputProcess test=new InputProcess();
        String[] input={"notfound.txt"};
        assertEquals(input[0],test.processInput(input));
    }

    @Test
    public void testRead1() throws Exception {
        try{
            File file=new File("test1.txt");
            FileWriter out=new FileWriter(file);
            out.write("abcdefghijklmnopqrstuvwxyz" +
                    "0123456789" +
                    "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                    "~`!#%^&*_." +
                    "()[]+=-:;“”\"‘’'|" +
                    "<>,./? \n\r");
            out.close();
        }
        catch (IOException e){
            System.out.println("IO error"+e);
        }
        InputProcess test=new InputProcess();
        String[] input={"test1.txt"};
        assertEquals(input[0],test.processInput(input));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRead2() throws Exception {
        try{
            File file=new File("test2.txt");
            FileWriter out=new FileWriter(file);
            out.write((char)1);
            out.close();
        }
        catch (IOException e){
            System.out.println("IO error"+e);
        }

        InputProcess test=new InputProcess();
        String[] input={"test2.txt"};
        test.processInput(input);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testRead3() throws Exception {
        try{
            File file=new File("test3.txt");
            FileWriter out=new FileWriter(file);
            out.write("$");
            out.close();
        }
        catch (IOException e){
            System.out.println("IO error"+e);
        }
        InputProcess test=new InputProcess();
        String[] input={"test3.txt"};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRead4() throws Exception {
        try{
            File file=new File("test4.txt");
            FileWriter out=new FileWriter(file);
            out.write("\t");
            out.close();
        }
        catch (IOException e){
            System.out.println("IO error"+e);
        }
        InputProcess test=new InputProcess();
        String[] input={"test4.txt"};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRead5() throws Exception {
        try{
            File file=new File("test5.txt");
            FileWriter out=new FileWriter(file);
            out.write("@");
            out.close();
        }
        catch (IOException e){
            System.out.println("IO error"+e);
        }
        InputProcess test=new InputProcess();
        String[] input={"test5.txt"};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRead6() throws Exception {
        try{
            File file=new File("test6.txt");
            FileWriter out=new FileWriter(file);
            out.write("{");
            out.close();
        }
        catch (IOException e){
            System.out.println("IO error"+e);
        }
        InputProcess test=new InputProcess();
        String[] input={"test6.txt"};
        test.processInput(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRead7() throws Exception {
        try{
            File file=new File("test7.txt");
            FileWriter out=new FileWriter(file);
            out.write("}");
            out.close();
        }
        catch (IOException e){
            System.out.println("IO error"+e);
        }
        InputProcess test=new InputProcess();
        String[] input={"test7.txt"};
        test.processInput(input);
    }



} 
