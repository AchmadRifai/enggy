package project.skripsi.enggy.database.query;

import project.skripsi.enggy.database.dao.CategoryDAO;
import project.skripsi.enggy.database.data.Data;
import project.skripsi.enggy.database.model.CategoryModel;

import java.sql.SQLException;


public class CategoryCreateQuery extends Query
{
	private CategoryModel mCategory;


	public CategoryCreateQuery(CategoryModel category)
	{
		mCategory = category;
	}
	
	
	@Override
	public Data<Integer> processData() throws SQLException
	{
		Data<Integer> data = new Data<>();
		data.setDataObject(CategoryDAO.create(mCategory));
		return data;
	}
}
