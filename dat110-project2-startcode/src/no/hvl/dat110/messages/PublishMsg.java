package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	// message sent from client to create publish a message on a topic 
	
	String topic;
	String msg;
	
	public PublishMsg(String user, String topic, String msg) {
		super(MessageType.PUBLISH,user);
		this.topic = topic;
		this.msg = msg;
	}
	

	// TODO:
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}


	


	@Override
	public String toString() {
return "PublishMsg{" + "topic='" + topic + "message=" + msg + ", user='" + getUser() + '}';
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}


	public String getMessage() {
		
		return msg;	
		
	}
}
