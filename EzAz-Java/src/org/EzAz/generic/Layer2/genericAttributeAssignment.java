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

import org.EzAz.Layer2.Attribute;
import org.EzAz.Layer2.AttributeAssignment;
import org.EzAz.Layer2.Identifier;

public class genericAttributeAssignment implements AttributeAssignment {

	Attribute attribute;
	Identifier category;

	@Override
	public Attribute getAttribute() {
		return attribute;
	}

	@Override
	public Identifier getCategory() {
		return category;
	}

	@Override
	public void setAttribute(Attribute attribute) {
		this.attribute=attribute;

	}

	@Override
	public void setCategory(Identifier category) {
		this.category=category;
	}

	public static void prettyPrint(PrintStream ps, String header, AttributeAssignment assign) {
		ps.println(header+"ATTRIBUTEASSIGNMENT: Category="+(assign.getCategory() != null ? assign.getCategory().toString() : ""));
		Attribute attr = assign.getAttribute();
		genericAttribute.prettyPrint(ps, header+"  ", attr);
	}

}
