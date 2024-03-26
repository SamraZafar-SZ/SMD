package com.example.assign1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    EditText etname,etemail,etpassword,etpassword2;
    Button btnsignup;
    CheckBox Malechk,Femalechk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=etname.getText().toString().trim();
                String email=etemail.getText().toString().trim();
                String pass1=etpassword.getText().toString().trim();
                String pass2=etpassword2.getText().toString().trim();
                if(name.isEmpty()){
                    etname.setError("name is empty");
                }
                if(email.isEmpty()){
                    etemail.setError("email is empty");
                }
                if(pass1.isEmpty()){
                    etpassword.setError("password is empty");
                }
                if(pass2.isEmpty()){
                    etpassword2.setError("re-confirm password");
                }
                if(pass1 != pass2){
                    etpassword2.setError("confirmation password doesn't match");
                }
                else{
                    Intent intent=new Intent(MainActivity2.this,screen2.class);
                    startActivity(intent);
                }

            }
        });
    }
    void init(){
        etname=findViewById(R.id.etname);
        etemail=findViewById(R.id.etemail);
        etpassword=findViewById(R.id.etpassword);
        etpassword2=findViewById(R.id.etpassword2);
        btnsignup=findViewById(R.id.btnsignup);
        Malechk=findViewById(R.id.Malechk);
        Femalechk=findViewById(R.id.Femalechk);
    }

}