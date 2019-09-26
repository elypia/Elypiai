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

package org.elypia.elypiai.cleverbot.impl;

import org.elypia.elypiai.cleverbot.CleverResponse;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * @author seth@elypia.org (Syed Shah)
 */
public interface CleverbotService {

    @GET("getreply")
    Call<CleverResponse> say(
        @Query("input") String input,
        @Query("cs") String cs,
        @Query("cb_settings_tweak1") Integer tweakOne,
        @Query("cb_settings_tweak2") Integer tweakTwo,
        @Query("cb_settings_tweak3") Integer tweakThree
    );
}
