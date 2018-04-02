package project;

import java.io.*;

/*
*作者：周志为
 */

public class InputProcess {
    public String processInput (String[] args) throws IOException,IllegalArgumentException{
        String file_path=null;
        if(args.length!=1)
            throw new IllegalArgumentException("参数个数只能为1");
        if(!args[0].endsWith(".txt"))
            throw new IllegalArgumentException("待处理文件不是txt类型");
        file_path=args[0];
        File file=new File(file_path);
        Reader reader=null;
        reader = new InputStreamReader(new FileInputStream(file));
        int tmpchar;
        while((tmpchar=reader.read())!=-1){
            //ascii小于32时只有换行和回车是合法字符
            if(tmpchar<32&&tmpchar!=10&&tmpchar!=13)
                throw new IllegalArgumentException("待处理文件内包含非法字符");
            //ascii在32到60时，36美元符是非法字符
            if(tmpchar==36)
                throw new IllegalArgumentException("待处理文件内包含非法字符");
            //ascii在60以上时，64电子邮件符号，92反斜杠"\"，123开花括号，125闭花括号，127及127以上的字符是非法字符。
            if(tmpchar==64||tmpchar==92
                    ||tmpchar==123||tmpchar==125||
                    (tmpchar>126
                            &&tmpchar!='“'&&tmpchar!='“'
                            &&tmpchar!='”'&&tmpchar!='‘'&&tmpchar!='’')
                    )
                throw new IllegalArgumentException("待处理文件内包含非法字符");
        }
        return file_path;
    }
}
