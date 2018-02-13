package edu.carrollcc;

public class SnailMail implements ReadableBody, Composable{

	private String body;
	public SnailMail(String body){
		this.body = body;
	}

	@Override
	public String getTextBody() {
		return body;
	}

	@Override
	public void compose(String body) {
		this.body = body;
	}
}
