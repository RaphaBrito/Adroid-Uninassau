package raphaelbrito.com.alcoolgasolina;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

public class ListaPreco extends AppCompatActivity {
    TextView texto;
    String resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_preco);
        Intent it = getIntent();
        resultado = it.getStringExtra("resultado");
        texto = findViewById(R.id.textView_lista);
        Log.d("ListaPreco", resultado);
        texto.setText("Vamos abastecer com: "+ resultado);
    }
}
