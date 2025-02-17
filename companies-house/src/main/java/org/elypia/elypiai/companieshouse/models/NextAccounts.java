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

package org.elypia.elypiai.companieshouse.models;

import java.time.LocalDate;

/**
 * The next company accounts filed.
 *
 * @author seth@elypia.org (Seth Falco)
 * @since 4.2.2
 */
public class NextAccounts extends AccountingPeriod {

    /**
     * @see #getDueDate()
     */
    private LocalDate dueDate;

    /**
     * @see #isOverdue()
     */
    private boolean isOverdue;

    /**
     * @return The date the next company accounts are due.
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * @return Flag indicating if the company accounts are overdue.
     */
    public boolean isOverdue() {
        return isOverdue;
    }
}
