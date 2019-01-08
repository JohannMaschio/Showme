package com.example.johannbm.showme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnTeste;
    private TextView txtTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTeste = findViewById(R.id.btnTeste);
        txtTeste = findViewById(R.id.txtTeste);

        btnTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTeste.setVisibility(View.VISIBLE);
                txtTeste.setText(R.string.texto_1);
            }
        });


    }
}
