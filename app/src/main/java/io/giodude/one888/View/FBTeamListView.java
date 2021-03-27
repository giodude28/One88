package io.giodude.one888.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import io.giodude.one888.Adapter.FBTeamListAdapter;
import io.giodude.one888.Model.FBTeamListModel;
import io.giodude.one888.R;
import io.giodude.one888.ViewModel.FBTeamListViewModel;

public class FBTeamListView extends Fragment {
private FBTeamListAdapter fbTeamListAdapter;
private FBTeamListViewModel fbTeamListViewModel;
private List<FBTeamListModel.Datum> fbtlModel = new ArrayList<>();
private static RecyclerView recyclerView;
    public ProgressBar progressBar;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        view = inflater.inflate(R.layout.activity_f_b_team_list_view, container, false);
        progressBar = view.findViewById(R.id.progress);
        teamLIST();
        return view;
    }

private void getTEAMLIST(List<FBTeamListModel.Datum> teamlist){
        recyclerView = view.findViewById(R.id.teamrecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        fbTeamListAdapter = new FBTeamListAdapter(getContext(),teamlist);
        recyclerView.setAdapter(fbTeamListAdapter);
}

private void teamLIST(){
        fbTeamListViewModel = ViewModelProviders.of(FBTeamListView.this).get(FBTeamListViewModel.class);
        fbTeamListViewModel.init();

        fbTeamListViewModel.getTEAMS().observe(this, data -> {
            getTEAMLIST(data);
            fbtlModel.addAll(data);
            fbTeamListAdapter.notifyDataSetChanged();
            if(fbtlModel.size() == 0)
            {
                progressBar.setVisibility(View.VISIBLE);
            }else{
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
}


}