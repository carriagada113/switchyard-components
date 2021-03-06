/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2013 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.switchyard.component.soap.config.model;

import org.switchyard.config.model.NamedModel;
import org.switchyard.config.model.property.PropertiesModel;

/**
 * A Interceptor Model.
 *
 * @author David Ward &lt;<a href="mailto:dward@jboss.org">dward@jboss.org</a>&gt; &copy; 2013 Red Hat Inc.
 */
public interface InterceptorModel extends NamedModel {

    /**
     * The interceptor XML element.
     */
    public static final String INTERCEPTOR = "interceptor";

    /**
     * Gets the Interceptor class.
     * @param loader the ClassLoader to use
     * @return the Interceptor class
     */
    public Class<?> getClazz(ClassLoader loader);

    /**
     * Sets the Interceptor class.
     * @param clazz the Interceptor class
     * @return this InterceptorModel (useful for chaining)
     */
    public InterceptorModel setClazz(Class<?> clazz);

    /**
     * Gets the child properties model.
     * @return the child properties model
     */
    public PropertiesModel getProperties();

    /**
     * Sets the child properties model.
     * @param properties the child properties model
     * @return this InterceptorModel (useful for chaining)
     */
    public InterceptorModel setProperties(PropertiesModel properties);

}
