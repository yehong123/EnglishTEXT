import java.util.Map;

import java.util.Map.Entry;

import java.util.TreeMap;
public class WordCount {
	//��ѯ�û����赥�ʴ�Ƶ

	public String[]  query(Map<String, Integer> Map,String s) {
		long date1=System.currentTimeMillis();
		String[] word= s.split(",");//�û�����ʱ������֮����"��"����

        int i;

        for(i=0; i<word.length; i++) {

        	for(Entry<String,Integer> entry : Map.entrySet()) { 

        		if(word[i].equals(entry.getKey()))

        		{

        			System.out.println(entry.getKey() + ":\t " + entry.getValue()); 

        			break;

        		}

            } 

        }
        long date2=System.currentTimeMillis();
        long time=0;
	    time=date2-date1;
        System.out.println("ʱ��:"+time+"ms");

		return word;

    }
		

}
