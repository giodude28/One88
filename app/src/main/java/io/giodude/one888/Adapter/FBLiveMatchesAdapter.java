package io.giodude.one888.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import io.giodude.one888.Model.FBLiveMatchesModel;
import io.giodude.one888.R;
import io.giodude.one888.View.FBLiveMatchesView;

public class FBLiveMatchesAdapter extends RecyclerView.Adapter<FBLiveMatchesAdapter.ViewHolder> {
    Context context;
    public List<FBLiveMatchesModel.Datum> data;
    FBLiveMatchesModel.Datum ee;
    TextView hname,aname,hscore,ascore,date,sport;
    public FBLiveMatchesAdapter(Context context, List data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View item = layoutInflater.inflate(R.layout.livefbitem,parent,false);
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setTag(data.get(position));
        ee = data.get(position);
        holder.title.setText(ee.getName());
        holder.status.setText(ee.getStatus());
        holder.date.setText(ee.getStartAt());
        holder.statuss.setText(ee.getStatusMore());
        final Dialog myDialog;
        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.livefbdetails);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        hname = myDialog.findViewById(R.id.homes);
        aname = myDialog.findViewById(R.id.aways);
        hscore = myDialog.findViewById(R.id.homescoress);
        ascore = myDialog.findViewById(R.id.awayscores);
        date = myDialog.findViewById(R.id.eventdates);
        sport = myDialog.findViewById(R.id.eventsports);
        for (int i = 0; i<data.size(); i++) {
            if(holder.title.getText()==data.get(position).getName()){
                hname.setText(ee.getHomeTeam().getName());
                aname.setText(ee.getAwayTeam().getName());
                hscore.setText(ee.getHomeScore().getCurrent().toString());
                ascore.setText(ee.getAwayScore().getCurrent().toString());
                date.setText(ee.getStartAt());
                sport.setText(ee.getSport().getName());
            }
        }
        holder.itemView.setOnClickListener(v -> myDialog.show());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title,date,status,statuss;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.eventtitles);
            date = itemView.findViewById(R.id.eventdate);
            status = itemView.findViewById(R.id.eventstatus);
            statuss = itemView.findViewById(R.id.eventstatuss);
        }
    }
}
