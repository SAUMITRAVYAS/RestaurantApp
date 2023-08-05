package com.jci.intf;

import java.util.List;
import java.util.Optional;

import com.jci.MyRestaurant.*;


public interface IMenuService {
	List<Menu> FindMenu();
	Optional<Menu>FindMenuById(int id);
	int CreateMenu(Menu newmenu);
    int UpdateMenu(Menu m,int id);

}
