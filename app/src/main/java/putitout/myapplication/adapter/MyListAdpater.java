package putitout.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import putitout.myapplication.R;

/**
 * Created by SA on 10/1/2015.
 */
public class MyListAdpater extends BaseAdapter{

    private Context mContext;
    private ArrayList<String> mData;

    public MyListAdpater(Context context, ArrayList<String> mData) {
        this.mContext = context;
        this.mData = mData;
    }

    @Override
    public int getCount() {
        mData.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

             View row= convertView;

        TextView tv;
if(row==null) {
    LayoutInflater layoutInflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
tv= (TextView) row.findViewById(R.id.textView_list);
}
else{
    tv= (TextView) row.findViewById(R.id.textView_list);

}
tv.setText(mData.get(position));
        return null;
    }
}
