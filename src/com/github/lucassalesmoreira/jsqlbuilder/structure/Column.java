package com.github.lucassalesmoreira.jsqlbuilder.structure;

public class Column {
    private String name;
    private Tuple tuples[];

    public Column(String name, Tuple[] tuples) {
        this.name = name;
        this.tuples = tuples;
    }
    public Column(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Tuple[] getTuples() {
        return tuples;
    }
}
