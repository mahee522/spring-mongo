package com.tsp.dao.unit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.util.AssertException;
import com.tsp.model.Product;


@RunWith(SpringJUnit4ClassRunner.class)
public class ProductDaoTest extends BaseUnitTester {

	@Test
	public void testSaveProduct() throws Exception {
		
		Product product = new Product();
		product.setName("Mac Book Air");
		product.setType("Electronics");
		product = productDao.saveProduct(product);
		
		assertNotNull(product.getId());
	}
	
	@Test
	public void testFindProduct() throws Exception {
		
		Product product = new Product();
		product.setName("SpringDataBook");
		product.setType("Book");
		product = productDao.saveProduct(product);
		
		List<Product> products = productDao.getProductByName("SpringDataBook");
		
		assertEquals(products.get(0).getName(), "SpringDataBook");
		
		
	}
	

	

}