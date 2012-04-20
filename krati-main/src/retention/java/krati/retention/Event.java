/*
 * Copyright (c) 2010-2012 LinkedIn, Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package krati.retention;

import java.io.Serializable;

import krati.retention.clock.Clock;

/**
 * Event
 * 
 * @version 0.4.2
 * @author jwu
 * 
 * <p>
 * 07/28, 2011 - Created
 */
public interface Event<T> extends Serializable {
    
    /**
     * Gets the value of this Event.
     */
    public T getValue();
    
    /**
     * Gets the clock of this Event.
     */
    public Clock getClock();
}
