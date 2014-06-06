package com.example.originalaso_2014_002;
import jp.ac.st.asojuku.original2014001.R;
import android.app.Activity;
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
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

		Button btnMens = (Button)findViewById(R.id.btnMens);
		btnMens.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){
			case R.id.btnMens:
				EditText etv = (EditText)findViewById(R.id.edtFirst);
				String inputMsg = etv.getText().toString();


				Intent intent = new Intent(MainActivity.this,HitokotoActivity.class);
				startActivity(intent);




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
