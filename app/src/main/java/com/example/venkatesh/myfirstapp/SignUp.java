package com.example.venkatesh.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        
    }
    
    
    public void loadData(View view) throws Exception{
        String username = ((EditText) findViewById(R.id.username)).getText().toString();
        String email = ((EditText) findViewById(R.id.email)).getText().toString();
        String password = ((EditText)findViewById(R.id.password)).getText().toString();
        String password_re = ((EditText)findViewById(R.id.password_re)).getText().toString();
        String phone = ((EditText)findViewById(R.id.phone)).getText().toString();
        boolean flag = true;
        if(username.isEmpty() || password.isEmpty() || password_re.isEmpty() || phone.isEmpty()){
            findViewById(R.id.fields_mandatory).setVisibility(View.VISIBLE);
            flag = false;
        }
        if(!flag){
            return;
        }else {
            if(!password.equals(password_re)){
                ((TextView)findViewById(R.id.fields_mandatory)).setText(R.string.password_mismatch);
                findViewById(R.id.fields_mandatory).setVisibility(View.VISIBLE);
                return;
            }
            Intent intent = new Intent(this, SignUpSuccess.class);
            startActivity(intent);
        }
    }
}
