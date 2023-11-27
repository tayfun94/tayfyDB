package ro.tayfy.tayfydb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UsersDAO {
    private static final String SQL_INSERT_PERSON = "INSERT into users(username, password) values(?,?)";
    JdbcTemplate jdbcTemplate;

    @Autowired
    public UsersDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public boolean createPerson(String username, String password) {
        return jdbcTemplate.update(SQL_INSERT_PERSON, username, password) > 0;
    }
}
