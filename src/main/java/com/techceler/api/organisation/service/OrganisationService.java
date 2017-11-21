package com.techceler.api.organisation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.techceler.api.organisation.model.Branch;
import com.techceler.api.organisation.model.DayEnum;
import com.techceler.api.organisation.model.OpeningTime;
import com.techceler.api.organisation.model.Organisation;

@Component 
public class OrganisationService {

	public List<Organisation> findOrganisations(){
		 final Organisation org1 = new Organisation("Pizza Hut","Feltham road","London","United Kingdom");
		 final Organisation org2 = new Organisation("KFC","Queens street","Manchester","United Kingdom");
		 final List<Organisation> orgs = new ArrayList<Organisation>();
		 orgs.add(org1);
		 orgs.add(org2);

		 return orgs;
	}
	
	public Organisation findOrganisationWithBranchesById(final Long id) {
		 final Organisation org1 = new Organisation("Pizza Hut","Feltham road","London","United Kingdom");
		 
		 final Branch branch1 = new Branch();
		 final OpeningTime saturday = new OpeningTime("10:00","17:00",DayEnum.SATURDAY);
		 final OpeningTime sunday = new OpeningTime("11:00","17:00",DayEnum.SUNDAY);
		 final OpeningTime monday = new OpeningTime("09:00","17:00",DayEnum.MONDAY);
		 final OpeningTime tuesday = new OpeningTime("09:00","17:00",DayEnum.TUESDAY);
		 final OpeningTime wednesday = new OpeningTime("09:00","17:00",DayEnum.WEDNESDAY);
		 final OpeningTime thursday = new OpeningTime("09:00","17:00",DayEnum.THURSDAY);
		 final OpeningTime friday = new OpeningTime("09:00","17:00",DayEnum.FRIDAY);
		 
		 final List <OpeningTime> openingTimes = new ArrayList<OpeningTime>();
		 branch1.setOpeningtiming(openingTimes);
		 openingTimes.add(saturday);
		 openingTimes.add(sunday);
		 openingTimes.add(monday);
		 openingTimes.add(tuesday);
		 openingTimes.add(wednesday);
		 openingTimes.add(thursday);
		 openingTimes.add(friday);
		 
		 final Branch branch2 = new Branch();
		 branch2.setOpeningtiming(openingTimes);

		 final List<Branch> branches = new ArrayList<Branch>();
		 branches.add(branch1);
		 branches.add(branch2);
		 
		 org1.setBranches(branches);
		 return org1;
	}
	
}
