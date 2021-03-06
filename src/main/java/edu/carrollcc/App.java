package edu.carrollcc;

import java.util.ArrayList;
import java.util.Scanner;



public class App {

	interface Calculator {
		int calculator(int x, int y);
	}

	public static void main(String[] args){
		ArrayList<ReadableBody> inbox = new ArrayList<>();

		inbox.add(new SnailMail("Hello you have won a prize!"));

		Email email = new Email();
		email.setBody("This is an email!");
		inbox.add(email);

		ReadableBody screamingMail = () -> {
			String screamingSuffix = "!!!!!!";
			return email.getTextBody().toUpperCase() + screamingSuffix;
		};
		inbox.add(screamingMail);

		Calculator adder = (x, y) -> x + y;
		System.out.println(adder.calculator(1,3));

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
