package ru.mirea.stolnikovmo.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnGoToWeb;
    Button btnShareFIO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoToWeb = findViewById(R.id.button);
        btnShareFIO = findViewById(R.id.button2);

        View.OnClickListener oclBtnGoToWeb = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri address = Uri.parse("https://www.mirea.ru/");
                Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
                startActivity(openLinkIntent);
            }
        };

        View.OnClickListener oclBtnShareFIO = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "MIREA");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Стольников Матвей Олегович");
                startActivity(Intent.createChooser(shareIntent, "МОИ ФИО"));
            }
        };

        btnGoToWeb.setOnClickListener(oclBtnGoToWeb);
    }
}