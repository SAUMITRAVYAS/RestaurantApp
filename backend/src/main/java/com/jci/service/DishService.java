package com.jci.service;

import com.jci.MyRestaurant.Dishes;
import com.jci.dao.DishDao;
import com.jci.intf.IDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService implements IDishService {

    @Autowired
    public DishDao dishDao;

    @Override
    public List<Dishes> getallDishes(int id) {
        System.out.println("in serv");
        return dishDao.getDishByCid(id);
    }

    public int createDish(Dishes dish){
        return dishDao.createDish(dish);
    }

    public int updateDish(Dishes d,int id) {
        return dishDao.updateDish(d,id);
    }

    public void deletedish(int id){
         dishDao.delete(id);
    }
}
