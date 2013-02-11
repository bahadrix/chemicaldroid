package me.bahadir.chemicaldroid;

import me.bahadir.utils.BXDB;
import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try {
			BXDB db = new BXDB(this, "chemreac", 1);
			Cursor cursor = db.getReadableDatabase().rawQuery("SELECT * FROM reactivity LIMIT 10",null);
			if (cursor.moveToFirst()) {
				do {
					Log.i("INFO", cursor.getString(cursor.getColumnIndex("gas_reference")));
				} while (cursor.moveToNext());
			} else {
				Log.i("BXDB", "Hic bulunamadi");
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
