/*
 * Copyright 2019-2019 Elypia CIC
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

package org.elypia.elypiai.osu.data;

import com.google.gson.annotations.SerializedName;

/**
 * @author seth@elypia.org (Syed Shah)
 */
public enum OsuMode {

	@SerializedName("0")
	OSU(0),

	@SerializedName("1")
	TAIKO(1),

	@SerializedName("2")
	CATCH_THE_BEAT(2),

	@SerializedName("3")
	MANIA(3);

	private final int ID;

	OsuMode(int id) {
		ID = id;
	}

	public int getId() {
		return ID;
	}
}

