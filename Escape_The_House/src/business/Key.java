package business;

import java.util.ArrayList;
import java.util.List;

import db.Database;

public class Key {
	
	//variables
	int keyId;
	String keyName;
	int keyLocation;
	
	//fully loaded constructor
	public Key(int keyId, String keyName, int keyLocation) {
		super();
		this.keyId = keyId;
		this.keyName = keyName;
		this.keyLocation = keyLocation;
	}
	
	//empty constructor
	public Key() {
		super();
	}

	
	//getters&setters
	public int getKeyId() {
		return keyId;
	}

	public void setKeyId(int keyId) {
		this.keyId = keyId;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public int getKeyLocation() {
		return keyLocation;
	}

	public void setKeyLocation(int keyLocation) {
		this.keyLocation = keyLocation;
	}

	//toString
	@Override
	public String toString() {
		return "Key [keyId=" + keyId + ", keyName=" + keyName + ", keyLocation=" + keyLocation + "]";
	}

}
