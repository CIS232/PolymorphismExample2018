package edu.carrollcc;
import java.lang.Readable;

public interface ReadableBody {
	String getTextBody();

	default void display(){
		System.out.println("Body: " + getTextBody());
	}
}
