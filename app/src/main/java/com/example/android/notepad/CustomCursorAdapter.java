package com.example.android.notepad;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CustomCursorAdapter extends SimpleCursorAdapter {
boolean light;
    public CustomCursorAdapter(Context context, int layout, Cursor c, String[] from, int[] to,boolean isLight) {
        super(context, layout, c, from, to);
        this.light=isLight;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        // Call the superclass to bind the title
        super.bindView(view, context, cursor);
// 获取每行的 TextView
        TextView titleView1 = (TextView) view.findViewById(R.id.text1);
        TextView timestampView1 = (TextView) view.findViewById(R.id.timestamp_view);
        TextView note = (TextView) view.findViewById(R.id.note);

        // 根据主题设置背景和文本颜色
        if (light) { // 假设有一个变量 isLightTheme 来表示当前主题
            titleView1.setBackgroundColor(context.getResources().getColor(R.color.white));
            titleView1.setTextColor(context.getResources().getColor(R.color.black));
            timestampView1.setBackgroundColor(context.getResources().getColor(R.color.white));
            timestampView1.setTextColor(context.getResources().getColor(R.color.black));
            //note.setBackgroundColor(context.getResources().getColor(R.color.white));
            //note.setTextColor(context.getResources().getColor(R.color.black));
        } else {
            // 设置暗主题的颜色
            titleView1.setBackgroundColor(context.getResources().getColor(R.color.black));
            titleView1.setTextColor(context.getResources().getColor(R.color.white));
            timestampView1.setBackgroundColor(context.getResources().getColor(R.color.black));
            timestampView1.setTextColor(context.getResources().getColor(R.color.white));
            //note.setBackgroundColor(context.getResources().getColor(R.color.black));
            //note.setTextColor(context.getResources().getColor(R.color.white));
        }

        // 获取标题
        String title = cursor.getString(cursor.getColumnIndex(NotePad.Notes.COLUMN_NAME_TITLE));

        // 找到对应的 TextView
        TextView titleView = (TextView) view.findViewById(R.id.text1);  // 使用新创建的 ID

        // 设置标题
        titleView.setText(title);

        // Get the timestamp for the modification date
        long timestamp = cursor.getLong(cursor.getColumnIndex(NotePad.Notes.COLUMN_NAME_MODIFICATION_DATE));

        // Format the timestamp
        String formattedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(timestamp));

        // Get the TextView for the timestamp and set the formatted date
        TextView timestampView = (TextView) view.findViewById(R.id.timestamp_view);
        timestampView.setText(formattedDate);
    }
}
