package displayme.app;

public class ModuleUtility {

	public static String getTravelTimeFromSeconds(int seconds) {
		StringBuilder b = new StringBuilder();
    	int mins = seconds/60;
    	if (mins >= 60) {
    		int hours = mins/60;
    		if (hours > 0) { b.append(hours).append(" hr");
    		if (hours > 1) { b.append("s"); }}
    		mins = mins%60;
		}
    	if (mins > 0) 	{ b.append(" ").append(mins).append(" min");
		if (mins > 1) 	{ b.append("s"); }}
    	return b.toString().trim();
	}
}
