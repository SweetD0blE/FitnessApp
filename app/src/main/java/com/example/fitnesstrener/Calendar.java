package com.example.fitnesstrener;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Calendar extends AppCompatActivity {

    // Используем объект CalendarView:
    CalendarView mCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

        // Связываемся с нашим календариком:
        mCalendarView = (CalendarView)findViewById(R.id.calendarView);

        //Настраиваем слушателя смены даты:
        mCalendarView.setOnDateChangeListener(new OnDateChangeListener(){

            // Описываем метод выбора даты в календаре:
            @Override
            public void onSelectedDayChange(CalendarView view, int year,int month, int dayOfMonth) {

                // При выборе любой даты отображаем Toast сообщение с данными о выбранной дате (Год, Месяц, День):
                Toast.makeText(getApplicationContext(),
                        "Год: " + year + "\n" +
                                "Месяц: " + month + "\n" +
                                "День: " + dayOfMonth,
                        Toast.LENGTH_SHORT).show();
            }});
    }
}