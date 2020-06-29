package br.com.unipar.saqueemergencialdofgts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editCpf;
    private EditText editDataNascimento;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            editCpf = findViewById(R.id.editCpf);
            editDataNascimento = findViewById(R.id.editDataNascimento);
        }

        public void Consultar (View view) {

            double Cpf = Double.parseDouble( editCpf.getText().toString());
            double DataNascimento = Double.parseDouble(editDataNascimento.getText().toString());

            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }

        public void LimparCampos (View view) {

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }


}