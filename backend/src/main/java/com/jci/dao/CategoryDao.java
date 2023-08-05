package com.jci.dao;

import com.jci.MyRestaurant.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;
@Repository
public class CategoryDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private org.springframework.jdbc.core.RowMapper<Categories> rowMapper = (ResultSet rs, int rowNum) -> {
        Categories category = new Categories();
        category.setCategoryId(rs.getInt(1));
        category.setCategoryName(rs.getString(2));
        category.setCategoryDesc(rs.getString(3));
        category.setCategoryImage(rs.getString(4));
        return category;
    };

    public List<Categories> getAllcategory(int id) {
        return jdbcTemplate.query("SELECT * FROM category c join menu_category mc on c.id=mc.category_id where menu_id= '"+id+"' order by display_order", rowMapper);
    }

}
