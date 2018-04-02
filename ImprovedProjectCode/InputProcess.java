package project;

import java.io.*;

/**
 * InputProcess class
 *
 * @author 周志为
 * @date 2018/04/02
 */
public class InputProcess {
    public String processInput (String[] args) throws IOException,IllegalArgumentException{
        String filePath=null;
        String suffice=".txt";
        if(args.length!=1){
            throw new IllegalArgumentException("参数个数只能为1");
        }

        if(!args[0].endsWith(suffice)){
            throw new IllegalArgumentException("待处理文件不是txt类型");
        }
        filePath=args[0];
        File file=new File(filePath);
        Reader reader=null;
        reader = new InputStreamReader(new FileInputStream(file));
        int tmpchar;
        while((tmpchar=reader.read())!=-1){
            //ascii小于32时只有换行和回车是合法字符
            if(tmpchar<32&&tmpchar!=10&&tmpchar!=13)
            {
                throw new IllegalArgumentException("待处理文件内包含非法字符");
            }
            //ascii在32到60时，36美元符是非法字符
            if(tmpchar==36){
                throw new IllegalArgumentException("待处理文件内包含非法字符");
            }
            //ascii在60以上时，64电子邮件符号，92反斜杠"\"，123开花括号，125闭花括号，127及127以上的字符是非法字符。
            if(tmpchar==64||tmpchar==92){
                throw new IllegalArgumentException("待处理文件内包含非法字符");
            }
            if (tmpchar==123||tmpchar==125){
                throw new IllegalArgumentException("待处理文件内包含非法字符");
            }
            if(tmpchar>126&&tmpchar!='“'&&tmpchar!='”'&&tmpchar!='‘'&&tmpchar!='’'){
                throw new IllegalArgumentException("待处理文件内包含非法字符");
            }

        }
        return filePath;
    }
}
