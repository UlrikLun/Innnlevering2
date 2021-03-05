package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

	// message sent from client to subscribe on a topic 
	String topic;
	
	public SubscribeMsg(String topic, String user) {
		super(MessageType.SUBSCRIBE,user);
		this.topic = topic;
	}

	public String getMsg() {
		return topic;
	}

	public void setMsg(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "SubscribeMsg [msg=" + topic + "]";
	}
	
	

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
		
}
