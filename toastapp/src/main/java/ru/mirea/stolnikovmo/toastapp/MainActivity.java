package ru.mirea.stolnikovmo.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCalc;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalc = findViewById(R.id.button);
        et = findViewById(R.id.editTextTextPersonName);

        View.OnClickListener oclBtnCalc = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Студент № 25, Группа БСБО-03-20, Количество символов - " + et.getText().toString().length(),
                        Toast.LENGTH_LONG);
                toast.show();
            }
        };

        btnCalc.setOnClickListener(oclBtnCalc);
    }
}