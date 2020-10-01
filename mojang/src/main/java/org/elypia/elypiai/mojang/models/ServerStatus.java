/*
 * Copyright 2019-2020 Elypia CIC and Contributors (https://gitlab.com/Elypia/elypiai/-/graphs/master)
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

package org.elypia.elypiai.mojang.models;

import com.google.gson.annotations.SerializedName;

import java.awt.Color;

/**
 * @author seth@elypia.org (Seth Falco)
 * @since 4.3.0
 */
public enum ServerStatus {

    /**
     * No known issues.
     */
    @SerializedName("green")
    GREEN("Green", Color.GREEN),

    /**
     * Some known issues.
     */
    @SerializedName("yellow")
    YELLOW("Yellow", Color.YELLOW),

    /**
     * Service not available whatsoever.
     */
    @SerializedName("red")
    RED("Red", Color.RED);

    private final String friendlyName;
    private final Color color;

    ServerStatus(final String friendlyName, final Color color) {
        this.friendlyName = friendlyName;
        this.color = color;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public Color getColor() {
        return color;
    }
}
