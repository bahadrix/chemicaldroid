/**
 * 
 */
package me.bahadir.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * @author vaıo
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
	

}
