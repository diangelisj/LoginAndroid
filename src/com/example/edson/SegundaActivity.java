package com.example.edson;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SegundaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);
		
		Intent segunda = getIntent();
		String nome = segunda.getExtras().getString("chave_nome");
		
		TextView recebe_nome =(TextView)findViewById(R.id.id_txt_recebe_nome);
		recebe_nome.setText(nome);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_segunda, menu);
		return true;
	}

}
