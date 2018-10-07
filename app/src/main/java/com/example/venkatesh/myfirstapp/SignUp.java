package com.example.venkatesh.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * SignUp Activity class
 * @author venkatesh
 */
public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        
    }

    /**
     * Method to be called when SignUp button from SignUp Activity
     * clicked
     * @param view
     */
    public void onClickSignUp(View view) {
        String username = ((EditText) findViewById(R.id.username)).getText().toString();
        String email = ((EditText) findViewById(R.id.email)).getText().toString();
        String password = ((EditText)findViewById(R.id.password)).getText().toString();
        String password_re = ((EditText)findViewById(R.id.password_re)).getText().toString();
        String phone = ((EditText)findViewById(R.id.phone)).getText().toString();
        boolean flag = true;
        if(username.isEmpty() || password.isEmpty() || password_re.isEmpty() || phone.isEmpty()){
            showAlertMessage(R.string.mandaotry_fields);
            flag = false;
        }
        if(!flag){
            return;
        }else {
            if(!password.equals(password_re)){
                showAlertMessage(R.string.password_mismatch);
            }else if(phone.length() != 10){
                showAlertMessage(R.string.invalid_mobile);
            }
            return;
        }
    }

    /**
     * Method to show some alert message on SignUp Activity
     * @param message takes a Integer Id of string from (#R.string)
     */
    private void showAlertMessage(Integer message){
        ((TextView)findViewById(R.id.alert_message)).setText(message);
        findViewById(R.id.alert_message).setVisibility(View.VISIBLE);
    }
}
