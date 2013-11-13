package com.example.edson;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	EditText nome;
	EditText senha;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
		
		case R.id.menu_entrar:
			
			nome=(EditText)findViewById(R.id.id_edt_nome);
			senha=(EditText)findViewById(R.id.id_edt_senha);
			
			if(nome.getText().toString().equals("edson")&& senha.getText().toString().equals("123"))
			{
				
				Intent segunda = new Intent(this,SegundaActivity.class);
				segunda.putExtra("chave_nome",nome.getText().toString());
				startActivity(segunda);
				
				
				
			} else{
				
				
				
			}
			
			
			
			break;
			
		case R.id.menu_sair:
			finish();
			break;
			
		case R.id.menu_ajuda:
			Intent ajuda = new Intent(this,AjudaActivity.class);
			startActivity(ajuda);
			
	break;

		default:
			break;
		}
		
		
		
		return super.onOptionsItemSelected(item);
	}

}
