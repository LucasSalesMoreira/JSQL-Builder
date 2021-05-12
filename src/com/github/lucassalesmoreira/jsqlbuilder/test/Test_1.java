package com.github.lucassalesmoreira.jsqlbuilder.test;

import com.github.lucassalesmoreira.jsqlbuilder.base.Query;
import com.github.lucassalesmoreira.jsqlbuilder.conn.Connection;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

/**
*   Teste de utilização da lib
**/
public class Test_1 {
    public static void main(String[] args) {
        Connection conn = new Connection('mysql', 'bd_test');
        Query query = Query.find();
    }
}
