package classcontrol.server.application;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import entities.Class;

public class ServeControl {

	public static void SendClass(List<Class> classList) {
		try (ServerSocket server = new ServerSocket(16345)) {
			while (true) {
				Socket client = server.accept();

				ObjectOutputStream exit = new ObjectOutputStream(client.getOutputStream());
				exit.flush();			
				exit.writeObject("connected successfully");

				for (Class currentClass : classList) {
					exit.writeObject(currentClass.toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
