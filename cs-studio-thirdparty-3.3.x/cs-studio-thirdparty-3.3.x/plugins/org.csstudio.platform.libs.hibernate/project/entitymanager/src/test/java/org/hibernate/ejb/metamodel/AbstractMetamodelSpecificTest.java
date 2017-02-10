/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2010, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.ejb.metamodel;

import org.hibernate.ejb.test.TestCase;

/**
 * TODO : javadoc
 *
 * @author Steve Ebersole
 */
public abstract class AbstractMetamodelSpecificTest extends TestCase {
	@Override
	public Class[] getAnnotatedClasses() {
		return new Class[] {
				Address.class, Alias.class, Country.class, CreditCard.class, Customer.class,
				Info.class, LineItem.class, Order.class, Phone.class, Product.class,
				ShelfLife.class, Spouse.class
		};
	}
}
