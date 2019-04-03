import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.Map;

import java.util.Map.Entry;

public class TopWord {
	public void SortMap(Map<String,Integer> oldmap,int n){  

        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(oldmap.entrySet());
        long date1=System.currentTimeMillis();
        

        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){  

            @Override  

            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {  

                return o2.getValue() - o1.getValue();  //´ÊÆµÊý½µÐò 

            }  

        }); 

        for(int i = 0; i<n; i++){  

            System.out.println(list.get(i).getKey()+ ": " +list.get(i).getValue());  
            
        }     
        long date2=System.currentTimeMillis();
        long time=0;
	    time=date2-date1;
        System.out.println("Ê±¼ä:"+time+"ms");
    }

}
