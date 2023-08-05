package com.jci.intf;

import com.jci.MyRestaurant.Categories;

import java.util.List;


public interface ICategoryService {
    List<Categories> getallcategory(int id);

}
