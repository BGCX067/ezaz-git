package org.EzAz.AdviceObligationHandlers;
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
import org.EzAz.Layer2.Identifier;
import org.EzAz.Layer2.abstractSet;

/**
 * @author felix
 * @version 1.0
 * @created 12-Dec-2012 22:54:48
 */
public interface AdviceObligationHandlerRegistry {

	/**
	 * Adds a handler to the Registry.
	 * 
	 * @param id    The identifier that the Handler is responsible for.
	 * @param handler    The Advice/Obligation Handler.
	 */
	public void addHandler(Identifier id, AdviceObligationHandler handler);

	/**
	 * Adds a handler to the Registry.
	 * 
	 * @param registryEntry    Both the Advice/Obligation Handler and the Identifier
	 * that the Handler is responsible for in a HandlerRegistryEntry object.
	 */
	public void addHandler(AdviceObligationHandlerRegistryEntry registryEntry);

	/**
	 * Return the current handlers, as a list of HandlerRegistryEntry objects.
	 */
	public abstractSet<AdviceObligationHandlerRegistryEntry> getHandlers();

}