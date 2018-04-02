package project;
import java.io.*;
import java.util.*; 
import java.util.Map.Entry;

/**
 * @author 李民聪，软件学院
 */

public class Outputprocess {
	//按频次（value）排序，相同频次的按字典顺序排序
	public static String sort(Map<String,Integer> wordsFrequency){
		String s="";
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(wordsFrequency.entrySet());  
		int flag=0;
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());  
			}  
        });  
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {  
            //升序排序  
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());  
			}  
        });  
  
        for (Map.Entry<String, Integer> mapping : list) {//降序排序
        	s=s+mapping.getKey()+" "+mapping.getValue()+"\n";
        	flag++;
        	if(flag==100){
        		
        		break;
        	}
        }
        if(s.length()>0){
        	s = s.substring(0,s.length() - 1);
        }
		return s;
	}
	public static void outPutToText(String result) throws IOException{//排序后输出到result.txt
		String outPutPath="result.txt";
		File file = new File(outPutPath);
		FileWriter out = new FileWriter(file,false);
		out.write(result);
		out.close();
	}
}
