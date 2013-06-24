package sample01;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class HelloApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("sample01.xml"));
		MessageBeanImpl bean3 = factory.getBean("messageBean", MessageBeanImpl.class);
		
		bean3.sayHello();
		
		System.out.print((299/3f *10+0.5f) /10f);
	}

}
