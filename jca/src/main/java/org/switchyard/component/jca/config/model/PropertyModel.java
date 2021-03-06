/*
 * JBoss, Home of Professional Open Source Copyright 2009, Red Hat Middleware
 * LLC, and individual contributors by the @authors tag. See the copyright.txt
 * in the distribution for a full listing of individual contributors.
 * 
 * This is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This software is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this software; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA, or see the FSF
 * site: http://www.fsf.org.
 */
package org.switchyard.component.jca.config.model;

import org.switchyard.config.model.Model;
/**
 * sca property model.
 * 
 * @author <a href="mailto:tm.igarashi@gmail.com">Tomohisa Igarashi</a>
 *
 */
public interface PropertyModel extends Model {
    
    /**
     * get property name.
     * 
     * @return name
     */
    String getName();
    
    /**
     * set property name.
     * 
     * @param name name to set
     * @return {@link PropertyModel} to support method chaining
     */
    PropertyModel setName(String name);
    
    /**
     * get property value.
     * 
     * @return value
     */
    String getValue();
    
    /**
     * set property value.
     * 
     * @param value value to set
     * @return {@link PropertyModel} to support method chaining
     */
    PropertyModel setValue(String value);
}
