package com.briup.ch11;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamTest {

	public static void main(String[] args) throws Exception {
		
		PipedOutputStream pos=new PipedOutputStream();
//		PipedInputStream pis=new PipedInputStream(pos);
		PipedInputStream pis=new PipedInputStream();
		//管道对接
		pis.connect(pos);
		
		Input in=new Input(pis);
		Output out=new Output(pos);
		
		new Thread(out).start();
		new Thread(in).start();
		
	}
}

//发送数据
class Output implements Runnable{

	private PipedOutputStream out;
	
	public Output(PipedOutputStream out) {
		this.out=out;
	}
	@Override
	public void run() {
		try {
			out.write("hello,pipedStream!".getBytes());
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(out!=null){
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
}

//读取数据，并将数据打印的控制台
class Input implements Runnable{

	private PipedInputStream in;
	
	public Input(PipedInputStream in) {
		this.in=in;
	}
	
	@Override
	public void run() {
		byte[] buf=new byte[512];
		try {
			int len = in.read(buf);
			System.out.write(buf, 0, len);
			System.out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}


