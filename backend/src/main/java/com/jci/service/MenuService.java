package com.jci.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jci.dao.*;
import com.jci.intf.*;
import com.jci.MyRestaurant.*;

@Service
public class MenuService implements IMenuService {
	
	@Autowired
	public Menudao menudao;

	@Override
	public List<Menu> FindMenu() {
		// TODO Auto-generated method stub
		return menudao.getAllMenus();
	}
	@Override
	public Optional<Menu> FindMenuById(int id) {
		// TODO Auto-generated method stub
		return menudao.findbyId(id);
	}
	@Override
	public int CreateMenu(Menu newmenu) {
		// TODO Auto-generated method stub
		return menudao.saveMenu(newmenu);
	}
	@Override
	public int UpdateMenu(Menu m, int id) {
		// TODO Auto-generated method stub
		return menudao.updateMenu(m, id);
	}
}

