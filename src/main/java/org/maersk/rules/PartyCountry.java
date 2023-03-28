package org.maersk.rules;

public class PartyCountry {
	
	private String alternativeCodeVal = "";

	public String getAlternativeCodeVal() {
		return alternativeCodeVal;
	}

	public void setAlternativeCodeVal(String alternativeCodeVal) {
		this.alternativeCodeVal = alternativeCodeVal;
	}

	@Override
	public String toString() {
		return "PartyCountry [alternativeCodeVal=" + alternativeCodeVal + "]";
	}
	

}
