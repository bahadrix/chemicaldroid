package me.bahadir.chemicaldroid.models;

import android.database.Cursor;

public abstract class LeModel {

	protected Cursor cursor;
	/**
	 * Cursor objesinden kendi attributelarýný doldurmalý
	 * @param cursor
	 */
	
	abstract public void setField(String columnName, int columnIndex);
	public LeModel(Cursor cursor) {
		super();
		this.cursor = cursor;
		
		int colIndex;
		for(String columnName : cursor.getColumnNames()) {
			colIndex = cursor.getColumnIndex(columnName);
			setField(columnName, colIndex);
		}
	}
	
	
	
	
}
