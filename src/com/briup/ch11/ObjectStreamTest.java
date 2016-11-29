package com.briup.ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.briup.bean.Student;

/**
 * 1.序列化对象所在的类必须实现Serializable接口
 * 2.如果属性是static或transient修饰，不能被序列化
 * @author lihong
 *
 */
public class ObjectStreamTest {

	public static void main(String[] args) {
		
//		writeObj();
		readObj();
	}

	//反序列化
	//将存储到硬盘的对象或者接受通过网络发送的对象读取到内存中
	private static void readObj() {
		ObjectInputStream ois=null;
		
		try {
			ois=new ObjectInputStream
					(new FileInputStream("src/obj.txt"));
			Student s=(Student) ois.readObject();
			System.out.println(s.getAge()+"=="+s.getName());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(ois!=null){
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	//对象的序列化，将内存中的对象存储到硬盘或者通过网络发送出去
	private static void writeObj() {
		
		ObjectOutputStream oos=null;
		
		try {
			FileOutputStream out=new FileOutputStream("src/obj.txt");
			oos=new ObjectOutputStream(out);
			Student s=new Student("张三", 20);
			oos.writeObject(s);
			oos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(oos!=null){
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}







