package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Arithmetic {
	private int random;
	private int i;
	private int data1;
	private int data2;
	float count=0;
private	int grade=0;
	
 public int getRandom() {
	 	random=(int)(99*Math.random()+1);
		return random;
	}
 public int geti(){
	 i=new Random().nextInt(4);
	 return i;
 }	
	public void add(int data1,int data2){
		count=data1+data2;
		System.out.print(data1+"+"+data2+"=");
	}
	public void sub(int data1,int data2){
		count=data1-data2;
		System.out.print(data1+"-"+data2+"=");
		
	}
	public void mul(int data1,int data2){
		count=data1*data2;
		System.out.print(data1+"*"+data2+"=");
		
	}
	public void div(int data1,int data2){
		
		count=(float)data1/(float)data2;
		 count=(float)(Math.round(count*100))/100;
		System.out.println(count);
		System.out.print(data1+"/"+data2+"=");
		
	}
	public float FourArithmetic(){
		data1=getRandom();
		data2=getRandom();
		if(0==geti()){
			add(data1,data2);		
		}
		else if(1==geti()){
			sub(data1,data2);
		}
		else if(2==geti()){
			mul(data1,data2);
		}
		else
			{
			div(data1,data2);}
		return count;
	}
	
 @SuppressWarnings("resource")
public int Judge(double result){
	 
	 Scanner scan = new Scanner(System.in);
	  float read = scan.nextFloat();
	 // scan.close();
	  //	  System.out.println("输入数据："+read); 
	 if(read == result){
		 System.out.print("正确");
		 grade++;
	 }
	 else{
		 System.out.print("错误");
	 }
	 System.out.print(result);
	 return grade;
 }
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Arithmetic text = new Arithmetic();
		int grade=0;
		 BufferedReader reader=null;
	        InputStreamReader inputStreamReader=null;
	        try{
	            System.out.print("输入  # 结束运算:");
	           
	           String str;
	            do{
	            	float result=text.FourArithmetic();
	        	    grade=text.Judge(result);
	        	    inputStreamReader=new InputStreamReader(System.in);
		            reader=new BufferedReader(inputStreamReader);
		            str=reader.readLine();
	            }while(!str.equals("#"));
	            System.out.println("获得"+grade+"分,测试结束");
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        if(reader!=null){
	            try {
	                reader.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
		
		
		
	}

}
