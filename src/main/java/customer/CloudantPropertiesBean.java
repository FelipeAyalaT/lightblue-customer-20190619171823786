package customer;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="spring.cloudant")

public class CloudantPropertiesBean
{
	private String username;
	private String password;
	private String host;
	private String protocol;
	private String port;
	private String database;
	
	public String getUserName ()
	{
		return username;
	}
	
	public void setUserName(String value)
	{
		this.username = value;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String value)
	{
		this.password = value;
	}
	
	public String getHost()
	{
		return host;
	}
	
	public void setHost(String value)
	{
		this.host = value;
	}
	
	public String getProtocol ()
	{
		return protocol;
	}
	
	public void setProtocol(String value)
	{
		this.protocol = value;
	}
	
	public String getPort ()
	{
		return port;
	}
	
	public void setPort(String value)
	{
		this.port = value;
	}
	
	public String getDatabase ()
	{
		return database;
	}
	
	public void setDatabase(String value)
	{
		this.database = value;
	}
	
}