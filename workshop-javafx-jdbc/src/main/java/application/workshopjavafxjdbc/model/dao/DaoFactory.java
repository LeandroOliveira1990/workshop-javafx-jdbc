package application.workshopjavafxjdbc.model.dao;

import application.workshopjavafxjdbc.db.DB;
import application.workshopjavafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import application.workshopjavafxjdbc.model.dao.impl.SellerDaoJDBC;


public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
