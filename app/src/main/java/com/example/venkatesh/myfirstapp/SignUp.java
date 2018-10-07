package com.example.venkatesh.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        
    }
    
    
    public void loadData(View view) throws Exception{
        String email = ((EditText) findViewById(R.id.email)).getText().toString();
        String password = ((EditText)findViewById(R.id.password)).getText().toString();
        String password_re = ((EditText)findViewById(R.id.password_re)).getText().toString();
        String phone = ((EditText)findViewById(R.id.phone)).getText().toString();
        boolean flag = true;
        if(email.isEmpty()){
            //((EditText) findViewById(R.id.email)).setHint("Email is empty");
            findViewById(R.id.email_eh).setVisibility(View.VISIBLE);
            flag = false;
        }else {
            findViewById(R.id.email_eh).setVisibility(View.INVISIBLE);
        }
        if(password.isEmpty()){
//            ((EditText) findViewById(R.id.password)).setHint("Password is empty");
            findViewById(R.id.password_eh).setVisibility(View.VISIBLE);
            flag = false;
        }else {
            findViewById(R.id.password_eh).setVisibility(View.INVISIBLE);
        }
        if(password_re.isEmpty()){
//            ((EditText) findViewById(R.id.password_re)).setHint("Confirm Password is empty");
            findViewById(R.id.confirm_password_eh).setVisibility(View.VISIBLE);
            flag = false;
        }else {
            findViewById(R.id.confirm_password_eh).setVisibility(View.INVISIBLE);
        }
        if(phone.isEmpty()){
//            ((EditText) findViewById(R.id.phone)).setHint("Phone Number is empty");
            findViewById(R.id.phone_eh).setVisibility(View.VISIBLE);
            flag = false;
        }else {
            findViewById(R.id.phone_eh).setVisibility(View.INVISIBLE);
        }
        if(!flag){
            return;
        }else {
            if(!password.equals(password_re)){
                ((EditText) findViewById(R.id.password_re)).setText("Password didn't match");
                ((EditText) findViewById(R.id.password)).setText("Password didn't match");
                return;
            }
            Intent intent = new Intent(this, SignUpSuccess.class);
            startActivity(intent);
        }
    }
}
