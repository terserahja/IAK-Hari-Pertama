package com.blogspot.programer27android.haripertamaiak;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by gery on 11/12/17.
 */

public class Terimadata extends AppCompatActivity{
    TextView email,password;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terima_data);
        email=(TextView)findViewById(R.id.emailterimadata);
        password=(TextView)findViewById(R.id.paswordterimadata);
        Intent terimadata=getIntent();
        email.setText(terimadata.getStringExtra("email"));
        password.setText(terimadata.getStringExtra("pasword"));
    }
}
