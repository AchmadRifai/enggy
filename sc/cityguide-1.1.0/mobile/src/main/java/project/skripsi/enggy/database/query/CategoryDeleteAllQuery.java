package project.skripsi.enggy.database.query;

import project.skripsi.enggy.database.dao.CategoryDAO;
import project.skripsi.enggy.database.data.Data;

import java.sql.SQLException;


public class CategoryDeleteAllQuery extends Query
{
	public CategoryDeleteAllQuery()
	{
	}


	@Override
	public Data<Integer> processData() throws SQLException
	{
		Data<Integer> data = new Data<>();
		data.setDataObject(CategoryDAO.deleteAll());
		return data;
	}
}
