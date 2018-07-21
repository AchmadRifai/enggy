package project.skripsi.enggy.database;

import project.skripsi.enggy.database.data.Data;


public interface DatabaseCallListener
{
	public void onDatabaseCallRespond(DatabaseCallTask task, Data<?> data);
	public void onDatabaseCallFail(DatabaseCallTask task, Exception exception);
}
