import java.util.Scanner;

public class Apache extends Server{
	
	Scanner read = new Scanner(System.in);
	private int choosen;
	
	@Override
	public Server clonar() {
		return new Apache();
	}
	
	@Override
	public void start() {
		System.out.println("\n====WELCOME TO APACHE SERVER====\n");
		setPort("80");
		setPid("7688");
	}
	
	@Override
	public void stop() {
		setPid(null);
		setPort(null);
	}

	@Override
	public void config() {
		System.out.println("!CONFIG PANEL!");
		System.out.println("Press a number to config\n");
		System.out.println("1: httpd.conf");
		System.out.println("2: httpd-ssl.conf");
		System.out.println("3: php.ini");
		System.out.println("\nSelect: ");
		setChoosen(read.nextInt());
		
		switch(getChoosen()) {
		 case 1:
			 System.out.println("# This is the main Apache HTTP server configuration file.  It contains the\r\n" + 
			 		"# configuration directives that give the server its instructions.\r\n" + 
			 		"# See <URL:http://httpd.apache.org/docs/2.4/> for detailed information.\r\n" + 
			 		"");
			 break;
			 
		 case 2: 
			 System.out.println("# This is the Apache server configuration file providing SSL support.\r\n" + 
			 		"# It contains the configuration directives to instruct the server how to\r\n" + 
			 		"# serve pages over an https connection. For detailed information about these \r\n" + 
			 		"# directives see <URL:http://httpd.apache.org/docs/2.4/mod/mod_ssl.html>\r\n" + 
			 		"");
			 break;
		
		 case 3: 
			 System.out.println("# PHP's initialization file, generally called php.ini, is responsible for\r\n" + 
			 		"# configuring many of the aspects of PHP's behavior.\r\n" + 
			 		"");
			 break;
			 
			 default:
				 System.out.println("ERROR: Click config again then choose one option.\n");
				 break;
		}	
	}

	@Override
	public void log() {
		System.out.println("!LOG PANEL!\n");
		System.out.println("[main]: Initializing Control Panel");
		System.out.println("[main]: Control Panel Ready");
		System.out.println("[main]: Apache Installation Directory: \"c:\\Apache\"");
		if(getPort()=="80" && getPid()=="7688") {
			System.out.println("[Apache]: Attempting  to start Apache app...");
			System.out.println("[Apache]: Status detected: running");
		}if(getPort()=="0" && getPid()=="0"){
			System.out.println("[Apache]: Status detected: uninitialied");
		}if(getPort()==null && getPort()==null) {
			System.out.println("[Apache]: Attempting to stop Apache PID: "+getPid());
			System.out.println("\n[Apache]: Status detected: stopped");
		}
	}

	public int getChoosen() {
		return choosen;
	}

	public void setChoosen(int choosen) {
		this.choosen = choosen;
	}
}
