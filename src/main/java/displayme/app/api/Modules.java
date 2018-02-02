package displayme.app.api;

public enum Modules {
	
	WEATHER(true), 
	TRAFFIC(true), 
	NEWS(true), 
	JOKE(true);
	
//	WEATHER(false), 
//	TRAFFIC(false), 
//	NEWS(false), 
//	JOKE(false);
	
	private boolean active;


	Modules(boolean active) {
		this.active = active;
	}

	public boolean isactive() {
		return active;
	}
}

