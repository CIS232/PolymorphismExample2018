package edu.carrollcc;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args){
		ArrayList<ReadableBody> inbox = new ArrayList<>();

		inbox.add(new SnailMail("Hello you have won a prize!"));

		Email email = new Email();
		email.setBody("This is an email!");
		inbox.add(email);

		ReadableBody screamingMail = new ReadableBody() {
			@Override
			public String getTextBody() {
				return email.getTextBody().toUpperCase();
			}
		};
		inbox.add(screamingMail);

		Scanner keyboard = new Scanner(System.in);
		for(ReadableBody rb : inbox){
			System.out.println("----------");
			if(rb instanceof Email){
				System.out.println("*** Electronic Mail ***");
			}

			rb.display();
			System.out.println("----------");

			if(rb instanceof Composable) {
				Composable composable = (Composable)rb;
				System.out.println("What would you like to reply?");
				String reply = keyboard.nextLine();
				composable.compose(reply);
				System.out.println("Your new message will be: ");
				rb.display();
			}
		}


	}

}
