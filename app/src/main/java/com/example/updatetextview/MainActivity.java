package com.example.updatetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


//example 1 to update the text
public class MainActivity extends AppCompatActivity {

    //create class

    EditText name;
    Button butttonOk;
    TextView result;
    //String to store the input data
    String username;

    //example 2
    //create clas for image
    ImageView image;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //layout for text update
//        setContentView(R.layout.activity_main);

        //layout for image update
        setContentView(R.layout.image_change_update);
        //define the name , button , and result by there id .

        name = findViewById(R.id.enterUsername);
        butttonOk = findViewById(R.id.showButton);
        result =findViewById(R.id.displayResult);
        //define the image
        image = findViewById(R.id.aa);


        //set click-listener on buttonOK
        butttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //to update image code

                image.setImageResource(R.drawable.b);



//for text update example 1
//                //first we get text and convert into string then store in string name username.
//                username = name.getText().toString();
//                //show the result
//                result.setText(username);
            }
        });
    }
}