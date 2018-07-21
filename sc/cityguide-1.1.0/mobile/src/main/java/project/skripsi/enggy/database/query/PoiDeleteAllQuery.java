package project.skripsi.enggy.database.query;

import project.skripsi.enggy.database.dao.PoiDAO;
import project.skripsi.enggy.database.data.Data;

import java.sql.SQLException;


public class PoiDeleteAllQuery extends Query
{
	public PoiDeleteAllQuery()
	{
	}


	@Override
	public Data<Integer> processData() throws SQLException
	{
		Data<Integer> data = new Data<>();
		data.setDataObject(PoiDAO.deleteAll());
		return data;
	}
}
