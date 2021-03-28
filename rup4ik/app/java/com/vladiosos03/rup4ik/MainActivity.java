package com.vladiosos03.rup4ik;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    TextView resultField; // текстовое поле для вывода результата
    EditText aField;   // поле для ввода ускорения
    EditText timeField;    // текстовое поле для ввода значения времени
    EditText vField;    //текстговое поле для ввода значения начальной скорости

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // получаем все поля по id из main.xml
        resultField = (TextView) findViewById(R.id.sText);//результат в графе s =
        aField = (EditText) findViewById(R.id.aText);//ввод данныз в поле a =
        timeField = (EditText) findViewById(R.id.tText); //ввод данныз в поле t =
        vField = (EditText) findViewById(R.id.vText);//ввод данныз в поле v =
        // Инициализация^^^^^

        Button closeButton;
        closeButton = (Button) findViewById(R.id.button2);
        // создаем обработчик нажатия
        View.OnClickListener closeButtonListener = v ->   Toast.makeText(this, "не выходите из приложения, пожалуйста", Toast.LENGTH_LONG).show();;
        closeButton.setOnClickListener(closeButtonListener);
        }
}
