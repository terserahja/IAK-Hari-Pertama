package com.blogspot.programer27android.haripertamaiak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.pasword);
        btnlogin=(Button)findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String em= email.getText().toString();
                String ps= password.getText().toString().trim();
                if (TextUtils.isEmpty(em.trim())){
                    email.setError(getString(R.string.erroremail));
                    email.requestFocus();
                }else if (ps.length()<6){
                    password.setError(getString(R.string.pasworddkurang));
                }else{
                    Intent kirim_data=new Intent(MainActivity.this,Terimadata.class);
                    kirim_data.putExtra("email",em);
                    kirim_data.putExtra("pasword",ps);
                    startActivity(kirim_data);
                }
            }
        });
       password.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               System.out.print("test");
               System.out.print("test");
           }
       });
    }


}
