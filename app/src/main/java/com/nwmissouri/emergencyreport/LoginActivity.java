package com.nwmissouri.emergencyreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button1 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), RegistrationActivity.class);
//                i.putExtra("Value1", "Android By Javatpoint");
//                i.putExtra("Value2", "Simple Tutorial");
//                // Set the request code to any code you like, you can identify theme
                // callback via this code
                startActivity(i);

            }


        });
    }
}