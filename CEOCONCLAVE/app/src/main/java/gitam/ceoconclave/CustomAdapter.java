package gitam.ceoconclave;

/**
 * Created by kamal on 15-09-2017.
 */
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
public class CustomAdapter extends BaseAdapter{
    String [] result;
    String [] details;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public CustomAdapter(MainActivity mainActivity, String[] prgmNameList, int[] prgmImages,String[] detailss) {
        // TODO Auto-generated constructor stub
        details=detailss;
        result=prgmNameList;
        context=mainActivity;
        imageId=prgmImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public CustomAdapter(Context contexts, String[] names, int[] photos,String[] detailss) {
        details=detailss;

        result=names;
        context=contexts;
        imageId=photos;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.mylist, null);
        holder.tv=(TextView) rowView.findViewById(R.id.Itemname);
        holder.img=(ImageView) rowView.findViewById(R.id.icon);
        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);

        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                AlertDialog alertDialog = new AlertDialog.Builder(context).create();

                LinearLayout ll=new LinearLayout(context);
                ll.setPadding(20,20,20,20);
                ll.setOrientation(LinearLayout.VERTICAL);
                TextView l=new TextView(context);
                l.setText(details[position]);
                ScrollView sv=new ScrollView(context);
                sv.addView(l);
               ll.addView(sv);

                alertDialog.setView(ll);

                alertDialog.show();

            }
        });
        return rowView;
    }

}