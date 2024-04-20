package optional.test.properties;

import java.util.HashMap;
import java.util.Map;


public class Properties {
	
	private Map<String,String> properties = new HashMap<>();
	
	public void setProperties(String key, String value) {
		properties.put(key, value);
	}
	public String getProperty(String key) {
		return properties.get(key);
	}
	
	public Properties() {
		
	}
	
	public  Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		
		private Properties properties = new Properties();
		
		public Builder() {
			
		}
		
		public Builder setProperties(String key, String value) {
			this.properties.properties.put(key, value);
			return this;
		}
		
		public Properties build() {
			return this.properties;
		}
		
	}
	
	

}
