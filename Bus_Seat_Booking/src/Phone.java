
public class Phone
{
    private String countrycode;
    private String code;
    private String number;
    private String type;
    
	public Phone(String countrycode, String code, String number, String type) 
	{
		
		this.countrycode = countrycode;
		this.code = code;
		this.number = number;
		this.type = type;
	}

	public Phone(String code, String number, String type) 
	{
		this.countrycode = "+90";
		this.code = code;
		this.number = number;
		this.type = type;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Phone [countrycode=" + countrycode + ", code=" + code + ", number=" + number + ", type=" + type + "]";
	}
    
	
    
	
}
