/*
 * Copyright 2019-2020 Elypia CIC
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

package org.elypia.elypiai.companieshouse.models;

import com.google.gson.annotations.SerializedName;

/**
 * Company origin informations.
 *
 * @author seth@elypia.org (Seth Falco)
 * @since 4.2.2
 */
public class OriginatingRegistry {

    /**
     * @see #getCountry()
     */
    @SerializedName("country")
    private String country;

    /**
     * @see #getName()
     */
    @SerializedName("name")
    private String name;

    /**
     * @return Country in which company was incorporated.
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return Identity of register in country of incorporation.
     */
    public String getName() {
        return name;
    }
}
