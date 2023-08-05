package com.jci.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jci.MyRestaurant.*;
import com.jci.intf.*;

//@RequestMapping("/api")
@RestController
public class MenuController {
	@Autowired
	IMenuService MenuService;
	@CrossOrigin("*")
	@GetMapping("/menu")
	public List<Menu> DisplayMenu() {
		return MenuService.FindMenu();
	}
	@GetMapping("/menu/{id}")
	Optional<Menu> Menulist(@PathVariable int id) {
		return MenuService.FindMenuById(id);
	}
	@PostMapping("/menu")
	public int Create(@RequestBody Menu newmenu) {
		return MenuService.CreateMenu(newmenu);
	}
	@PutMapping("/menu/{id}")
	public int update(@RequestBody Menu newmenu, @PathVariable int id) {
		return MenuService.UpdateMenu(newmenu, id);
	}
}

