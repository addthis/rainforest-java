/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        for (final Column column : generator.getData()) {
            if (columnName.equals(column.getName())) {
                return column.getId();
            }
        }
        return null;
    }
}
