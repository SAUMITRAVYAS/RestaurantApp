package com.jci.dao;

import java.util.List;
import java.util.Optional;
import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jci.MyRestaurant.Menu;

@Repository
public class Menudao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	private org.springframework.jdbc.core.RowMapper<Menu> rowMapper = (ResultSet rs, int rowNum) -> {
	Menu menu = new Menu();
	menu.setMenuId(rs.getInt(1));
	menu.setMenuName(rs.getString(2));
	menu.setMenuDesc(rs.getString(3));
	menu.setMenuImage(rs.getString(4));
	return menu;
};

public List<Menu> getAllMenus() {
	return jdbcTemplate.query("SELECT * FROM menu", rowMapper);
//	return jdbcTemplate.query("SELECT * FROM menu", new BeanPropertyRowMapper<Menu>(Menu.class));
}

public Optional<Menu> findbyId(int id) {
	String sql = "SELECT * FROM menu WHERE id='" + id + "' ";
	return jdbcTemplate.query(sql, rowMapper).stream().findFirst();
}
//
public int saveMenu(Menu menu) {
	String query = "insert into menu values( '" + menu.getMenuId() + "','" + menu.getMenuName() + "','"
			+ menu.getMenuDesc() + "','" + menu.getMenuImage() + "')";
	return jdbcTemplate.update(query);
}
public int updateMenu(Menu pm, int id) {
	return jdbcTemplate.update("update menu set name='" + pm.getMenuName() + "', description='"
			+ pm.getMenuDesc() + "', image='" + pm.getMenuImage() + "' where id='" + id + "';");
}
}
