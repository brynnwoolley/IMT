/* *********************************************************************** *
 * project: org.matsim.*
 * AgentArrivalEvent.java
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2007, 2008 by the members listed in the COPYING,  *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */

package byu.imt.event_Handlers;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.events.Event;
import org.matsim.api.core.v01.network.Link;
import org.matsim.api.core.v01.population.Person;
import org.matsim.core.api.internal.HasPersonId;
import org.matsim.vehicles.Vehicle;

import java.util.Map;

public class TaxiArrivalEvent extends Event implements HasPersonId {

	public static final String EVENT_TYPE = "arrival";

	public static final String ATTRIBUTE_TAXI = "taxi";
	public static final String ATTRIBUTE_PERSON = "person";
	public static final String ATTRIBUTE_LINK = "link";
	public static final String ATTRIBUTE_LEGMODE = "legMode";

	private final Id<Vehicle> taxiId;
	private final Id<Person> personId;
	private final Id<Link> linkId;
	private final String legMode;


	public TaxiArrivalEvent(final double time, final Id<Vehicle> taxiId, final Id<Person> agentId, final Id<Link> linkId, final String legMode) {
		super(time);
		this.taxiId = taxiId;
		this.linkId = linkId;
		this.legMode = legMode;
		this.personId = agentId;
	}

	public Id<Vehicle> getVehicleId() {
		return this.taxiId;
	}

	public Id<Person> getPersonId() {
		return this.personId;
	}

	public Id<Link> getLinkId() {
		return this.linkId;
	}

	public String getLegMode() {
		return this.legMode;
	}

	public String getEventType() {
		return EVENT_TYPE;
	}

	@Override
	public Map<String, String> getAttributes() {
		Map<String, String> attr = super.getAttributes();
		attr.put(ATTRIBUTE_TAXI, this.taxiId.toString());
		attr.put(ATTRIBUTE_PERSON, this.personId.toString());
		attr.put(ATTRIBUTE_LINK, (this.linkId == null ? null : this.linkId.toString()));
		if (this.legMode != null) {
			attr.put(ATTRIBUTE_LEGMODE, this.legMode);
		}
		return attr;
	}
}
