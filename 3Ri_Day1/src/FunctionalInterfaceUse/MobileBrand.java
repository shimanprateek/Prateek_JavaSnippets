package FunctionalInterfaceUse;

import java.util.HashSet;
import java.util.Set;

public class MobileBrand {
	
	public String Company;
	
	public Set<String> devices;
	
	public void adddevices (String device_name)
	{
		if(this.devices == null)
		{
			this.devices = new HashSet<String>();
		}else
		{
			devices.add(device_name);
		}
		
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public Set<String> getDevices() {
		return devices;
	}

	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}
	
	
	
	

}
