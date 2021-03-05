package no.hvl.dat110.messages;

public class CreateTopicMsg extends Message {
	
	// message sent from client to create topic on the broker
	String topic;
	
	public CreateTopicMsg(String topic, String user) {
		super(MessageType.CREATETOPIC,user);
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "CreateTopicMsg [user=" + topic + "]";
	}
	
	// TODO: 
	// Implement object variables - a topic is required
	
	
	// Constructor, get/set-methods, and toString method
	
    // as described in the project text	
}