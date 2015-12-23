/*
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
package com.addthis.rainforest.api.model.util;

import com.addthis.rainforest.api.model.Column;
import com.addthis.rainforest.api.model.Generator;

/**
 * Helper methods for dealing with {@link Generator}s.
 */
public class GeneratorUtil {
    
    /**
     * Find the column id by name for a column in a generator.
     * @param generator that holds the columns
     * @param columnName to find
     * @return the id if found, null if not
     */
    public static Long findColumnId(final Generator generator, final String columnName) {
        for (final Column column : generator.getColumns()) {
            if (columnName.equals(column.getName())) {
                return column.getId();
            }
        }
        return null;
    }
}
