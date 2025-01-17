package com.example.smartwardrobe.ui;


import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

public class ViewpagerSlide extends ViewPager {
    private boolean isCanScroll=false;

    public void setScanScroll(boolean isCansSroll){
        this.isCanScroll=isCansSroll;
    }
    public ViewpagerSlide(Context context){
        super(context);
    }
    public ViewpagerSlide(Context context, AttributeSet attrs){
        super(context, attrs);
    }
    @Override
    public  void scrollTo(int x,int y){
        super.scrollTo(x,y);
    }
    @Override
    public boolean onTouchEvent(MotionEvent arg0){
        if(isCanScroll){
            return super.onTouchEvent(arg0);
        }else {
            return false;
        }
    }
    @Override
    public void setCurrentItem(int item){
        super.setCurrentItem(item);
    }
    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0){
        if(isCanScroll){
            return super.onInterceptTouchEvent(arg0);
        }else {
            return false;
        }
    }
}

