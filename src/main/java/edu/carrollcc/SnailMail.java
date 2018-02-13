package edu.carrollcc;

public class SnailMail implements ReadableBody{

	private String body;
	public SnailMail(String body){
		this.body = body;
	}

	@Override
	public String getTextBody() {
		return body;
	}
}
