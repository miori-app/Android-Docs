package com.example.firstapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MyListViewAdapter extends BaseAdapter {

    //Data
    private ArrayList<MyListViewItem> data = new ArrayList<MyListViewItem>();

    public MyListViewAdapter() {

    }
    //MyListViewItem[] data;


    public ArrayList<MyListViewItem> getData() {
        return data;
    }

    public void setData(ArrayList<MyListViewItem> data) {
        this.data = data;
    }

    public MyListViewAdapter(ArrayList<MyListViewItem> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        // return data.length
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        //return data[position];
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //bridge 역할

    /**
     * position에 위치한 데이터를 listview_item (xml요소) 을 팽창 (inflate)한 객체에 담아 반환
     * @param position
     * @param convertView : listview ㅑitem 의미
     * @param parent : listview
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //1. 만약 view가 아직 없다면 inflate 시킨다
        if (convertView==null){
            LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item,parent,false);
        }

        // 2. listview item에 포함된 view들 (ex 이미지,text를 변수로 잡기)
        ImageView profilePictureImageView = convertView.findViewById(R.id.profilePicture);
        TextView nameTextView = convertView.findViewById(R.id.name);
        TextView idTextView = convertView.findViewById(R.id.identifier);
        TextView updateTimeTextView = convertView.findViewById(R.id.updateTime);
        TextView tweetTextView = convertView.findViewById(R.id.tweet);

        //3. data item 가져오기
        MyListViewItem item = data.get(position);

        //4.view에 data 반영
        profilePictureImageView.setImageDrawable(item.getProfilePicture());
        nameTextView.setText(item.getName());
        idTextView.setText(item.getIdentifier());
        updateTimeTextView.setText(item.getUpdateTime());
        tweetTextView.setText(item.getTweet());


        return convertView;
    }
}
