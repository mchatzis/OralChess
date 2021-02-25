package com.example.oralchess;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);

        final String personal_oauth = "LQtd2B8j0ZWHL0ye";
        final Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String received_username = username.getText().toString();
                String received_password = password.getText().toString();
                String message_to_display = received_username + "\n" + received_password + "okay  ";
                Toast.makeText(LogIn.this,message_to_display,Toast.LENGTH_SHORT).show();

                AccountDataRequest accountDataRequest = new AccountDataRequest(personal_oauth);
                LichessAccountData lichessAccountData = accountDataRequest.getAccountData();

                Toast.makeText(LogIn.this,lichessAccountData.getId(),Toast.LENGTH_SHORT).show();

            }
        });
    }

}
