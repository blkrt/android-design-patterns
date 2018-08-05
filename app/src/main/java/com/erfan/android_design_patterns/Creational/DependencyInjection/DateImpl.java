package com.erfan.android_design_patterns.Creational.DependencyInjection;

/**
 * Created by erfanblkrt on 8/5/2018.
 */
import java.util.Date;

public class DateImpl implements IDate {

    private long mDate;

    DateImpl(){
        mDate = new Date().getTime();
    }

    @Override
    public long getDate() {
        return mDate;
    }
}
