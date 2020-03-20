import java.util.Scanner;

public class Mysql extends Server{
	
	Scanner read = new Scanner(System.in);
	
	@Override
	public Server clonar() {
		return new Mysql();
	}
	
	@Override
	public void start() {
		System.out.println("\n====WELCOME TO MYSQL SERVER====\n");
		setPort("3306");
		setPid("376");
	}

	@Override
	public void stop() {
		setPid(null);
		setPort(null);
	}

	@Override
	public void config() {
		System.out.println("!CONFIG PANEL!");
		System.out.println("Admin");
		System.out.println("http://localhost/phpmyadmin/\n");
	}

	@Override
	public void log() {
		System.out.println("!LOG PANEL!\n");
		if(getPort()=="3306" && getPid()=="376") {
			System.out.println("[mysql]: Attempting  to start MySQL app...");
			System.out.println("[mysql]: Status detected: running");
		}if(getPort()=="0" && getPid()=="0"){
			System.out.println("[mysql]: Status detected: uninitialied");
		}if(getPort()==null && getPort()==null) {
			System.out.println("[mysql]: Attempting to stop MySQL app...");
			System.out.println("[mysql]: Status detected: stopped");
		}
	}	
}
