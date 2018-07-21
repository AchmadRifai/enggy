package project.skripsi.enggy.database.query;

import project.skripsi.enggy.database.dao.PoiDAO;
import project.skripsi.enggy.database.data.Data;
import project.skripsi.enggy.database.model.PoiModel;

import java.sql.SQLException;


public class PoiUpdateQuery extends Query
{
	private PoiModel mPoi;


	public PoiUpdateQuery(PoiModel poi)
	{
		mPoi = poi;
	}


	@Override
	public Data<Integer> processData() throws SQLException
	{
		Data<Integer> data = new Data<>();
		data.setDataObject(PoiDAO.update(mPoi));
		return data;
	}
}
