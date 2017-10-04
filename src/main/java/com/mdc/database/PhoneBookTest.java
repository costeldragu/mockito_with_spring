package com.mdc.database;

public class PhoneBookTest {
    public static void main(String[] args) {
        MySqlConnector db = new MySqlConnector();
        try {
            Integer rowCount;
            rowCount = db.getJdbcTemplate().queryForObject("SELECT COUNT(*) from phone_book", Integer.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
