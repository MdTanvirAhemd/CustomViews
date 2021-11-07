package com.ahmed.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyFirstCustomView extends FrameLayout {

    Button btn;

    View.OnClickListener onButtonClickListener;

    public MyFirstCustomView(@NonNull Context context) {
        super(context);
        init();
    }

    public MyFirstCustomView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyFirstCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public MyFirstCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init() {

        View view =  LayoutInflater.from(getContext()).inflate(R.layout.my_view,this);

        btn = view.findViewById(R.id.some_btn);

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (onButtonClickListener!=null) {
                    onButtonClickListener.onClick(view);
                }

            }
        });

    }

    public void setOnButtonClickListener(OnClickListener onButtonClickListener) {
        this.onButtonClickListener = onButtonClickListener;
    }


}
