package project;
import teamwork.*;


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
        catch (Exception e)
        {
            //异常处理
        }
        finally {
            //清空环境
        }

    }
}
