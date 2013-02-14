/**
 * 
 */
package me.bahadir.utils;

import android.content.Context;
import android.database.Cursor;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Bu sinif SQLiteAssetHelper sinifini dolayýsýyla SQLiteOpenHelper sýnýfýný
 * extend etmek için var
 * 
 * @author Bahadir
 *
 */
public class BXDB extends SQLiteAssetHelper {

	public final String DBName;
	public final Context context;
	public final int version;
	
	public BXDB(Context context, String DBName, int version) {
		super(context, DBName, null, version);
		this.DBName = DBName;
		this.context = context;
		this.version = version;
		
	}
	
	public Cursor readQuery(String queryString) {
		return getReadableDatabase().rawQuery(queryString,null);
	}
	

}
