package com.github.lucassalesmoreira.jsqlbuilder.base;

import com.github.lucassalesmoreira.jsqlbuilder.structure.Column;
import com.github.lucassalesmoreira.jsqlbuilder.structure.Table;

public class Query {

    private String sql;

    private Query(String sql) {
        this.sql = sql;
    }

    private static String buildSelect(Table table) {
        String sqlSelect = "SELECT ";
        Column columns[] = table.getColumns();

        for (int i = 0; i < table.getColumns().length; i++) {
            if (i == table.getColumns().length - 1) sqlSelect += columns[i].getName();
            else sqlSelect += columns[i].getName() + ", ";
        }

        return sqlSelect + " FROM " + table.getName();
    }

    public static Query find(Table table) {
        return table.getColumns().length == 0 ? new Query("SELECT * FROM " + table.getName()) : new Query(buildSelect(table));
    }

    @Override
    public String toString() {
        return sql;
    }
}
