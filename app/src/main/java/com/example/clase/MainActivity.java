package com.example.clase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private TextView resu;
    private ListView Paises;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resu = findViewById(R.id.resultado);
        Paises = findViewById(R.id.paises);


        ArrayList<String> listpais = new ArrayList<>();

        listpais.add("Brazil");
        listpais.add("Argentina");
        listpais.add("Colombia");
        listpais.add("Perú");
        listpais.add("Chile");
        listpais.add("Ecuador");
        listpais.add("Venezuela");
        listpais.add("Bolivia");
        listpais.add("Uruguay");
        listpais.add("Paraguay");

        ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listpais);
        Paises.setAdapter(arrayAdapter);

        final String[] name = new String[1];

               Paises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                   @Override
                   public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {

                       name[0] = listpais.get(posicion).toString();

                       switch (name[0]){

                           case "Brazil":

                               resu.setText("La poblacion de Brazil es de 212.6 millones de personas");

                               break;

                           case "Argentina":

                               resu.setText("La poblacion de Argentina es de 45.38 millones de personas");

                               break;

                           case "Colombia":

                               resu.setText("La poblacion de Colombia es de 50.88 millones de personas");

                               break;
                           case "Perú":

                               resu.setText("La poblacion de Colombia es de 32.97 millones de personas");

                               break;
                           case "Chile":

                               resu.setText("La poblacion de Chile es de 19.12 millones de personas");

                               break;
                           case "Ecuador":

                               resu.setText("La poblacion de Ecuador es de 17.64 millones de personas");

                               break;
                           case "Venezuela":

                               resu.setText("La poblacion de Venezuela es de 28.44 millones de personas");

                               break;
                           case "Bolivia":

                               resu.setText("La poblacion de Bolovia es de 11.67 millones de personas");

                               break;
                           case "Uruguay":

                               resu.setText("La poblacion de Uruguay es de 3.474 millones de personas");

                               break;
                           case "Paraguay":

                               resu.setText("La poblacion de Paraguay es de 7.133 millones de personas");

                               break;

                           default:
                               Toast.makeText(MainActivity.this, "No selecciono ninguna opción", Toast.LENGTH_LONG).show();

                       }

                   }
               });

    }
}