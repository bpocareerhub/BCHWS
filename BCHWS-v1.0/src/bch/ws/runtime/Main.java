package bch.ws.runtime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import bch.ws.beans.Users;

public class Main {
	public static void main(String[] args) throws IOException {
		/*System.out.println("Hello World");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		System.out.println("Hi " + input);*/
		
		Users user = new Users(1, 1, "joy", "cornejo");
		System.out.println(user);
	}
}
