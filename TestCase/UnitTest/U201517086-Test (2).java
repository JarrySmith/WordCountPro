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
public class WcProTestFuncpart1 extends TestCase {
    private String[]args;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    public WcProTestFuncpart1(String[]args)
    {
        this.args=args;
    }
    @Parameterized.Parameters
    public static Collection data(){
        String[]test1={"result.txt"};
        String[]test2={"result.txt","sad.txt"};
        String[]test3={"result.java"};
        String[]test4={};
        return Arrays.asList(new Object[][]{
                {test1}, {test2}, {test3}, {test4},
        });
    }
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void testfuncpart1() throws Exception {
        expectedException.expect(IllegalArgumentException.class);
        WcPro wcPro = new WcPro();
        wcPro.funcpart1(args);
    }


}
