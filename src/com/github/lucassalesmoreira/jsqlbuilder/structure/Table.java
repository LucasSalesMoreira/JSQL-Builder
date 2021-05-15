package com.github.lucassalesmoreira.jsqlbuilder.structure;

public class Table {
    private String name;
    private Column columns[];

    public Table(String name) {
        this.name = name;
        this.columns = new Column[0];
    }

    public Table(String name, Column column[]) {
        this.name = name;
        this.columns = column;
    }

    public String getName() {
        return name;
    }

    public Column [] getColumns() {
        return columns;
    }
}