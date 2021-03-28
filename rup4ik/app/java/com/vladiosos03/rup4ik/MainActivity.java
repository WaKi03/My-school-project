package com.vladiosos03.rup4ik;

import android.app.*;
import android.content.DialogInterface;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    TextView resultField; // текстовое поле для вывода результата
    EditText aField;   // поле для ввода числа
    EditText timeField;    // текстовое поле для вывода знака операции
    EditText vField;
    Double operand = null;  // операнд операции
    String lastOperation = "="; // последняя операция
    Button closeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // получаем все поля по id из main.xml
        resultField = (TextView) findViewById(R.id.sText);//результат в графе s =
        aField = (EditText) findViewById(R.id.aText);//ввод данныз в поле a =
        timeField = (EditText) findViewById(R.id.tText); //ввод данныз в поле t =
        vField = (EditText) findViewById(R.id.vText);//ввод данныз в поле v =
        // Инициализация^^^^^

        Button closeButton;
        closeButton = (Button) findViewById(R.id.button);
        // создаем обработчик нажатия
        View.OnClickListener closeButtonListener = v -> finish();
        closeButton.setOnClickListener(closeButtonListener);
        }
}
