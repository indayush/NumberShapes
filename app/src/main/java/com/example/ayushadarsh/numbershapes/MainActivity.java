package com.example.ayushadarsh.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{

        int number;

        public boolean isSquare(){

            double squareRoot = Math.sqrt(number);

            if((squareRoot == Math.floor(squareRoot))){

                return true;

            }else {

                return false;

            }



        }

        public boolean isTriangular(){

            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < number){

                x++;

                triangularNumber = triangularNumber + x;

            }

            if(triangularNumber == number){

                return true;
            }else {

                return false;
            }
        }


    }

    public void testNumber(View view){

        EditText editText = (EditText)findViewById(R.id.editText);

        String message;

        if (editText.getText().toString().isEmpty()){

            message = "Enter a Number first";
        }else {

            Number myNumber = new Number();

            //myNumber.number = 6;

            //System.out.println(myNumber.isTriangular());

            //System.out.println(myNumber.isSquare());

            myNumber.number = Integer.parseInt(editText.getText().toString());

            message = editText.getText().toString();

            if (myNumber.isSquare() && myNumber.isTriangular()) {

                message += " is both Square & Triangular Number.";

            } else if (myNumber.isSquare()) {

                message += " is Square Number.";

            } else if (myNumber.isTriangular()) {

                message += " is Triangular Number.";

            } else {

                message += " is neither Triangular or Square Number.";

            }
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

        Log.i("Item","Button Pressed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
