package com.jci.dao;

import com.jci.MyRestaurant.Category_Dish;
import com.jci.MyRestaurant.Dishes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;

@Repository
public class Category_dishDao {

    @Autowired
    JdbcTemplate jdbctemplate;

    private org.springframework.jdbc.core.RowMapper<Category_Dish> rowMapper = (ResultSet rs, int rowNum)-> {
        Category_Dish cd = new Category_Dish();
        cd.setCategoryId(rs.getInt(1));
        cd.setDishId(rs.getInt(2));
        return cd;
    };
    public int createCategory_Dish(Category_Dish cd) {
        String query = "insert into category_dish values( '" + cd.getCategoryId() + "','" + cd.getDishId() + "')";
        return jdbctemplate.update(query);}
}
