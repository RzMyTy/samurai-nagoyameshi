package com.example.nagoyameshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.nagoyameshi.entity.Category;
import com.example.nagoyameshi.repository.CategoryRepository;

@Controller
@RequestMapping("/admin/restaurants")
public class AdminCategoryController {
	private final CategoryRepository categoryRepository;
	
	public AdminCategoryController(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public String CategoryForm(Model model) {
        Iterable<Category> categories = categoryRepository.findAll();
        
        model.addAttribute("categories", categories);
       
        return "admin/restaurants/index";
	}
}
