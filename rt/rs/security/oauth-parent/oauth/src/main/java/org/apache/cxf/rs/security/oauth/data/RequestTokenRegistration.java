/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.rs.security.oauth.data;

import java.util.List;

public class RequestTokenRegistration {
    private Client client; 
    private String state;
    private List<String> scopes;
    private List<String> permissions;
    private long lifetime;
    
    public void setClient(Client client) {
        this.client = client;
    }
    public Client getClient() {
        return client;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }
    public List<String> getScopes() {
        return scopes;
    }
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }
    public List<String> getPermissions() {
        return permissions;
    }
    public void setLifetime(long lifetime) {
        this.lifetime = lifetime;
    }
    public long getLifetime() {
        return lifetime;
    }
}
