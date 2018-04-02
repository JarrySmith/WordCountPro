package test.project;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import project.WcPro;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class WcProTestFuncpart2 extends TestCase {
    private String[]args;
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    public WcProTestFuncpart2(String[]args)
    {
        this.args=args;
    }
    @Parameterized.Parameters
    public static Collection data(){
        String[]test1={"count1.txt"};
        String[]test2={"count2.txt"};
        String[]test3={"count3.txt"};
        String[]test4={"count4.txt"};
        String[]test5={"count5.txt"};
        String[]test6={"count6.txt"};
        String[]test7={"count7.txt"};
        String[]test8={"count8.txt"};
        String[]test9={"count9.txt"};
        String[]test10={"count10.txt"};
        String[]test11={"count11.txt"};
        String[]test12={"count12.txt"};
        String[]test13={"count13.txt"};
        return Arrays.asList(new Object[][]{
                {test1}, {test2}, {test3}, {test4},
                {test5}, {test6}, {test7}, {test8},
                {test9}, {test10}, {test11}, {test12},
                {test13}
        });
    }
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void testfuncpart2() throws Exception {
        expectedException.expect(IllegalArgumentException.class);

        WcPro wcPro = new WcPro();
        wcPro.funcpart2(args);
    }



}
