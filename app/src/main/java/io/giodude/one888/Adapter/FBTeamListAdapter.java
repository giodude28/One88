package io.giodude.one888.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

import io.giodude.one888.Model.FBTeamListModel;
import io.giodude.one888.R;
import io.giodude.one888.View.FBTeamListView;

public class FBTeamListAdapter extends RecyclerView.Adapter<FBTeamListAdapter.ViewHolder> {
    Context context;
    public List<FBTeamListModel.Datum> data;
    FBTeamListModel.Datum ee;
    TextView name1,loc,gen;
    ImageView img1;
    public FBTeamListAdapter(Context context, List data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public FBTeamListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View item = layoutInflater.inflate(R.layout.teamitem,parent,false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FBTeamListAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(data.get(position));
        ee = data.get(position);
        holder.name.setText(ee.getName());
        Picasso.get().load(ee.getLogo()).into(holder.img, new Callback() {
            @Override
            public void onSuccess() {
                holder.progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                holder.img.setImageResource(R.drawable.ic_launcher_background);
                holder.progressBar.setVisibility(View.GONE);
            }
        });

        final Dialog myDialog;
        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.teamdetails);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        name1 = myDialog.findViewById(R.id.tdname);
        loc = myDialog.findViewById(R.id.tdlocation);
        gen = myDialog.findViewById(R.id.tdgender);
        img1 = myDialog.findViewById(R.id.tdimg);
        for (int i = 0; i<data.size(); i++) {
            if(holder.name.getText()==data.get(position).getName()){
                name1.setText(ee.getName());
                loc.setText(ee.getCountry());
                gen.setText(ee.getGender());
                Picasso.get().load(ee.getLogo()).into(img1);
            }
        }
        holder.itemView.setOnClickListener(v -> myDialog.show());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView img;
        ProgressBar progressBar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            progressBar = itemView.findViewById(R.id.progressicon);
            name = itemView.findViewById(R.id.teamname);
            img = itemView.findViewById(R.id.teamimg);
        }
    }
}
