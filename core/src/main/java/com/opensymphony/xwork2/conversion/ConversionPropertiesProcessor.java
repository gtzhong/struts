/*
 * Copyright 2002-2006,2009 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.opensymphony.xwork2.conversion;

import com.opensymphony.xwork2.inject.Initializable;

/**
 * Used to read converters from Properties file
 */
public interface ConversionPropertiesProcessor extends Initializable {

    /**
     * Process given property to load converters as not required (Properties file doesn't have to exist)
     *
     * @param propsName Properties file name
     */
    void process(String propsName);

    /**
     * Process given property to load converters as required (Properties file must exist)
     *
     * @param propsName Properties file name
     */
    void processRequired(String propsName);

}
