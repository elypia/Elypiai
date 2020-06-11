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

package org.elypia.elypiai.steam.data;

import com.google.gson.annotations.SerializedName;

/**
 * Represents if a profile is visible or not and why.
 *
 * @author seth@elypia.org (Seth Falco)
 * @since 3.0.0
 */
public enum CommunityVisibilityState {

    @SerializedName("1")
    NOT_PUBLIC,

    @SerializedName("3")
    PUBLIC
}
