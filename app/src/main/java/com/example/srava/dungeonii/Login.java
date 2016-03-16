package com.example.srava.dungeonii;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class Login extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button Connexion = (Button)findViewById(R.id.btn_cct);
        Connexion.setOnClickListener(this);
        Log.i("button", "Launch ready");
    }

    public void onClick(View v){
        switch(v.getId()) {
            case R.id.btn_cct:
                //On declare le login et le password
                EditText username = (EditText) findViewById(R.id.username);
                EditText password = (EditText) findViewById(R.id.password);
                //Recupere le status de connection et la progressBar
                TextView connectionStatus = (TextView)findViewById(R.id.Not_Log);
                ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressBar);
                progressBar.setVisibility(v.VISIBLE);
                //Si le bouton est clique il renvoie la chaine de texte "Connection en cours"
                Toast.makeText(getApplicationContext(), "Connection en cours", Toast.LENGTH_SHORT).show();
                //on cree le credential et on l'instancie avec le login et le password
                Credential credential = new Credential();
                credential.username=username.getText().toString();
                credential.password=password.getText().toString();
                HttpRequestTaskManager result = new HttpRequestTaskManager(getApplicationContext());
                result.setProgressBar(progressBar);
                result.setConnectionStatus(connectionStatus);
                result.execute(credential);
                Log.d("HttpRequestTaskManager", String.valueOf(result));
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
