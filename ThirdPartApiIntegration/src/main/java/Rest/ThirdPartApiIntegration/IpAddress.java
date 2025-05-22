package Rest.ThirdPartApiIntegration;

public class IpAddress {
	String ip;
	String country;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public IpAddress(String ip, String country) {
		super();
		this.ip = ip;
		this.country = country;
	}
	public IpAddress() {
		
	}
	

}
