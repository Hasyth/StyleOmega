//package com.example.asuspc.styleomegaassignment;
//
//
*
// * Created by Asus PC on 8/24/2017.
//

//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//
//public class LoginActivity extends AppCompatActivity {
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//        SqlScoutServer.create(this, getPackageName());
//
//        final EditText username = (EditText) findViewById(R.id.username);
//        final EditText password = (EditText) findViewById(R.id.password);
//        final Button signinbutton = (Button) findViewById(R.id.signinbutton);
//        final TextView hyperLink = (TextView) findViewById(R.id.hyperLink);
//    }
//
//
//    hyperLink.setOnClickListner(new View.OnClickListener(){
//
//        @Override
//        public void onClick(View view){
//        Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
//        LoginActivity.this.startActivity(registerIntent);
//
//
//        }
//
//    });
//}
//
//    public void SignInBtnClick(View view) {
//
//        EditText username = (EditText) findViewById(R.id.username);
//        EditText password = (EditText) findViewById(R.id.password);
//
//        String uname = username.getText().toString();
//        String pass = password.getText().toString();
//
//        Intent intent = new Intent(LoginActivity.this, DisplayActivity.class);
//        intent.putExtra("Username", uname);
//        intent.putExtra("Password", pass);
//        startActivity(intent);
//
//
//    }
//}
