package com.example.oralchess;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.Console;
import java.io.IOException;
import java.util.List;

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
/*                String received_username = username.getText().toString();
                String received_password = password.getText().toString();
                String message_to_display = received_username + "\n" + received_password + "okay  ";
                Toast.makeText(LogIn.this,message_to_display,Toast.LENGTH_SHORT).show();*/

/*                AccountDataRequest accountDataRequest = new AccountDataRequest(personal_oauth);
                try {
                    LichessAccountData lichessAccountData = accountDataRequest.getAccountData();
                    Toast.makeText(LogIn.this,lichessAccountData.getId(),Toast.LENGTH_SHORT).show();
                }
                catch (IOException e){
                    Toast.makeText(LogIn.this,e.toString(),Toast.LENGTH_SHORT);
                }*/

                //THE FOLLOWING WORKS!
/*                //Create a handler for the IRetrofit interface//
                IRetrofit retroClass = RetroClient.getRetroInstance().create(IRetrofit.class);
                Call<List<Posts>> serverCall = retroClass.getPosts();

                //Execute the server request asynchronously
                serverCall.enqueue(new Callback<List<Posts>>() {

                    @Override
                    public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                        List<Posts> postList = response.body();
                        Toast.makeText(LogIn.this,response.body().get(0).getBody().toString(),Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onFailure(Call<List<Posts>> call, Throwable t) {
                        Toast.makeText(LogIn.this, "Unable to load users", Toast.LENGTH_SHORT).show();
                    }
                });*/

            }
        });
    }

}
