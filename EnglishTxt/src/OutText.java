import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Collections;

import java.util.Comparator;

import java.util.LinkedHashMap;

import java.util.LinkedList;

import java.util.Map;

import java.util.Set;

import java.util.Map.Entry;


public class OutText {
public void sortMapByKeys(Map<String, Integer> Map){  

		

        Set<Entry<String,Integer>> mapEntries = Map.entrySet();    

        LinkedList<Entry<String, Integer>> List = new LinkedList<Entry<String,Integer>>(mapEntries);

        // ����ӳ��ļ����б�����

        Collections.sort(List, new Comparator<Entry<String,Integer>>() {  

            @Override  

            public int compare(Entry<String, Integer> ele1,  Entry<String, Integer> ele2) {

                return ele1.getKey().compareTo(ele2.getKey());  

            }  

        });  

        Map<String,Integer> Map2 = new LinkedHashMap<String, Integer>();  

        for(Entry<String,Integer> entry: List) {  

            Map2.put(entry.getKey(), entry.getValue());  

        }  

        //������õĵ��ʼ���Ӧ�Ĵ�Ƶ�ŵ��ļ���

        File file = new File("src/result.txt");

        try {

        	if(file.exists()) {

        		file.createNewFile();

        	}

        	FileWriter fop = new FileWriter(file.getAbsoluteFile());

        	for(Entry<String,Integer> entry : Map2.entrySet()) {

        		fop.write(entry.getKey()+":\t"+entry.getValue()+"\n");

        	}

        	fop.close();

        	System.out.println("���ʼ���Ƶ�����ֵ�˳��������ļ�result.txt��");

        }catch(IOException e) {

        	e.printStackTrace();

        }

	} 

}
