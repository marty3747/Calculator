package com.demo.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    /********* Объявление переменных **********/

    Button btnClear;
    TextView tvProcessor, tvResult;

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight,
    btnNine, btnZero;
    String processor;
    Button btnDot, btnDel, btnEqual, btnDivide, btnMultiply, btnMinus, btnPlus;
    Button btnLeftScope, btnRightScope;
    //ключ что бы показать что можно вводить секретную комбинацию (ключ)
    boolean canEnterKey = false;

    int flag = -1;
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClear = (Button) findViewById(R.id.btnClear);
        tvProcessor = (TextView) findViewById(R.id.tv_process);
        tvResult = (TextView) findViewById(R.id.tv_result);

        tvProcessor.setText("");
        tvResult.setText("");

        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnZero = (Button) findViewById(R.id.btnZero);


        btnDot = (Button) findViewById(R.id.btnDot);
        btnEqual = (Button) findViewById(R.id.btn_equal);
        btnDel = (Button) findViewById(R.id.btnDel);
        btnLeftScope = (Button) findViewById(R.id.btnLeftScope);
        btnRightScope = (Button) findViewById(R.id.btnRightScope);


        btnDivide = (Button) findViewById(R.id.btn_divide);
        btnMultiply = (Button) findViewById(R.id.btn_multiply);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnPlus = (Button) findViewById(R.id.btn_plus);


        /***************************************************
         Обработчики на цифры на калькуляторе
         ***************************************************/

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvProcessor.setText("");
                tvResult.setText("");
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = 1;
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = "";
                    tvProcessor.setText("1");
                } else {
                    tvProcessor.setText(processor + "1");
                }
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == 1) {
                    flag = 2;
                } else {
                    flag = -1;
                }
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = "";
                    tvProcessor.setText("2");
                } else {
                    tvProcessor.setText(processor + "2");
                }
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag == 2) {
                    flag = 3;
                } else {
                    flag = -1;
                }
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = "";
                    tvProcessor.setText("3");
                } else {
                    tvProcessor.setText(processor + "3");
                }
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = "";
                    tvProcessor.setText("4");
                } else {
                    tvProcessor.setText(processor + "4");
                }
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = "";
                    tvProcessor.setText("5");
                } else {
                    tvProcessor.setText(processor + "5");
                }
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = "";
                    tvProcessor.setText("6");
                } else {
                    tvProcessor.setText(processor + "6");
                }
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = "";
                    tvProcessor.setText("7");
                } else {
                    tvProcessor.setText(processor + "7");
                }
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = "";
                    tvProcessor.setText("8");
                } else {
                    tvProcessor.setText(processor + "8");
                }
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = "";
                    tvProcessor.setText("9");
                } else {
                    tvProcessor.setText(processor + "9");
                }
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = "";
                    tvProcessor.setText("0");
                } else {
                    tvProcessor.setText(processor + "0");
                }
            }
        });

        /***************************************************
         Обработчики на арифметические операции на калькуляторе
         ***************************************************/
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = res;
                    tvProcessor.setText(processor + "×");
                } else {
                    tvProcessor.setText(processor + "×");
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = res;
                    tvProcessor.setText(processor + "-");
                } else {
                    tvProcessor.setText(processor + "-");
                }
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = res;
                    tvProcessor.setText(processor + "+");
                } else {
                    tvProcessor.setText(processor + "+");
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = res;
                    tvProcessor.setText(processor + "÷");
                } else {
                    tvProcessor.setText(processor + "÷");
                }
            }
        });

        /***************************************************
         Обработчики на функциональные операции на калькуляторе
         ***************************************************/
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + ".");
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();
                if (processor.length() > 0) {
                    processor = processor.substring(0, processor.length()-1);
                    tvProcessor.setText(processor);
                }
            }
        });


        btnLeftScope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = res;
                    tvProcessor.setText(processor + "(");
                } else {
                    tvProcessor.setText(processor + "(");
                }
            }
        });


        btnRightScope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = tvResult.getText().toString();
                processor = tvProcessor.getText().toString();
                if (!res.equals("")) {
                    tvResult.setText("");
                    processor = res;
                    tvProcessor.setText(processor + ")");
                } else {
                    tvProcessor.setText(processor + ")");
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processor = tvProcessor.getText().toString();

                processor = processor.replaceAll("×", "*");
                processor = processor.replaceAll("÷", "/");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String result = "";

                try {
                    Scriptable scope = rhino.initStandardObjects();
                    result = rhino.evaluateString(scope, processor, "JavaScript",1, null).toString();
                } catch (Exception e) {
                    result = "Error";
                }

                if(processor.equals("")) {
                    tvResult.setText("");
                } else {
                    tvResult.setText(result);
                }
            }
        });

        //OnTouchListener для задержки времени при нажатии и тут же создание таймера
        btnEqual.setOnTouchListener(new View.OnTouchListener() {
            long startTime;
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: // нажатие
                        startTime = System.currentTimeMillis();
                        break;
                    case MotionEvent.ACTION_MOVE: // движение
                        break;
                    case MotionEvent.ACTION_UP: // отпускание
                    case MotionEvent.ACTION_CANCEL:

                        long totalTime = System.currentTimeMillis() - startTime;
                        long totalSeconds = totalTime / 1000;

                        if( totalSeconds >= 4 && flag == 3)
                        {
                            Thread timer = new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        for (int i = 0; i < 5; i++) {
                                            Thread.sleep(1000);
                                        }
                                        Intent intent = new Intent(v.getContext(), Main2Activity.class);
                                        startActivity(intent);
                                    } catch (Exception ignored) {

                                    }
                                }
                            });
                            timer.start();
                        }
                        break;
                }
                return false;
            }
        });
    }
}
