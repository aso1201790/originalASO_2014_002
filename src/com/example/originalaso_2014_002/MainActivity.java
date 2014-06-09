package com.example.originalaso_2014_002;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnHitokoto = (Button)findViewById(R.id.btnHitokoto);
		btnHitokoto.setOnClickListener(this);
		Button btnMens = (Button)findViewById(R.id.btnMens);
		btnMens.setOnClickListener(this);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

	}


	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		Intent intent = null;
		switch(v.getId()){
			case R.id.btnHitokoto:
				EditText etv = (EditText)findViewById(R.id.edtFirst);
				String inputMsg = etv.getText().toString();


				intent = new Intent(MainActivity.this,HitokotoActivity.class);
				startActivity(intent);
				break;

			case R.id.btnMens:
				intent = new Intent(MainActivity.this,MaintenanceActivity.class);
				startActivity(intent);
				break;
		}
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
