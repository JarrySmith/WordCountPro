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

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class WcProTestFuncpart3 extends TestCase {
    private String[]args;
    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    public WcProTestFuncpart3(String[]args)
    {
        this.args=args;
    }
    @Parameterized.Parameters
    public static Collection data(){
        String[]test1={"outputtest1.txt"};
        String[]test2={"outputtest2.txt"};
        return Arrays.asList(new Object[][]{
                {test1}, {test2}
        });
    }
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void testfuncpart3() throws Exception {
        WcPro wcPro = new WcPro();
        wcPro.funcpart3(args);
    }



}
