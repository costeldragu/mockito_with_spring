package com.mdc.database;

import com.mdc.database.model.PhoneEntry;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PhoneBookTest {
    public static void main(String[] args) {
        MySqlConnector db = new MySqlConnector();
        try {
            Integer rowCount;
            rowCount = db.getJdbcTemplate().queryForObject("SELECT COUNT(*) from phone_book", Integer.class);

            PhoneEntry phoneEntry;
            phoneEntry = db.getJdbcTemplate().queryForObject("SELECT * from phone_book where pbid=1", new RowMapper<PhoneEntry>() {
                @Override
                public PhoneEntry mapRow(ResultSet resultSet, int i) throws SQLException {
                    PhoneEntry phoneEntry = new PhoneEntry();
                    phoneEntry.setName(resultSet.getString("name"));
                    phoneEntry.setPhone(resultSet.getString("phone"));
                    return phoneEntry;
                }
            });

            System.out.println(phoneEntry);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
