package com.github.lucassalesmoreira.jsqlbuilder.test;

import com.github.lucassalesmoreira.jsqlbuilder.base.Query;
import com.github.lucassalesmoreira.jsqlbuilder.structure.Column;
import com.github.lucassalesmoreira.jsqlbuilder.structure.Table;

/**
*   Teste de utilização da lib
**/

public class Test_1 {
    public static void main(String[] args) {

        Query query1 = Query.find(new Table("user"));
        System.out.println(query1);

        Query query2 = Query.find(new Table("user", new Column[] { new Column("login"), new Column("senha") }));
        System.out.println(query2);

    }
}
