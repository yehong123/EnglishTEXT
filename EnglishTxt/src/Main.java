import java.awt.Color;

import java.awt.Graphics;

import java.awt.Graphics2D;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;

import java.util.List;  

import java.util.Map;

import java.util.Scanner;

import java.util.TreeMap;

import javax.swing.JFrame; 
public class Main extends JFrame {
	private static final long serialVersionUID = 1L;

	public static String[] WordCount;

	public static Map<String, Integer> WordsCount;

	public static void main(String[] args) throws IOException{

		@SuppressWarnings("resource")

		Scanner in = new Scanner(System.in);

		//���롶�������ء�

		String line = "src/hali.txt";

		File file = new File(line);

		InputStreamReader is = new InputStreamReader(new FileInputStream(file), "utf-8");

		BufferedReader buff = new BufferedReader(is);

		List<String> list = new ArrayList<String>();//list��ֻ��Ŵ������ı�

		String readLine = null;//�����б��ʼΪ��

		while((readLine = buff.readLine())!=null){

			String[] WordsArr = readLine.split("[^a-zA-z]");

			for(String word:WordsArr){

				if(word.length()!=0){

					list.add(word);//����ȡ��Ĵ����ʷ���list

				}

			}

		}

		buff.close();

		WordsCount = new TreeMap<String,Integer>();//��ֵ�Դ洢������Ϣ��StringΪ���ʣ�IntegerΪ���ʳ��ִ���

		//��Ƶͳ��(��ѯ���γ��ִ�������ѭ�������ۼ�ͳ��)

		for(String lists:list){

			if(WordsCount.get(lists)!=null){

				WordsCount.put(lists, WordsCount.get(lists)+1);//���γ���Ƶ���ۼ�

			}else{

				WordsCount.put(lists, 1);

			}

		}while(true)
		{

		System.out.println("********��Ƶͳ�ƹ���********");

		System.out.println("��ѡ����(����1~5֮�������)��");

		System.out.println("1.ͳ�ƴ�Ƶ����");

		System.out.println("2.��ѯ��Ƶͳ����״ͼ");

		System.out.println("3.��ѯ��Ƶ��");

		System.out.println("4.���ֵ�˳�����");
		System.out.println("5.ͳ���ַ���������");
        System.out.println("6.�˳�ϵͳ");
		
		

		int i = in.nextInt();

		switch(i){

		case 1:WordCount wc = new WordCount();

				System.out.println("��������Ҫ��ѯ�ĵ���(����֮����',����')��");

				String s = in.next();

				wc.query(WordsCount, s);

				break;

		case 2:	WordCount wc1 = new WordCount();

   				System.out.println("��������Ҫ��ѯ�ĵ���(����֮����',����')��");

   				String s1 = in.next();

   				WordCount = wc1.query(WordsCount, s1);

   				Main demo = new Main();

   				demo.setVisible(true);

   				break;

		case 3:	TopWord hwc = new TopWord();

				System.out.println("������Ҫ��ѯ���ʵĸ���k(������)��");

				int n = in.nextInt();

				hwc.SortMap(WordsCount, n);

				break;

		case 4:	OutText wo = new OutText();

				wo.sortMapByKeys(WordsCount);

				break;
				
		
		case 5:	Test we = new Test();

		we.zzz(WordsCount);

		break;
		

		case 6: 	

				break;
		


   }
		}

   

}  

	//��������ͼ

	public Main(){

		super();

		setTitle("��������ͼ");

		setBounds(WordCount.length, 200, 600, 640);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override

	public void paint(Graphics g){

		int Width = getWidth();

		int Height = getHeight();

		int leftMargin = 50;//����ͼ��߽�

		int topMargin = 50;//����ͼ�ϱ߽�

		Graphics2D g2 = (Graphics2D) g;

		int ruler = Height-topMargin;

		int rulerStep = ruler/20;//����ǰ�ĸ߶�����Ϊ20����λ

		g2.setColor(Color.WHITE);//���ư�ɫ����

		g2.fillRect(0, 0, Width, Height);//���ƾ���ͼ

		g2.setColor(Color.LIGHT_GRAY);

		for(int i=0;i<rulerStep;i++){

			g2.drawString((30000-1500*i)+"��", 8, topMargin+rulerStep*i);//����Y���ϵ�����

		}

		g2.setColor(Color.RED);

		int m=0;

		for(int i = 0;i<WordCount.length;i++){

			int value = WordsCount.get(WordCount[i]);

			int step = (m+1)*40;//����ÿ������ͼ��ˮƽ���Ϊ40

			g2.fillRoundRect(leftMargin+step*2,Height-value/50-5, 40, value, 40, 10);//����ÿ����״��

			g2.drawString(WordCount[i], leftMargin+step*2, Height-value/50-5);	//��ʶÿ����״��		

			m++;

		}
		
	
	}
}
		
	


