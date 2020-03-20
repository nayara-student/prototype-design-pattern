
public class LocalEnvironment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apache webService = new Apache();
		Mysql dataBase = new Mysql();
		
		Server apacheServer = webService.clonar();
		apacheServer.start();
		apacheServer.config();
		apacheServer.log();
		
		Server mysqlServer = dataBase.clonar();
		mysqlServer.start();
		mysqlServer.config();
		mysqlServer.stop();
		mysqlServer.log();
	}
}
