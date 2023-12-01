package com.db.shop.api;

import java.util.TimeZone;

/**
 * db
 *
 */
public class ApiConsoleApplication {
    public static void main( String[] args ) {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        System.out.println( "Hello World!" );
    }
}
