/*
 * Copyright (c) 2006 Stiftung Deutsches Elektronen-Synchroton,
 * Member of the Helmholtz Association, (DESY), HAMBURG, GERMANY.
 *
 * THIS SOFTWARE IS PROVIDED UNDER THIS LICENSE ON AN "../AS IS" BASIS.
 * WITHOUT WARRANTY OF ANY KIND, EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR PARTICULAR PURPOSE AND
 * NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR
 * THE USE OR OTHER DEALINGS IN THE SOFTWARE. SHOULD THE SOFTWARE PROVE DEFECTIVE
 * IN ANY RESPECT, THE USER ASSUMES THE COST OF ANY NECESSARY SERVICING, REPAIR OR
 * CORRECTION. THIS DISCLAIMER OF WARRANTY CONSTITUTES AN ESSENTIAL PART OF THIS LICENSE.
 * NO USE OF ANY SOFTWARE IS AUTHORIZED HEREUNDER EXCEPT UNDER THIS DISCLAIMER.
 * DESY HAS NO OBLIGATION TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS,
 * OR MODIFICATIONS.
 * THE FULL LICENSE SPECIFYING FOR THE SOFTWARE THE REDISTRIBUTION, MODIFICATION,
 * USAGE AND OTHER RIGHTS AND OBLIGATIONS IS INCLUDED WITH THE DISTRIBUTION OF THIS
 * PROJECT IN THE FILE LICENSE.HTML. IF THE LICENSE IS NOT INCLUDED YOU MAY FIND A COPY
 * AT HTTP://WWW.DESY.DE/LEGAL/LICENSE.HTM
 */

package org.csstudio.dal.device;

import java.util.Collection;


/**
 * This collection allows changing group of properties.
 *
 * @author <a href="mailto:igor.kriznar@cosylab.com">Igor Kriznar</a>
 */
public interface MutableDeviceCollection<T extends AbstractDevice>
	extends DeviceCollection<T>, Collection<T>
{
	// Modification Operations

	/**
	 * Removes all <code>TypelessProperty</code> elements from this collection,
	 * whose unique name macthes with the provided name.
	 *
	 * @param name unique name of removed properties
	 *
	 * @return true if collection was modified by this operation
	 */
	boolean remove(String name);

	/**
	 * Adds all of the elements in the specified collection to this set if
	 * they're not already present (optional operation).  If the specified
	 * collection is also a set, the <tt>addAll</tt> operation effectively
	 * modifies this set so that its value is the <i>union</i> of the two
	 * sets.  The behavior of this operation is unspecified if the specified
	 * collection is modified while the operation is in progress.
	 *
	 * @param c collection whose elements are to be added to this set.
	 *
	 * @return <tt>true</tt> if this set changed as a result of the call.
	 *
	 * @see #add(TypelessProperty)
	 */
	boolean addAll(DeviceCollection c);

	/**
	 * Retains only the elements in this set that are contained in the
	 * specified collection (optional operation).  In other words, removes
	 * from this set all of its elements that are not contained in the
	 * specified collection.  If the specified collection is also a set, this
	 * operation effectively modifies this set so that its value is the
	 * <i>intersection</i> of the two sets.
	 *
	 * @param c collection that defines which elements this set will retain.
	 *
	 * @return <tt>true</tt> if this collection changed as a result of the
	 *         call.
	 *
	 * @see #remove(Object)
	 */
	boolean retainAll(DeviceCollection c);

	/**
	 * Removes from this set all of its elements that are contained in the
	 * specified collection (optional operation).  If the specified collection
	 * is also a set, this operation effectively modifies this set so that its
	 * value is the <i>asymmetric set difference</i> of the two sets.
	 *
	 * @param c collection that defines which elements will be removed from
	 *        this set.
	 *
	 * @return <tt>true</tt> if this set changed as a result of the call.
	 *
	 * @see #remove(TypelessProperty)
	 */
	boolean removeAll(DeviceCollection c);

	/**
	 * Removes all of the elements from this set. This set will be empty after
	 * this call returns (unless it throws an exception).
	 */
	void clear();
}

/* __oOo__ */
