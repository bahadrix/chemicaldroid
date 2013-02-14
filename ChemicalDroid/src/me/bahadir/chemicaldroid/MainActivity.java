package me.bahadir.chemicaldroid;

import me.bahadir.chemicaldroid.models.Chemical;
import me.bahadir.utils.BXDB;
import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try {
			BXDB db = new BXDB(this, "chemreac", 1);
			
			Cursor cursor = db.readQuery("SELECT * FROM chemicals LIMIT 10");
			if (cursor.moveToFirst()) {
				do {
					Chemical chem = new Chemical(cursor);
					
					Log.i("baha", chem.chemical_profile);
				} while (cursor.moveToNext());
			} else {
				Log.i("baha", "Hic bulunamadi");
			}
			
		} catch (Exception e) {
			Log.e("ERROR", e.getMessage());
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
