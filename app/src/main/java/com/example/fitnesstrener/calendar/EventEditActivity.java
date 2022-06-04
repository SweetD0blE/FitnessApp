package com.example.fitnesstrener.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fitnesstrener.R;

import java.time.LocalTime;

public class EventEditActivity extends AppCompatActivity {

    private EditText eventNameET;
    private TextView eventDateTV, eventTimeTV;

    private LocalTime time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_edit);
        initWidgets();
        time = LocalTime.now();
        eventDateTV.setText("Дата: " + CalendarUtils.formattedDate(CalendarUtils.selectedDate));
        eventTimeTV.setText("Время: " + CalendarUtils.formattedTime(time));

    }

    private void initWidgets() {

        eventNameET = findViewById(R.id.eventNameET);
        eventDateTV = findViewById(R.id.eventDateTV);
        eventTimeTV = findViewById(R.id.eventTimeTV);
    }


    public void saveEventAction(View view) {

        String eventName = eventNameET.getText().toString();
        Event newEvent = new Event(eventName,CalendarUtils.selectedDate,time);
        Event.eventsList.add(newEvent);

        if(eventName.isEmpty()){
            eventNameET.setError("Введите упражнение");
            return;
        }
        finish();
    }
}