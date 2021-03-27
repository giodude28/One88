package io.giodude.one888.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

import io.giodude.one888.Model.FBPlayerListModel;
import io.giodude.one888.R;
import io.giodude.one888.View.FBPlayerListView;

public class FBPlayerListAdapter extends RecyclerView.Adapter<FBPlayerListAdapter.ViewHolder> {
    Context context;
    public List<FBPlayerListModel.Datum> data;
    FBPlayerListModel.Datum ee;

    public FBPlayerListAdapter(Context context, List data) {
        this.context = context;
        this.data = data;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View item = layoutInflater.inflate(R.layout.playeritem,parent,false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setTag(data.get(position));
        ee = data.get(position);
        holder.name.setText(ee.getName());
        holder.age.setText(data.get(position).getAge());
        holder.weight.setText(data.get(position).getWeight());
        holder.height.setText(data.get(position).getHeight());
        holder.bday.setText(data.get(position).getDateBirthAt());
        holder.positions.setText(data.get(position).getPositionName());
        holder.teamname.setText(data.get(position).getMainTeam().getName());
        holder.country.setText(data.get(position).getMainTeam().getCountry());
        Picasso.get().load(ee.getPhoto()).into(holder.photo, new Callback() {
            @Override
            public void onSuccess() {
                holder.progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onError(Exception e) {
                holder.photo.setImageResource(R.drawable.ic_launcher_background);
                holder.progressBar.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,age,loc,weight,height,positions,bday,teamname,country;
        ImageView photo;
        ProgressBar progressBar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            progressBar = itemView.findViewById(R.id.progressicon);
            name = itemView.findViewById(R.id.playerName);
            bday = itemView.findViewById(R.id.playerBirth);
            weight = itemView.findViewById(R.id.playerWeight);
            age = itemView.findViewById(R.id.playerAge);
            height = itemView.findViewById(R.id.playerHeight);
            positions = itemView.findViewById(R.id.playerPosition);
            photo = itemView.findViewById(R.id.playerImage);
            teamname = itemView.findViewById(R.id.attack);
            country = itemView.findViewById(R.id.defend);
        }
    }
}
