package com.lnt.recyclerview;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class NewAdapter extends RecyclerView.Adapter<NewAdapter.MyViewHolder> {
    ArrayList<String> personNames;
    ArrayList<String> personNames2;
     Integer[] drawableArray;

    Context context;
    public NewAdapter(Context context,ArrayList<String> personNames,ArrayList<String> personNames2,Integer[] drawableArray)
    {
        this.context=context;
        this.personNames=personNames;
        this.personNames2=personNames2;
        this.drawableArray=drawableArray;
    }
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout,parent,false);
        MyViewHolder vh=new MyViewHolder(v);
        return vh;
    }
    public void onBindViewHolder(MyViewHolder holder, final int position){
       // holder.name.setText(personNames.get(position));
        holder.android_name.setText(personNames.get(position));
        holder.android_version.setText(personNames2.get(position));
        holder.imageView.setImageResource(drawableArray[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, personNames.get(position), Toast.LENGTH_SHORT).show();
                Toast.makeText(context, personNames2.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return personNames.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
       // TextView name;
        TextView android_name;
        TextView android_version;
        ImageView imageView;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            //name=(TextView)itemView.findViewById(R.id.textView);
            android_name=(TextView)itemView.findViewById(R.id.textView2);
            android_version=(TextView)itemView.findViewById(R.id.textView3);
            imageView=(ImageView)itemView.findViewById(R.id.imageView2);
        }
    }
}
