/* *********************************************************************** *
 * project: org.matsim.*
 * AgentDepartureEvent.java
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

package byu.imt.event_Handlers.customEvents;

import org.matsim.api.core.v01.Id;
import org.matsim.api.core.v01.network.Link;
import org.matsim.api.core.v01.population.Person;
import org.matsim.core.api.internal.HasPersonId;

import java.util.Map;

public class CustomPersonDepartureEvent extends CustomEvent implements HasPersonId {

	public static final String EVENT_TYPE = "departure";

	public static final String ATTRIBUTE_PERSON = "person";
	public static final String ATTRIBUTE_LINK = "link";
	public static final String ATTRIBUTE_LEGMODE = "legMode";
	public static final String ATTRIBUTE_ROUTING_MODE = "computationalRoutingMode";
	public static final String ATTRIBUTE_DVRP_VEHICLE = "dvrpVehicle";

	private final Id<Person> personId;
	private final Id<Link> linkId;
	private final String legMode;
	private final String routingMode;
	private final String dvrpId;

	public CustomPersonDepartureEvent(final double time, final Id<Person> agentId, final Id<Link> linkId, final String legMode, final String routingMode, final String dvrpId) {
		super(time);
		this.linkId = linkId;
		this.legMode = legMode;
		this.personId = agentId;
		this.routingMode = routingMode;
		this.dvrpId = dvrpId;
	}

	@Override
	public Id<Person> getPersonId() {
		return this.personId;
	}

	public Id<Link> getLinkId() {
		return this.linkId;
	}

	public String getLegMode() {
		return this.legMode;
	}

	public String getRoutingMode() {
		return routingMode;
	}

	public String getDvrpId() { return this.dvrpId; }

	@Override
	public String getEventType() {
		return EVENT_TYPE;
	}

	@Override
	public Map<String, String> getAttributes() {
		Map<String, String> attr = super.getAttributes();
		attr.put(ATTRIBUTE_PERSON, this.personId.toString());
		attr.put(ATTRIBUTE_LINK, (this.linkId == null ? null : this.linkId.toString()));
		if (this.dvrpId != null) {
			attr.put(ATTRIBUTE_DVRP_VEHICLE, this.dvrpId);
		}
		if (this.legMode != null) {
			attr.put(ATTRIBUTE_LEGMODE, this.legMode);
		}
		if (this.routingMode != null) {
			attr.put(ATTRIBUTE_ROUTING_MODE, this.routingMode);
		}
		return attr;
	}
}
