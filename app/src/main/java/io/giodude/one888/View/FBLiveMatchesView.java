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

import io.giodude.one888.Adapter.FBLiveMatchesAdapter;
import io.giodude.one888.Model.FBLiveMatchesModel;
import io.giodude.one888.R;
import io.giodude.one888.ViewModel.FBLiveMatchesViewModel;

public class FBLiveMatchesView extends Fragment {
private FBLiveMatchesAdapter fbLiveMatchesAdapter;
private FBLiveMatchesViewModel fbLiveMatchesViewModel;
private List<FBLiveMatchesModel.Datum> fblModel = new ArrayList<>();
private RecyclerView recyclerView;
    public ProgressBar progressBar;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        view = inflater.inflate(R.layout.activity_f_b_live_matches_view, container, false);
        progressBar = view.findViewById(R.id.progress);
        livematches();
        return view;
    }

    private void getFBLIVE(List<FBLiveMatchesModel.Datum> lmodel){
        recyclerView = view.findViewById(R.id.livefbrecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        fbLiveMatchesAdapter = new FBLiveMatchesAdapter(getContext(),lmodel);
        recyclerView.setAdapter(fbLiveMatchesAdapter);
    }

    private void livematches(){
        fbLiveMatchesViewModel = ViewModelProviders.of(FBLiveMatchesView.this).get(FBLiveMatchesViewModel.class);
        fbLiveMatchesViewModel.init();
        fbLiveMatchesViewModel.getlive().observe(this, data -> {
            getFBLIVE(data);
            fblModel.addAll(data);
            fbLiveMatchesAdapter.notifyDataSetChanged();
            if(fblModel.size() == 0)
            {
                progressBar.setVisibility(View.VISIBLE);
            }else{
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
    }
}