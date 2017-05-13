package com.example.app;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private String acount="2205411416";
    private String password="dzw861153669";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ImageView imageView=(ImageView)findViewById(R.id.imag);
        EditText textView1=(EditText) findViewById(R.id.acount);
        EditText textView2=(EditText) findViewById(R.id.password);
        Button button=(Button)findViewById(R.id.button);
        final String userAcount=textView1.getText().toString();
        final String userPassword=textView2.getText().toString();
      button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userAcount.equals(acount)&&userPassword.equals(password)){
                    Intent intent = new Intent(LoginActivity.this, ContentActivity.class);
                    startActivity(intent);
                }
                else if(!userAcount.equals(acount))
                {
                    Toast.makeText(LoginActivity.this,"acount is error.",Toast.LENGTH_SHORT).show();
                }
                else if(!userPassword.equals(password))
                {
                    Toast.makeText(LoginActivity.this,"password is error.",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(LoginActivity.this,"input your acount or password,please!",Toast.LENGTH_SHORT).show();
                }
            }
      });

    }
}