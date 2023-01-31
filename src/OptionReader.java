import java.util.*;

public class OptionReader {
	private static HashMap<String, String> userOptions = null;
	
	private OptionReader() {
		// TODO Auto-generated constructor stub
	}
	
	public static void readOptions() {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		Enumeration<String> keys = rb.getKeys();
		userOptions = new HashMap<String, String>();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = rb.getString(key);
			userOptions.put(key, value);
		}
	}
	
	public static boolean getBoolean(String key) {
		boolean value = false;
		if (userOptions.containsKey(key)) {
			value = Boolean.parseBoolean(userOptions.get(key));
		}
		return value;
	}
	
	
	

}
