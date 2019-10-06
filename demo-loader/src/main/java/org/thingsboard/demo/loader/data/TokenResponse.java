/**
 * Copyright © 2016 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.thingsboard.demo.loader.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@ToString
public class TokenResponse {
	private String _token;
	private String _refreshToken;
	
    //@Getter @Setter private String token;
    //@Getter @Setter private String refreshToken;

    
    public void setToken(String token) {
    	_token = token;
    }
    
    
    public String  getToken() {
    	return _token;
    }
    
    
  
    public void setRefreshToken(String refreshToken) {
    	_refreshToken = refreshToken;
    }
    
   
    public TokenResponse() {
        super();
    }

}
