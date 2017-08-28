package com.example.asuspc.styleomegaassignment;

/**
 * Created by Asus PC on 8/24/2017.
 */
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void RegisterbtnClick(View view) {

        if (view.getId() == R.id.regbutton) {
            final EditText fullname = (EditText) findViewById(R.id.fullname);
            final EditText username = (EditText) findViewById(R.id.username);
            final EditText password = (EditText) findViewById(R.id.password);
            final EditText phonenumber = (EditText) findViewById(R.id.phonenumber);
            final EditText email = (EditText) findViewById(R.id.email);
            final Button register = (Button) findViewById(R.id.regbutton);


            String fname = fullname.getText().toString();
            String uname = username.getText().toString();
            String pass = password.getText().toString();
            String pnumber = phonenumber.getText().toString();
            String mail = email.getText().toString();

//edited
        }

    }
}