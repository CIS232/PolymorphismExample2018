package edu.carrollcc;

import java.util.ArrayList;

public class App {

	public static void main(String[] args){
		ArrayList<ReadableBody> inbox = new ArrayList<>();

		inbox.add(new SnailMail("Hello you have won a prize!"));

		Email email = new Email();
		email.setBody("This is an email!");
		inbox.add(email);

		for(ReadableBody rb : inbox){
			System.out.println("----------");
			if(rb instanceof Email){
				System.out.println("*** Electronic Mail ***");
			}

			System.out.println("Body: " + rb.getTextBody());
			System.out.println("----------");
		}
	}

}
