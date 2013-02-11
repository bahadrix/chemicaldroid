/**
 * 
 */
package me.bahadir.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

/**
 * @author Bahadir Katipoglu
 *
 */
public class SQLITEDB extends SQLiteOpenHelper {

	private final String DB_PATH;
	 
    private final String DB_NAME;;
 
    private SQLiteDatabase database; 
 
    private final Context context;
	

	public SQLITEDB(Context context, String DBName, int OpenType) throws Exception {
		super(context, DBName, null, 1);
		this.context = context;
		this.DB_NAME = DBName;
		DB_PATH = "/data/data/" + context.getPackageName() + "/databases/";
		
		try {
			
			
			if (!deploy()) {
				throw new Exception("Cannot deploy db!");
			}
			
			Log.i("BXDB", "Opening DB: " + DBName);
			//database = SQLiteDatabase.openDatabase(DB_PATH + DBName, null, OpenType);
		} catch (Exception e) {
			Log.e("BXDBAA",e.getMessage());
		}
	}
	
	private boolean deploy() throws IOException{
	
		if (!isDeployed()) {
			Log.i("BXDB", "Copying DB " + DB_NAME);
			copyDB();
			
		}
		
		return isDeployed();
	}
	
	private void copyDB() throws IOException {
		InputStream myInput = context.getAssets().open(DB_NAME);
		
    	// Path to the just created empty db
    	String outFileName = DB_PATH + DB_NAME;
 
    	//Open the empty db as the output stream
    	OutputStream myOutput = new FileOutputStream(outFileName);
 
    	
    	//transfer bytes from the inputfile to the outputfile
    	byte[] buffer = new byte[1024];
    	int length;
    	while ((length = myInput.read(buffer))>0){
    		myOutput.write(buffer, 0, length);
    	}
 
    	//Close the streams
    	myOutput.flush();
    	myOutput.close();
    	myInput.close();
	}
	
	public boolean isDeployed() {
				
		File file = new File(DB_PATH + DB_NAME);
		
    	return file.exists();
	}
	
	/* (non-Javadoc)
	 * @see android.database.sqlite.SQLiteOpenHelper#onCreate(android.database.sqlite.SQLiteDatabase)
	 */
	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see android.database.sqlite.SQLiteOpenHelper#onUpgrade(android.database.sqlite.SQLiteDatabase, int, int)
	 */
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
