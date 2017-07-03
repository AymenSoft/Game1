package com.test.game1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText a1,a2,a3,b1,b2,b3,c1,c2,c3;
    ImageView a4,b4,c4,
              d0,d1,d2,d3,d4;
    Button btnResolve;

    int Solution = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1=(EditText)findViewById(R.id.a1);
        a2=(EditText)findViewById(R.id.a2);
        a3=(EditText)findViewById(R.id.a3);
        b1=(EditText)findViewById(R.id.b1);
        b2=(EditText)findViewById(R.id.b2);
        b3=(EditText)findViewById(R.id.b3);
        c1=(EditText)findViewById(R.id.c1);
        c2=(EditText)findViewById(R.id.c2);
        c3=(EditText)findViewById(R.id.c3);

        a4=(ImageView)findViewById(R.id.a4);
        b4=(ImageView)findViewById(R.id.b4);
        c4=(ImageView)findViewById(R.id.c4);
        d0=(ImageView)findViewById(R.id.d0);
        d1=(ImageView)findViewById(R.id.d1);
        d2=(ImageView)findViewById(R.id.d2);
        d3=(ImageView)findViewById(R.id.d3);
        d4=(ImageView)findViewById(R.id.d4);

        btnResolve=(Button)findViewById(R.id.btn_resolve);

        btnResolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ValidInput()) {
                    Resolve0();
                    Resolve1();
                    Resolve2();
                    Resolve3();
                    Resolve4();
                    ResolveA();
                    ResolveB();
                    ResolveC();
                }

            }
        });

    }

    public void ResolveA(){
        int x = Integer.parseInt(a1.getText().toString());
        int y = Integer.parseInt(a2.getText().toString());
        int z = Integer.parseInt(a3.getText().toString());
        if (Summ(x, y, z) == Solution) {
            a4.setImageDrawable(getResources().getDrawable(R.drawable.ic_yes_green));
        }else {
            a4.setImageDrawable(getResources().getDrawable(R.drawable.ic_no_red));
        }
    }

    public void ResolveB(){
        int x = Integer.parseInt(b1.getText().toString());
        int y = Integer.parseInt(b2.getText().toString());
        int z = Integer.parseInt(b3.getText().toString());
        if (Summ(x, y, z) == Solution) {
            b4.setImageDrawable(getResources().getDrawable(R.drawable.ic_yes_green));
        }else {
            b4.setImageDrawable(getResources().getDrawable(R.drawable.ic_no_red));
        }
    }

    public void ResolveC(){
        int x = Integer.parseInt(c1.getText().toString());
        int y = Integer.parseInt(c2.getText().toString());
        int z = Integer.parseInt(c3.getText().toString());
        if (Summ(x, y, z) == Solution) {
            c4.setImageDrawable(getResources().getDrawable(R.drawable.ic_yes_green));
        }else {
            c4.setImageDrawable(getResources().getDrawable(R.drawable.ic_no_red));
        }
    }


    public void Resolve1(){
        int x = Integer.parseInt(a1.getText().toString());
        int y = Integer.parseInt(b1.getText().toString());
        int z = Integer.parseInt(c1.getText().toString());
        if (Summ(x, y, z) == Solution) {
            d1.setImageDrawable(getResources().getDrawable(R.drawable.ic_yes_green));
        }else {
            d1.setImageDrawable(getResources().getDrawable(R.drawable.ic_no_red));
        }
    }

    public void Resolve2(){
        int x = Integer.parseInt(a2.getText().toString());
        int y = Integer.parseInt(b2.getText().toString());
        int z = Integer.parseInt(c2.getText().toString());
        if (Summ(x, y, z) == Solution) {
            d2.setImageDrawable(getResources().getDrawable(R.drawable.ic_yes_green));
        }else {
            d2.setImageDrawable(getResources().getDrawable(R.drawable.ic_no_red));
        }
    }

    public void Resolve3(){
        int x = Integer.parseInt(a3.getText().toString());
        int y = Integer.parseInt(b3.getText().toString());
        int z = Integer.parseInt(c3.getText().toString());
        if (Summ(x, y, z) == Solution) {
            d3.setImageDrawable(getResources().getDrawable(R.drawable.ic_yes_green));
        }else {
            d3.setImageDrawable(getResources().getDrawable(R.drawable.ic_no_red));
        }
    }

    public void Resolve0(){
        int x = Integer.parseInt(a3.getText().toString());
        int y = Integer.parseInt(b2.getText().toString());
        int z = Integer.parseInt(c1.getText().toString());
        if (Summ(x, y, z) == Solution) {
            d0.setImageDrawable(getResources().getDrawable(R.drawable.ic_yes_green));
        }else {
            d0.setImageDrawable(getResources().getDrawable(R.drawable.ic_no_red));
        }
    }

    public void Resolve4(){
        int x = Integer.parseInt(a1.getText().toString());
        int y = Integer.parseInt(b2.getText().toString());
        int z = Integer.parseInt(c3.getText().toString());
        if (Summ(x, y, z) == Solution) {
            d4.setImageDrawable(getResources().getDrawable(R.drawable.ic_yes_green));
        }else {
            d4.setImageDrawable(getResources().getDrawable(R.drawable.ic_no_red));
        }
    }

    public int Summ (int x, int y, int z){
        int sum =0;

        sum = x+y+z;

        return sum;
    }

    public Boolean ValidInput(){
        if (a1.length() == 0) {
            Toast.makeText(this, "complete all", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (a2.length() == 0) {
            Toast.makeText(this, "complete all", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (a3.length() == 0) {
            Toast.makeText(this, "complete all", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (b1.length() == 0) {
            Toast.makeText(this, "complete all", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (b2.length() == 0) {
            Toast.makeText(this, "complete all", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (b3.length() == 0) {
            Toast.makeText(this, "complete all", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (c1.length() == 0) {
            Toast.makeText(this, "complete all", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (c2.length() == 0) {
            Toast.makeText(this, "complete all", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (c3.length() == 0) {
            Toast.makeText(this, "complete all", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

}
