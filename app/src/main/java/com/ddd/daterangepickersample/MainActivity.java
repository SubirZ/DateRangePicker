package com.ddd.daterangepickersample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ddd.daterangepicker.DateRangePicker;

/**
 * Created by S.C. on 13/06/18.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        final Button btn = findViewById(R.id.btnShowCalendar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initDateRangePicker();
            }
        });

    }

    private void initDateRangePicker() {
        final DateRangePicker dateRangePicker = new DateRangePicker(this, new DateRangePicker.OnCalenderClickListener() {
            @Override
            public void onDateSelected(String selectedStartDate, String selectedEndDate) {
                final TextView textView = findViewById(R.id.tvText);
                textView.setText(selectedStartDate + ", " + selectedEndDate);
            }
        });
        dateRangePicker.show();
        dateRangePicker.setBtnPositiveText("apply");
        dateRangePicker.setBtnNegativeText("nope");
    }
}