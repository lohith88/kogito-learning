package org.maersk.rules;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

public class StatusRequestUnit implements RuleUnitData{
	
	private DataStore<StatusRequest> statusRequests = DataSource.createStore();

    public DataStore<StatusRequest> getStatusRequests() {
        return statusRequests;
    }
    
    
    


}
