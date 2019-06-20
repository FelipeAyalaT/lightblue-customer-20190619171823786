package customer;

public class Customer
{
	private String _id;
	private String _rev;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String imageUrl;
	
	public String getCustomerId ()
	{
		return _id;
	}
	
	public void setCustomerId(String value)
	{
		this._id = value;
	}
	
	public String getRev ()
	{
		return _rev;
	}
	
	public void setRev(String value)
	{
		this._rev = value;
	}
	
	public String getUsername ()
	{
		return username;
	}
	
	public void setUsername(String value)
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
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String value)
	{
		this.firstName = value;
	}
	
	public String getlastName ()
	{
		return lastName;
	}
	
	public void setLastName(String value)
	{
		this.lastName = value;
	}
	
	public String getEmail ()
	{
		return email;
	}
	
	public void setEmail(String value)
	{
		this.email = value;
	}
	
	public String getImageUrl ()
	{
		return imageUrl;
	}
	
	public void setImageUrl(String value)
	{
		this.imageUrl = value;
	}
}