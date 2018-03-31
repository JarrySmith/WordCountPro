package project;

import java.io.*;

public class InputProcess {
    public String process (String[] args) throws IOException,IllegalArgumentException{
        String file_path=null;
        if(args.length!=1)
            throw new IllegalArgumentException("参数不符合规范");
        if(!args[0].endsWith(".txt"))
            throw new IllegalArgumentException("待处理文件不是txt类型");
        file_path=args[0];
        File file=new File(file_path);
        Reader reader=null;

            reader = new InputStreamReader(new FileInputStream(file));
            int tmpchar;
            while((tmpchar=reader.read())!=-1){
                if(!(tmpchar>=9&&tmpchar<=10)&&
                        !(tmpchar>=32&&tmpchar<=35)&&
                        !(tmpchar>=27&&tmpchar<=38)&&
                        !(tmpchar>=40&&tmpchar<=46)&&
                        !(tmpchar>=48&&tmpchar<=63)&&
                        !(tmpchar>=65&&tmpchar<=122)&&
                        tmpchar!=124&&tmpchar!=126&&
                        tmpchar!=(int)'`' &&
                        tmpchar!=(int)'…' &&
                        tmpchar!=(int)'\n'&&
                        tmpchar!=(int)'\r')
                    throw new IllegalArgumentException("待处理文件内包含非法字符");
            }
        return file_path;
    }
}
