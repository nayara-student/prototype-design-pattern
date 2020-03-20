
public abstract class Server {
	private String pid = "0";
	private String port = "0";

	public abstract Server clonar();
	public abstract void start();
	public abstract void stop();
	public abstract void config();
	public abstract void log();
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
}
