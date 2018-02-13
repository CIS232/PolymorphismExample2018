package edu.carrollcc;

public class Email implements ReadableBody, Composable {

	private String body;

	public void setBody(String body){
		this.body = body;
	}

	@Override
	public String getTextBody() {
		return body;
	}

	@Override
	public void compose(String body){
		this.body = body + "\n>> " + this.body;
	}
}
