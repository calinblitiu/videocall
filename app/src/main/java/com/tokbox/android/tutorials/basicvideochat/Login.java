package com.tokbox.android.tutorials.basicvideochat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by rubby on 7/29/2017.
 */

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button loginbtn;
    EditText user_id, other_id;
    EditText pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);

        loginbtn = (Button)findViewById(R.id.loginbtn);
        user_id = (EditText)findViewById(R.id.user_id);
        //other_id = (EditText)findViewById(R.id.other);
        pwd = (EditText)findViewById(R.id.pwd);

        loginbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Users.me = user_id.getText().toString();
        //Users.other = other_id.getText().toString();
        Users.pwd = pwd.getText().toString();
        if (Users.me.equals("") ||  Users.pwd.equals("")){
            Toast toast=Toast.makeText(Login.this,"Please Input all data.",Toast.LENGTH_LONG);
            toast.show();
            return;
        }

        if (!Users.me.equals("michele") || !Users.pwd.equals("123456")){
            Toast toast=Toast.makeText(Login.this,"Please Input Correct Data.",Toast.LENGTH_LONG);
            toast.show();
            return;
        }

        Intent intent = new Intent(Login.this, MainActivity.class);
        startActivity(intent);
    }
}
