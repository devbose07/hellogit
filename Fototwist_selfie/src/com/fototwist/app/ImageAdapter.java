package com.fototwist.app;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {

	private Activity activity;
	private String[] data;
	private static LayoutInflater inflater=null;
	public ImageLoader imageLoader; 
	public static ArrayList<String> imagelist;
	public ImageAdapter(Activity a, String[] d) {
		activity = a;
		data=d;
		inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		imageLoader=new ImageLoader(activity.getApplicationContext());
	}
	public ImageAdapter(Activity a, String[] d,ArrayList<String> imagelist) {
		activity = a;
		data=d;
		if(imagelist!=null && imagelist.size()>0)
			this.imagelist=imagelist;
		else
			return;
		inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		imageLoader=new ImageLoader(activity.getApplicationContext());
	}
	public int getCount() {
		return data.length;
	}

	public Object getItem(int position) {
		return position;
	}

	public long getItemId(int position) {
		return position;
	}
	public View getView(int position, View convertView, ViewGroup parent) {
		View vi=convertView;
		if(convertView==null)
			vi = inflater.inflate(R.layout.list, null);
try {
	String img_path=imagelist.get(position);
	ImageView image=(ImageView)vi.findViewById(R.id.iv_img);
	imageLoader.DisplayImage(img_path, image);
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
		
		return vi;
	}
}