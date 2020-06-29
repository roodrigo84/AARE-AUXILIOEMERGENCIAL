package br.com.unipar.saqueemergencialdofgts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textViewParcela1 = findViewById(R.id.textViewParcela1);
        TextView textViewParcela2 = findViewById(R.id.textViewParcela2);
        TextView textViewParcela3 = findViewById(R.id.textViewParcela3);

    }
}