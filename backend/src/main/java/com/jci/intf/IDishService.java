package com.jci.intf;
import com.jci.MyRestaurant.Dishes;
import java.util.List;
public interface IDishService {

    List<Dishes> getallDishes(int id);

    int createDish (Dishes dish);
    int updateDish(Dishes d,int id);
    void deletedish(int id);
}
