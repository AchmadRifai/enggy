package project.skripsi.enggy.database.query;

import project.skripsi.enggy.database.dao.CategoryDAO;
import project.skripsi.enggy.database.data.Data;
import project.skripsi.enggy.database.model.CategoryModel;

import java.sql.SQLException;


public class CategoryReadQuery extends Query
{
	private long mId;


	public CategoryReadQuery(long id)
	{
		mId = id;
	}


	@Override
	public Data<CategoryModel> processData() throws SQLException
	{
		Data<CategoryModel> data = new Data<>();
		data.setDataObject(CategoryDAO.read(mId));
		return data;
	}
}
