package com.jci.dao;

import com.jci.MyRestaurant.Categories;
import com.jci.MyRestaurant.Category_Dish;
import com.jci.MyRestaurant.Dishes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class DishDao {

    @Autowired
    JdbcTemplate jdbctemplate;

    private org.springframework.jdbc.core.RowMapper<Dishes> rowMapper = (ResultSet rs,int rowNum)->{
        Dishes dish = new Dishes();
        dish.setDishId(rs.getInt(1));
        dish.setDishName(rs.getString(2));
        dish.setDishDescription(rs.getString(3));
        dish.setDishPrice(rs.getString(4));
        dish.setDishImage(rs.getByte(5));
        dish.setNature(rs.getString(6));

        return dish;
    };
    public List<Dishes> getDishByCid(int id){
        System.out.println("in dao");
        return jdbctemplate.query(" SELECT * FROM dish d join category_dish cd on d.id=cd.dish_id where category_id='"+id+"' and isDeleted=0", rowMapper);
    }

    public int createDish(Dishes dish) {
        String query = "insert into dish (name, description, price, image, nature, isDeleted) values( '" + dish.getDishName() + "','"+ dish.getDishDescription() +
               "','" + dish.getDishPrice() + "','" + dish.getDishImage() + "','"+dish.getNature()+ "','" + dish.getIsDeleted() +"')";
        jdbctemplate.update(query);
            try{
               return jdbctemplate.queryForObject("select max(id) from dish", Integer.class);
            }
            catch (NullPointerException exp){
                System.out.println(exp.getMessage());
            }
            return -1;
    }
    public int updateDish(Dishes pm, int id) {
        return jdbctemplate.update("update dish set name='" + pm.getDishName() + "', description='"
                + pm.getDishDescription() + "', image='" + pm.getDishImage() + "',price='" + pm.getDishPrice() +"',nature='" + pm.getNature() + "'  where id='" + id + "' and isDeleted=0;");
    }
    public void delete(int id){
         jdbctemplate.update("update dish set isDeleted=1 where id="+id);
    }
}
