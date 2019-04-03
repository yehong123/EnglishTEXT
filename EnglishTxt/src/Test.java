import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
 import java.io.FileWriter;
 import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
 import java.util.TreeMap;
 

 import java.util.Scanner;
public class Test {
	public void  zzz(Map<String, Integer> Map) throws IOException 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("请输入路径");
		String path=input.next();
		long date1=System.currentTimeMillis();
		int charNum= 0 ;
		int lineNum = 0;
		InputStreamReader isr = new InputStreamReader(new FileInputStream(path)); 
		BufferedReader br = new BufferedReader(isr);
		while( br.read()!= -1){
		String s = br.readLine();
		charNum+=s.length();
		lineNum ++; 
		}
		isr.close();//关闭
		System.out.println("字符数:"+charNum+"行 数:"+lineNum); 
		long date2=System.currentTimeMillis();
        long time=0;
	     time=date2-date1;
         System.out.println("时间:"+time+"ms");
		}

}
