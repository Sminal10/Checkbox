package com.example.checkboxview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox pizza,burger,fries;
Button buttonorder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick() {
        pizza = (CheckBox)findViewById(R.id.chkpizza);
        burger = (CheckBox) findViewById(R.id.chkburger);
        fries = (CheckBox) findViewById(R.id.chkFries);
        buttonorder = (Button) findViewById(R.id.btnSubmit);
        buttonorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalamt = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items:");

                if (pizza.isChecked()){
                    result.append("\n Pizza Rs.500");
                    totalamt+=500;
                }

                if (burger.isChecked()){
                    result.append("\n Burger Rs.120");
                    totalamt+=120;
                }

                if (fries.isChecked()){
                    result.append("\n Fries Rs.100");
                    totalamt+=100;
                }
                result.append("\nTotal: Rs."+totalamt);
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}