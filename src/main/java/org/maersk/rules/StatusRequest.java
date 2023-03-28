package org.maersk.rules;

import java.util.List;

public class StatusRequest {

	private List<PortCountry> portCountries;
	private List<PartyCountry> partyCountries;
	private List<Currency> currencies;
	
	private boolean approved;

	public List<PortCountry> getPortCountries() {
		return portCountries;
	}

	public void setPortCountries(List<PortCountry> portCountries) {
		this.portCountries = portCountries;
	}

	public List<PartyCountry> getPartyCountries() {
		return partyCountries;
	}

	public void setPartyCountries(List<PartyCountry> partyCountries) {
		this.partyCountries = partyCountries;
	}

	public List<Currency> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<Currency> currencies) {
		this.currencies = currencies;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

}
