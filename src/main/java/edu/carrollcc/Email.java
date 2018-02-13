package edu.carrollcc;

public class Email implements ReadableBody {

	private String body;

	public void setBody(String body){
		this.body = body;
	}

	@Override
	public String getTextBody() {
		return body;
	}
}
