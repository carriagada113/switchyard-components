/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2012 Red Hat Inc. and/or its affiliates and other contributors
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
 
package org.switchyard.component.http.composer;

import java.util.Collections;
import java.util.Set;

import org.switchyard.component.common.composer.SecurityBindingData;
import org.switchyard.security.credential.Credential;

/**
 * HTTP request binding data.
 *
 * @author Magesh Kumar B <mageshbk@jboss.com> &copy; 2012 Red Hat Inc.
 */
public class HttpRequestBindingData extends HttpBindingData implements SecurityBindingData {
    private HttpRequestInfo _requestInfo;

    /**
     * @return the requestInfo
     */
    public HttpRequestInfo getRequestInfo() {
        return _requestInfo;
    }

    /**
     * @param requestInfo the requestInfo to set
     */
    public void setRequestInfo(HttpRequestInfo requestInfo) {
        _requestInfo = requestInfo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<Credential> extractCredentials() {
        return _requestInfo != null ? _requestInfo.getCredentials() : Collections.<Credential>emptySet();
    }

}
