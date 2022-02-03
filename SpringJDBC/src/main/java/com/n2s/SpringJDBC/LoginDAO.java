package com.n2s.SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class LoginDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insertUser(LoginBean lb){
		String querry = "insert into Login values('"+ lb.getId() + "', '"+ lb.getUsername() + "' , '"+ lb.getPassword() + "' )";
		return jdbcTemplate.update(querry);
	}
	
	public int updateUser(LoginBean lb){
		String querry = "update Login set username = '"+ lb.getUsername() + "', password = '"+ lb.getPassword() + "' where id = '"+ lb.getId() + "'" ;
		return jdbcTemplate.update(querry);
	}

	public int deleteUser(LoginBean lb){
		String querry = "delete from Login where id = '"+ lb.getId() + "'";
		return jdbcTemplate.update(querry);
	}

    //method to return single data
    public LoginBean getById(int id){  
        
        String query = "select * from login where Id=?";        
        
        return jdbcTemplate.queryForObject(query, new RowMapper<LoginBean>() {
            public LoginBean mapRow(ResultSet rs, int rowNum) throws SQLException {
                LoginBean lb = new LoginBean(); 
                
                lb.setUsername(rs.getString("Username"));
                lb.setPassword(rs.getString("Password"));
                return lb;
            }
        }, id);
    } 
   
    //method to return all data
    public List<LoginBean> getUsers(){  
        List<LoginBean> list=new ArrayList<LoginBean>();  
        
        String query="select * from login";
        
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);
        
        for (Map<String, Object> row : rows) {
        
            LoginBean lb = new LoginBean();
            lb.setId((Integer)row.get("Id"));
            lb.setUsername((String)row.get("Username"));
            lb.setPassword((String)row.get("Password"));
            
            list.add(lb);
        }
        
        return list;  
    } 
}
