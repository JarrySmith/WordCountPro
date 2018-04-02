package test.project; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import project.WcPro;

import java.util.Arrays;
import java.util.Collection;

/** 
* WcPro Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 31, 2018</pre> 
* @version 1.0 
*/
@RunWith(Parameterized.class)
public class WcProTest { 
private String[]args;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
}
public WcProTest(String[]args)
{
    this.args=args;
}
@Parameterized.Parameters
    public static Collection data(){
    String[]test1={"result.txt"};

        return Arrays.asList(new Object[][]{
                {test1}
        });
    }
/** 
* 
* Method: main(String[]args) 
* 
*/ 
@Test
public void testMain() throws Exception {
    WcPro.main(args);
} 


} 
