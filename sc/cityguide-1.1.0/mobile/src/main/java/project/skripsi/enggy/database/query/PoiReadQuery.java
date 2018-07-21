package project.skripsi.enggy.database.query;

import project.skripsi.enggy.database.dao.PoiDAO;
import project.skripsi.enggy.database.data.Data;
import project.skripsi.enggy.database.model.PoiModel;

import java.sql.SQLException;


public class PoiReadQuery extends Query
{
	private long mId;


	public PoiReadQuery(long id)
	{
		mId = id;
	}


	@Override
	public Data<PoiModel> processData() throws SQLException
	{
		Data<PoiModel> data = new Data<>();
		data.setDataObject(PoiDAO.read(mId));
		return data;
	}
}
