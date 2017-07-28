package com.example.mfahad.otp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText t1;
    private EditText t2;
    private EditText t3;
    private EditText t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText) findViewById(R.id.editText);
        t2 = (EditText) findViewById(R.id.editText2);
        t3 = (EditText) findViewById(R.id.editText3);
        t4 = (EditText) findViewById(R.id.editText4);

        //For TextFeild 1
        t1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (t1.getText().length() == 1) {
                    if (t1.getText().toString().contains(" ")) {
                        Toast.makeText(getBaseContext(), "No Spaces Allowed", Toast.LENGTH_LONG).show();
                        t1.setText("");
                    }
                    else {
                        //    t1.setEnabled(false);
                        //                t2.setEnabled(true);
                        t2.requestFocus();
                        //showKeyboard();
                    }
                }
            }
        });

        //For TextFeild 2
        t2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (t2.getText().length() == 1) {
                    if (t2.getText().toString().contains(" ")) {
                        Toast.makeText(getBaseContext(), "No Spaces Allowed", Toast.LENGTH_LONG).show();
                        t2.setText("");
                    } else {
                        t2.clearFocus();
                        t3.requestFocus();
                    }
                }
            }
        });
        t2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_DEL && t2.getText().length() != 1 && event.getAction() == MotionEvent.ACTION_DOWN) {
                    t1.requestFocus();
                }
                if (keyCode == KeyEvent.KEYCODE_DEL && t2.getText().length() == 1 && event.getAction() == MotionEvent.ACTION_DOWN) {
                    t2.setText("");
                }
                return false;
            }
        });

        //For TextFeild 3
        t3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (t3.getText().length() == 1) {
                    if (t3.getText().toString().contains(" ")) {
                        Toast.makeText(getBaseContext(), "No Spaces Allowed", Toast.LENGTH_LONG).show();
                        t3.setText("");
                    } else {
                        t3.clearFocus();
                        t4.requestFocus();
                    }
                }
            }
        });
        t3.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_DEL && t3.getText().length() != 1 && event.getAction() == MotionEvent.ACTION_DOWN) {
                    t2.requestFocus();
                }
                if (keyCode == KeyEvent.KEYCODE_DEL && t3.getText().length() == 1 && event.getAction() == MotionEvent.ACTION_DOWN) {
                    t3.setText("");
                }
                return false;
            }
        });


        t4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (t4.getText().length() == 1 && t3.getText().length() == 1 && t2.getText().length() == 1
                        && t1.getText().length() == 1) {
                    if (t4.getText().toString().contains(" ")) {
                        Toast.makeText(getBaseContext(), "No Spaces Allowed", Toast.LENGTH_LONG).show();
                        t4.setText("");
                    } else {
                        Toast.makeText(MainActivity.this, "Done", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        t4.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_DEL && t4.getText().length() != 1 && event.getAction() == MotionEvent.ACTION_DOWN) {
                    t3.requestFocus();
                }
                if (keyCode == KeyEvent.KEYCODE_DEL && t4.getText().length() == 1 && event.getAction() == MotionEvent.ACTION_DOWN) {
                    t4.setText("");
                }
                return false;
            }
        });


//Focus changes listeners
        t1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    t1.setBackgroundResource(R.drawable.button);
                }
                if(!hasFocus)
                {
                    t1.setBackgroundResource(R.drawable.unselect);
                }
            }
        });
        t2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    t2.setBackgroundResource(R.drawable.button);
                }
                if(!hasFocus)
                {
                    t2.setBackgroundResource(R.drawable.unselect);
                }
            }
        });

        t3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    t3.setBackgroundResource(R.drawable.button);
                }
                if(!hasFocus)
                {
                    t3.setBackgroundResource(R.drawable.unselect);
                }
            }
        });

        t4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    t4.setBackgroundResource(R.drawable.button);
                }
                if(!hasFocus)
                {
                    t4.setBackgroundResource(R.drawable.unselect);
                }
            }
        });
    }

}
