package raphaelbrito.com.helloword;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editGasolina;
    EditText editAlcool;
    Button btnLimpar;
    Button btncalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Entrou no onCreate");
        editGasolina = (EditText)findViewById(R.id.editTextGasolina);
        editAlcool = (EditText)findViewById(R.id.editTextAlcool);
        btncalcular = (Button) findViewById(R.id.buttonCalcular);
        btnLimpar = (Button) findViewById(R.id.buttonLimpar);

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                editAlcool.setText("");//Apagando o Conteúdo digitado em Álcool
                editGasolina.setText("");//Apagando o Conteúdo digitado em Gasolina
            }
        });

        btncalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double valorAlcool = Float.valueOf(editAlcool.getText().toString());
                double valorGasolina = Float.valueOf(editGasolina.getText().toString());

                Log.d("MainActivity - Edit Alcool", String.valueOf(valorAlcool));
                Log.d("MainActivity - Edit Gasolina", String.valueOf(valorGasolina) );

                double resultado = (valorGasolina * 0.7);
                Log.d("MainActivity - Edit Result", String.valueOf(valorGasolina * 0.7));
                if(resultado > valorAlcool || resultado == valorAlcool){
                    Log.d("MainActivity - Resultado", "É Melhor usar Álcool" );
                }else{
                    Log.d("MainActivity - Resultado", "É Melhor usar Gasolina" );
                }


            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "Entrou no onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "Entrou no onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "Entrou no onRestart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity", "Entrou no onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "Entrou no onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "Entrou no onDestroy");

    }

}
