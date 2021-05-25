package com.springboot.app.rest.admin;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.app.domain.Category;
import com.springboot.app.dto.CategoryDto;
import com.springboot.app.services.serviceImpl.CategoryServiceImpl;

@RestController
@RequestMapping("/admin/cate")
public class CategoryController {

	@Autowired	
	private CategoryServiceImpl categoryService;
	@RequestMapping("")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("views/admin-cate/index");
		return modelAndView;

	}	
	@RequestMapping(value="/categories",method=RequestMethod.GET)
	public ResponseEntity<List<CategoryDto>>getAllCategories() {	
		return new ResponseEntity<>( categoryService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/cateNoHaveChild",method=RequestMethod.GET)
	public ResponseEntity<List<CategoryDto>>getAllCatNotHaveChild() {	
		return new ResponseEntity<>( categoryService.findAllWithNoChidren(),HttpStatus.OK);
	}
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public ResponseEntity<CategoryDto> save(@RequestBody  CategoryDto dto ) {	
		
		CategoryDto result = categoryService.saveOrUpdate(dto, null);
        return new ResponseEntity<CategoryDto>(result, (result != null) ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
	}
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<CategoryDto>  getCategory(@PathVariable("id") Long id) {	
		CategoryDto result =categoryService.getOne(id);
		 return new ResponseEntity<>(result, result != null ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public ResponseEntity<CategoryDto> updateCategory(@RequestBody CategoryDto dto , @PathVariable("id") Long id) {	
		System.out.println(dto);
		System.out.println(id.toString());
		
		CategoryDto result = categoryService.saveOrUpdate(dto, id);
        return new ResponseEntity<CategoryDto>(result, (result != null) ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
		}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	 public ResponseEntity<Boolean>  removeCategory(@PathVariable("id") Long id) {
		 categoryService.deleteById(id);
	        return new ResponseEntity<>(true, HttpStatus.OK);
	}
	
}
