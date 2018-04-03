package project;
import teamwork.*;
import java.io.IOException;
import java.util.Map;

/**
 * @author 徐江南，软件学院
 */

public class WcPro {
    public static void main(String[]args)
    {
        try{
            InputProcess inputProcess=new InputProcess();
            Outputprocess outputprocess=new Outputprocess();
            WordCount wordCount = new WordCount();
            String filepath=inputProcess.processInput(args);
            Map<String,Integer> wordsFrequency= wordCount.wordCount(filepath);
            String sortedWordFrequency = outputprocess.sort( wordsFrequency);
            outputprocess.outPutToText(sortedWordFrequency);
        }
        catch (IllegalArgumentException e)
        {
            //异常处理
            e.printStackTrace();

        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            //清空环境
        }

    }
    public void funcpart1(String[]args)
    {
        try {
            InputProcess inputProcess=new InputProcess();
            String filepath=inputProcess.processInput(args);
        }
      catch (IllegalArgumentException e)
        {
            //异常处理
            e.printStackTrace();
        }
        finally {
        //清空环境
    }
    }
    public void funcpart2(String[]args)
    {
        try {
            InputProcess inputProcess=new InputProcess();
            WordCount wordCount = new WordCount();
            String filepath=inputProcess.processInput(args);
            Map<String,Integer> wordsFrequency= wordCount.wordCount(filepath);
        }
        catch (IllegalArgumentException e)
        {
            //异常处理
            e.printStackTrace();

        }

        finally {
            //清空环境
        }
    }
    public void funcpart3(String[]args)
    {
        try {
            InputProcess inputProcess=new InputProcess();
            Outputprocess outputprocess=new Outputprocess();
            WordCount wordCount = new WordCount();
            String filepath=inputProcess.processInput(args);
            Map<String,Integer> wordsFrequency= wordCount.wordCount(filepath);
            String sortedWordFrequency = outputprocess.sort( wordsFrequency);
            outputprocess.outPutToText(sortedWordFrequency);
        }
        catch (IllegalArgumentException e)
        {
            //异常处理
            e.printStackTrace();

        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            //清空环境
        }
    }
}
