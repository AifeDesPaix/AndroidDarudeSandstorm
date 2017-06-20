package com.example.aifedespaix.aifedespaix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /** Trucs Random **/
    private Button btn;
    private EditText edtLogin;
    private EditText edtPassword;

    /** Instances d'activités **/
    Intent intCalc1;

    public void toast() {

        return;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtLogin = (EditText) findViewById(R.id.login_username);
        edtPassword = (EditText) findViewById(R.id.login_password);
        final TextView message = (TextView) findViewById(R.id.textView2);


        /**
         * Bouton Message
         */
        Button btnCalcul = (Button) findViewById(R.id.calculBtn);
        btnCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText calcul = (EditText) findViewById(R.id.editText4);
                TextView resultatCalc = (TextView) findViewById(R.id.resultatCalc);
                resultatCalc.setText((Integer.parseInt(calcul.getText().toString()) + 3) + "");
            }
        });


        /**
         * Bouton message
         */
        Button btnMes = (Button) findViewById(R.id.toggleButton);
        btnMes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Nique dont ta vieille race "+edtLogin.getText(), Toast.LENGTH_LONG).show();

                TextView message = (TextView) findViewById(R.id.textView2);
                message.setText(edtLogin.getText()+" est un connard !");

                loadIntentCalc1();
            }
        });
    }

    /**
     * Charger une activité
     */
    private void loadIntentCalc1() {
        intCalc1 = new Intent(getApplicationContext(), FullscreenActivity.class);
        startActivity(intCalc1);
    }
}
