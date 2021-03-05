package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

	String topic;
	public UnsubscribeMsg(String topic, String user) {
		super(MessageType.UNSUBSCRIBE,user);
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
		return "UnsubscribeMsg [msg=" + topic + "]";
	}
	
	
	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
}
