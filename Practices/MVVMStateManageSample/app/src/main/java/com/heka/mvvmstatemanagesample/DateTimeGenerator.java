package com.heka.mvvmstatemanagesample;

import static com.heka.mvvmstatemanagesample.Constants.DATE_TIME_FORMAT;

import androidx.lifecycle.ViewModel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeGenerator extends ViewModel{

    private String mDateTime = null;

    public String getData(){
        if (mDateTime == null){
            createData();
        }
        return mDateTime;
    }

    public void createData(){
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_TIME_FORMAT);
        Date date = new Date();
        mDateTime = formatter.format(date);
    }


}