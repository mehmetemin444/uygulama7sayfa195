package com.example.uygulama7sayfa195;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextYas , editTextMaas;
    Button buttonSonuc;
    TextView textViewSonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                editTextYas = findViewById(R.id.editTextYas);
                editTextMaas = findViewById(R.id.editTextMaas);
                textViewSonuc = findViewById(R.id.textViewSonuc);
                buttonSonuc = findViewById(R.id.buttonSonuc);
                buttonSonuc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int yas = Integer.parseInt(editTextYas.getText().toString());
                        int maas =Integer.parseInt(editTextMaas.getText().toString());
                        Personel personel=new Personel();
                        personel.setYas(yas);
                        personel.setMaas(maas);
                        textViewSonuc.setText("yas:"+personel.getYas()+" maaş:"+personel.getMaas());
                    }
                });

    }
}