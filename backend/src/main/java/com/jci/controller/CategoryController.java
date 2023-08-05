package com.jci.controller;

import com.jci.intf.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.jci.MyRestaurant.Categories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    ICategoryService CategoryService;

    @GetMapping("/category/{id}")
    public List<Categories> DisplayCategory(@PathVariable int id) {
        return CategoryService.getallcategory(id);
    }


}
