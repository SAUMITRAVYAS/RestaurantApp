package com.jci.controller;

import com.jci.MyRestaurant.Category_Dish;
import com.jci.MyRestaurant.Dishes;
import com.jci.intf.ICatDishService;
import com.jci.intf.IDishService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class DishController {
	
	@Autowired
    IDishService dishService;
    @Autowired
    ICatDishService cdService;

    @GetMapping("/dish/{id}")
    public List<Dishes> DisplayDishes(@PathVariable int id){
        System.out.println("in cont");
        return dishService.getallDishes(id);
    }
    @PostMapping("/{categoryID}/dish")
    public int Create(@RequestBody Dishes dish, @PathVariable("categoryID") int catId){
        // to create a row in the dishcategory table using its service file
        Category_Dish cd= new Category_Dish();
        int id = dishService.createDish(dish);
        if(id == -1){
            return id;
        }
        cd.setDishId(id);
        cd.setCategoryId(catId);
        System.out.println(cd);
//      cdService.addRelation(cd)
        return cdService.addRelation(cd);
    }
    @PutMapping("/dish/{id}")
    public int update(@RequestBody Dishes dish, @PathVariable int id){ return dishService.updateDish(dish,id);}

    @DeleteMapping("/dish/{id}")
    public @ResponseBody Map<String, Object> delete(@PathVariable int id){dishService.deletedish(id);
            return new JSONObject().put("msg", "Deleted dish: " +id).toMap(); }

}
