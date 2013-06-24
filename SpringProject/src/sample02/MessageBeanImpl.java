package sample02;

import java.io.*;

public class MessageBeanImpl implements MessageBean {

	private String name;
	private String greeting;
	
	private Outputter outputter;
	
	public MessageBeanImpl(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		String msg = greeting + name + "!";
		System.out.println(msg);
		
		try {
			outputter.output(msg);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}

}
