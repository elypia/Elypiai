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

package org.elypia.elypiai.common.core;

import java.util.*;
import java.util.function.Consumer;

/**
 * @param <T>
 * @author seth@elypia.org (Syed Shah)
 */
public interface RestIterable<T> {

    void queue(Consumer<List<Optional<T>>> success, Consumer<Throwable> ex);
    void cancel();

    default void queue() {
        queue(null);
    }

    default void queue(Consumer<List<Optional<T>>> success) {
        queue(success, RestInterface.DEFAULT_FAILURE);
    }
}
