package project;

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
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            //清空环境
        }

    }
}
