package org.EzAz.generic.Layer2;
/**
 * Copyright 2012-2013 Felix Gaehtgens
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.io.PrintStream;

import org.EzAz.Layer2.AdviceObligation;
import org.EzAz.Layer2.AdviceObligationSetter;
import org.EzAz.Layer2.AttributeAssignment;
import org.EzAz.Layer2.Identifier;
import org.EzAz.Layer2.abstractSet;

public class genericAdviceObligation implements AdviceObligation, AdviceObligationSetter {

	private abstractSet<AttributeAssignment> attributeAssignments=new abstractSet<AttributeAssignment>();
	Identifier id;
	int hasBeenHandled=0;
	
	@Override
	public abstractSet<AttributeAssignment> getAttributeAssignments() {
		return attributeAssignments;
	}

	@Override
	public Identifier getId() {
		return id;
	}

	@Override
	public int hasBeenHandled() {
		return hasBeenHandled;
	}

	@Override
	public void setHandled(boolean handled) {
		if (hasBeenHandled != 2)
			hasBeenHandled=1;

	}

	@Override
	public void setStopHandling(boolean stophandling) {
		hasBeenHandled=2;

	}
	
	@Override
	public boolean mayNotHandle() {
		if (hasBeenHandled == 2)
			return true;
		else
			return false;
	}

	@Override
	public void setId(Identifier id) {
		this.id=id;
	}

	@Override
	public void setAttributeAssignments(
			abstractSet<AttributeAssignment> attributeAssignments) {
		this.attributeAssignments=attributeAssignments;
	}

	public static void prettyPrint(PrintStream ps, String header, String type, AdviceObligation obl) {
		ps.println(header+type+": "+obl.getId().toString());
		abstractSet<AttributeAssignment> a = obl.getAttributeAssignments();
		for (AttributeAssignment assign: a) {
			genericAttributeAssignment.prettyPrint(ps, header+"  ", assign);
		}
	}
}
