package com.jci.service;

import com.jci.MyRestaurant.Categories;
import com.jci.dao.CategoryDao;
import com.jci.intf.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    public CategoryDao CategoryDao;

    @Override
    public List<Categories> getallcategory(int id) {
        return CategoryDao.getAllcategory(id);
    }
}
