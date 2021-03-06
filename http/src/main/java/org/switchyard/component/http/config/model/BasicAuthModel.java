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
package org.switchyard.component.http.config.model;

import org.switchyard.config.model.Model;

/**
 * A Basic Authentication Model.
 *
 * @author Magesh Kumar B <mageshbk@jboss.com> (C) 2013 Red Hat Inc.
 */
public interface BasicAuthModel extends Model {

    /**
     * Get user name.
     * @return authentication username
     */
    public String getUser();

    /**
     * Set user name.
     * @param user the user name
     * @return this BasicAuthModel
     */
    public BasicAuthModel setUser(String user);

    /**
     * Get user password.
     * @return authentication password
     */
    public String getPassword();

    /**
     * Set user password.
     * @param password the user password
     * @return this BasicAuthModel
     */
    public BasicAuthModel setPassword(String password);

    /**
     * Get authentication realm.
     * @return authentication realm
     */
    public String getRealm();

    /**
     * Set authentication realm.
     * @param realm the authentication realm
     * @return this BasicAuthModel
     */
    public BasicAuthModel setRealm(String realm);

    /**
     * Get host.
     * @return authentication host
     */
    public String getHost();

    /**
     * Set host.
     * @param host the authentication host
     * @return this BasicAuthModel
     */
    public BasicAuthModel setHost(String host);

    /**
     * Get authentication port.
     * @return authentication port
     */
    public String getPort();

    /**
     * Set authentication port.
     * @param port the authentication port
     * @return this BasicAuthModel
     */
    public BasicAuthModel setPort(String port);

}
