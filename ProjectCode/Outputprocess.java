package project;
import java.io.*;
import java.util.*; 
import java.util.Map.Entry;

/**
 * @author ����ϣ����ѧԺ
 */

public class Outputprocess {
	//��Ƶ�Σ�value��������ͬƵ�εİ��ֵ�˳������
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
            //��������  
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());  
			}  
        });  
  
        for (Map.Entry<String, Integer> mapping : list) {//��������
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
	public static void outPutToText(String result) throws IOException{//����������result.txt
		String outPutPath="result.txt";
		File file = new File(outPutPath);
		FileWriter out = new FileWriter(file,false);
		out.write(result);
		out.close();
	}
}
