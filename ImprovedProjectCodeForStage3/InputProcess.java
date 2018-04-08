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
        return filePath;
    }
}
