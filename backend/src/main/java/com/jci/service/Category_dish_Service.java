package com.jci.service;

import com.jci.MyRestaurant.Category_Dish;
import com.jci.dao.Category_dishDao;
import com.jci.intf.ICatDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Category_dish_Service implements ICatDishService {

    @Autowired
    public Category_dishDao cdDao;

    public int addRelation(Category_Dish cd){
        System.out.println("in add relation dao class");
        return cdDao.createCategory_Dish(cd);
    }
}
