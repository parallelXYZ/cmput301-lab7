package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    private TextView cityText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        cityText = findViewById(R.id.city_text);
        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String city = bundle.getString("city");
        System.out.println("f "+city);
        cityText.setText(city);

        final Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ShowActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}