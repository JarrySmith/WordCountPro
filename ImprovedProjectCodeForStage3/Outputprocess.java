package project;
import java.io.*;
import java.util.*; 
import java.util.Map.Entry;

public class Outputprocess {
	public  String sort(Map<String,Integer> wordsFrequency){
		String s="";
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(wordsFrequency.entrySet());  
		int flag=0;
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());  
			}  
        });  
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());  
			}  
        });  
  
        for (Map.Entry<String, Integer> mapping : list) {
        	s=s+mapping.getKey()+" "+mapping.getValue()+"\r\n";
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
	public void outPutToText(String result) throws IOException,Exception{
		if(result.equals("") ){throw new Exception("文本不包含统计单词");}
		String outPutPath="result.txt";
		File file = new File(outPutPath);
		FileWriter out = new FileWriter(file);
		out.write(result);
		out.close();
	}
}
