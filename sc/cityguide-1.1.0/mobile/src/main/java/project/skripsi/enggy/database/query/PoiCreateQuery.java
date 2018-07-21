package project.skripsi.enggy.database.query;

import project.skripsi.enggy.database.dao.PoiDAO;
import project.skripsi.enggy.database.data.Data;
import project.skripsi.enggy.database.model.PoiModel;

import java.sql.SQLException;


public class PoiCreateQuery extends Query
{
	private PoiModel mPoi;
	
	
	public PoiCreateQuery(PoiModel poi)
	{
		mPoi = poi;
	}
	
	
	@Override
	public Data<Integer> processData() throws SQLException
	{
		Data<Integer> data = new Data<>();
		data.setDataObject(PoiDAO.create(mPoi));
		return data;
	}
}
