package com.niit.backend;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;

public class CategoryTest
{
static CategoryDAO categoryDao;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext configApplnContext=new AnnotationConfigApplicationContext();
		configApplnContext.scan("com");
		configApplnContext.refresh();
		
		//SessionFactory sessionFactory=(SessionFactory)configApplnContext.getBean("DBConfig.class");
		
		categoryDao=(CategoryDAO)configApplnContext.getBean("CategoryDao");
	}
	
	
	@Test
	public void addCategoryTest()
	{
		Category category=new Category();
		category.setCatId(1002);
		category.setCatName("JMShirt");
		category.setCatDesc(" Miller Shirt");
		
	assertTrue(categoryDao.addCategory(category));
	}
	@Ignore
	@Test
	public void updateCategoryTest()
	{
		Category category=new Category();
		category.setCatId(1002);
		category.setCatName("JMShirt");
		category.setCatDesc("John Miller Shirt is best");
		
	assertTrue(categoryDao.updateCategory(category));
	}
	@Ignore
	@Test
	public void deleteCategoryTest()
	{
		Category category=new Category();
		category.setCatId(1002);
	assertTrue(categoryDao.deleteCategory(category));
	}
	@Ignore
	@Test
	public void retrieveCategoryTest()
	{
		List<Category> listCategory=categoryDao.retrieveCategory();
		assertNotNull("Problem in Retriving",listCategory);
		this.show(listCategory);
	}
	public void show(List<Category> listCategory)
	{
		for(Category category:listCategory)
		{
			System.out.println("Category ID:"+category.getCatId());
			System.out.println("Category Name:"+category.getCatName());
		}
	}
	@Ignore
	@Test
	public void getCategoryTest()
	{
		Category category=categoryDao.getCategory(1002);
		assertNotNull("Problem in Getting:",category);
		System.out.println("Category Id:"+category.getCatId());
		System.out.println("Category Name:"+category.getCatName());
	}

}
