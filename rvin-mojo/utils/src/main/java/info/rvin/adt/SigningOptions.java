/**
 * Flexmojos is a set of maven goals to allow maven users to compile, optimize and test Flex SWF, Flex SWC, Air SWF and Air SWC.
 * Copyright (C) 2008-2012  Marvin Froeder <marvin@flexmojos.net>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * 
 */
package info.rvin.adt;

import java.util.ArrayList;
import java.util.List;

import com.adobe.argv.UsageError;

/**
 * Class to provide signing options for the ADT tool.
 * 
 * @author Joost den Boer
 *
 */
public class SigningOptions {

	// store type
	private String storetype;

	// store password
	private String storepass;
	
	// keystore
	private String keystore;

	// keystore password
	private String keypass;
	
	// provider name
	private String providerName;
	
	// tsa url
	private String tsaUrl;
	
	/**
	 * Default empty constructor
	 *
	 */
	public SigningOptions() {
		super();
	}
	
	/**
	 * Returns a list of signing options set on this object
	 * to use with the ADT tool.
	 * 
	 * @return List of options
	 * @throws UsageError 
	 */
	public List<String> getSigningOptions() throws UsageError {
		
		List<String> options = new ArrayList<String>();
		if(storetype != null) {
			options.add("-storetype");
			options.add(storetype);
		}
		if(keystore != null) {
			options.add("-keystore");
			options.add(keystore);
		}
		if(storepass != null) {
			options.add("-storepass");
			options.add(storepass);
		}
		if(keypass != null) {
			options.add("-keypass");
			options.add(keypass);
		}
		if(providerName != null) {
			options.add("-providerName");
			options.add(providerName);
		}
		if(tsaUrl != null) {
			options.add("-tsa");
			options.add(tsaUrl);
		}
		
		if(options.isEmpty()) {
			throw new UsageError("No signing options set");
		}
		
		// return options
		return options;
	}

	/**
	 * @return the keypass
	 */
	public String getKeypass() {
		return keypass;
	}

	/**
	 * @param keypass the keypass to set
	 */
	public void setKeypass(String keypass) {
		this.keypass = keypass;
	}

	/**
	 * @return the keystore
	 */
	public String getKeystore() {
		return keystore;
	}

	/**
	 * @param keystore the keystore to set
	 */
	public void setKeystore(String keystore) {
		this.keystore = keystore;
	}

	/**
	 * @return the providerName
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * @param providerName the providerName to set
	 */
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	/**
	 * @return the storepass
	 */
	public String getStorepass() {
		return storepass;
	}

	/**
	 * @param storepass the storepass to set
	 */
	public void setStorepass(String storepass) {
		this.storepass = storepass;
	}

	/**
	 * @return the storetype
	 */
	public String getStoretype() {
		return storetype;
	}

	/**
	 * @param storetype the storetype to set
	 */
	public void setStoretype(String storetype) {
		this.storetype = storetype;
	}

	/**
	 * @return the tsaUrl
	 */
	public String getTsaUrl() {
		return tsaUrl;
	}

	/**
	 * @param tsaUrl the tsaUrl to set
	 */
	public void setTsaUrl(String tsaUrl) {
		this.tsaUrl = tsaUrl;
	}
	
}
