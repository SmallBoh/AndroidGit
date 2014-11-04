package com.example.fragment_one;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class MusicFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.music_fragment, null);
		return view;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		TvFragment tv=new TvFragment();
		//tv.setArguments(new Bundle().putString("name", value))ф╝ах?
//		Bundle bundle=getArguments();
//		String name=bundle.getString("name");
//		Toast.makeText(getActivity(), text, duration)
		super.onCreate(savedInstanceState);
	}
}
