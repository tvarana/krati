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

package krati.core.segment;

/**
 * SegmentModeEvent
 * 
 * @author jwu
 * @since 09/05, 2012
 */
public class SegmentModeEvent {
    private final Segment _segment;
    
    /**
     * Creates a new SegmentModeEvent.
     * 
     * @param segment
     */
    public SegmentModeEvent(Segment segment) {
        this._segment = segment;
    }
    
    /**
     * @return the segment.
     */
    public final Segment getSegment() {
        return _segment;
    }
    
    /**
     * @return the segment mode.
     */
    public final Segment.Mode getSegmentMode() {
        return _segment.getMode();
    }
}
