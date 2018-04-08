package project;

import java.io.*;
import java.util.*;
import java.lang.String;
/**
 * @author 封俊羽;
 */
public class WordCount {

    public String readFilecontent(String path) throws Exception
    {
        String encoding = "GBK";
        File file = new File(path);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new FileNotFoundException("cannot find");
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("cannot find");
        }
        try {
            return new String(filecontent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }

    }

    public Map<String,Integer> wordCount(String path)
    {
        String context= null;
        try {
            context = readFilecontent(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return processString(context);
    }

    public Map<String,Integer> processString(String context)
    {
        String tempWord = "";
        char[]charOfContext=context.toCharArray();
        Map<String,Integer> wordsFrequency=new HashMap<String,Integer>(100);
        //遍历charOfContext进行处理
        boolean isword = false;
        boolean isleter = false;
        final char heng= '-';
        for(char temp : charOfContext)
        {
            //读取到为字母或者-时记录下来
             isleter = (temp>='a'&&temp<='z')||(temp>='A'&&temp<='Z')||(temp=='-'&&isword);
            //如果是字符就加入
            if(isleter)
            {
                isword = true;
                tempWord += temp;

            }
            //如果不是字符的话
            else
            {
                isword = false;
                //当读取到非单词字符时，判断tempstring是否为空，不为空则说明读取到了单词，输入map
                if(!tempWord.isEmpty())
                {
                    tempWord = tempWord.toLowerCase();

                    //当尾部为-时去除-
                    if(heng == tempWord.charAt(tempWord.length() - 1))
                    {
                        tempWord = tempWord.substring(0,tempWord.length()-1);
                    }
                    //map之前有的话+1，没有置为1
                    if(wordsFrequency.containsKey(tempWord))
                    {
                        int number = wordsFrequency.get(tempWord);
                        wordsFrequency.put(tempWord,number+1);
                    }
                    else
                    {
                        wordsFrequency.put(tempWord,1);
                    }
                    tempWord = "";
                }
            }
        }
        //最后一个字符的读取，这里应该也可以规避掉的
        if(!tempWord.isEmpty())
        {
            tempWord = tempWord.toLowerCase();
            //当尾部为-时去除-
            if(heng == tempWord.charAt(tempWord.length() - 1))
            {
                tempWord = tempWord.substring(0,tempWord.length()-1);
            }
            if(wordsFrequency.containsKey(tempWord))
            {
                int number = wordsFrequency.get(tempWord);
                wordsFrequency.put(tempWord,number+1);
            }
            else
            {
                wordsFrequency.put(tempWord,1);
            }
        }
        return wordsFrequency;
    }

}

