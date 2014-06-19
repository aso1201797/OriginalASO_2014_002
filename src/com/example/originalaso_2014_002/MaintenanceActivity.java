package com.example.originalaso_2014_002;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class MaintenanceActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener{

	SQLiteDatabase sdb = null;
	MySQLiteOpenHelper helper = null;

	int selectedID = -1;
	int lastPosition = -1;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
	}
	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

		Button btnDelete = (Button)findViewById(R.id.btnDELETE);
		Button btnMainte_Back = (Button)findViewById(R.id.LvHITOKOTO);

		btnDelete.setOnClickListerner(this);
		btnMainte_Back.setOnClickListener(this);

		1stHitokoto.setOnItemClickListener(this);

		this.setDBValuetoList(1stHitokoto);
	}
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
