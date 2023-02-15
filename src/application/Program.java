package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===== TEST 2: seller findByDepartment =====");
		List<Seller> list = sellerDao.findByDepartment(2);
		for(Seller s : list)
			System.out.println(s);
		
		System.out.println("\n===== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		for(Seller s : list)
			System.out.println(s);
	}

}
