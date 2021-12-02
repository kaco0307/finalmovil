package com.example.clase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
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
    private EditText valorx, valorn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorn = findViewById(R.id.N);
        valorx = findViewById(R.id.X);
        resu = findViewById(R.id.Resu);

       valorx.setOnEditorActionListener(new TextView.OnEditorActionListener() {
           @Override
           public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
               boolean pro = false;
               int a;

               if (i == EditorInfo.IME_ACTION_DONE){

                   a = Integer.parseInt(valorx.getText().toString()) + Integer.parseInt(valorn.getText().toString());

                   resu.setText(String.valueOf(a));

                   //ocultar teclado virtual
                   InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                   imm.hideSoftInputFromWindow(valorn.getWindowToken(), 0);

                   pro = true;
               }
               return pro;
           }
       });

    }

    public int calcular_resu(int n, int x){

        int resu = 0; 

        if(n == 1 && x == 1){
            resu = 1;
        }else{

            int i = 1;

            while( i <= n ){
                resu += Math.pow(x, i)/factorial(i);
                i++;
            }

            resu += 1;

        }

    }

    public int factorial(int num){

        fact = 1;

        while(num != 0){
            fact *= num;
            num--;
        }

        return fact;

    }


}