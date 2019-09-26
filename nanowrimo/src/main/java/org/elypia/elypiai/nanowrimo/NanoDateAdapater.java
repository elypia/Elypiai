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

package org.elypia.elypiai.nanowrimo;

import org.elypia.elypiai.common.jaxb.adapters.DateAdapter;

/**
 * @author seth@elypia.org (Syed Shah)
 */
public class NanoDateAdapater extends DateAdapter {

    public NanoDateAdapater() {
        super("yyyy-MM-dd");
    }
}
