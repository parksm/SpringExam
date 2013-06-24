package sample01;


public class MessageBeanImpl implements MessageBean {

	private String name;
	private String greeting;
		
	public MessageBeanImpl(String name) {
		this.name = name;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public void sayHello() {
		System.out.println(greeting + name + "!");
	}
}
