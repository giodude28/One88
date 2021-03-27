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

import io.giodude.one888.Adapter.FBPastMatchesAdapter;
import io.giodude.one888.Model.FBPastMatchesModel;
import io.giodude.one888.R;
import io.giodude.one888.ViewModel.FBPastMatchesViewModel;

public class FBPastMatchesView extends Fragment {
private List<FBPastMatchesModel.Event> fbmodel = new ArrayList<>();
private FBPastMatchesAdapter fbPastMatchesAdapter;
private FBPastMatchesViewModel fbPastMatchesViewModel;
public static RecyclerView recyclerView;
    public ProgressBar progressBar;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        view = inflater.inflate(R.layout.activity_f_b_past_matches_view, container, false);
        progressBar = view.findViewById(R.id.progress);
        showPAST();
        return view;
    }

    private void getPAST(List<FBPastMatchesModel.Event> pastmodel){
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        fbPastMatchesAdapter = new FBPastMatchesAdapter(getContext(),pastmodel);
        recyclerView.setAdapter(fbPastMatchesAdapter);
    }

    private void showPAST(){
        fbPastMatchesViewModel = ViewModelProviders.of(FBPastMatchesView.this).get(FBPastMatchesViewModel.class);
        fbPastMatchesViewModel.init();

        fbPastMatchesViewModel.getPast().observe(this, previousEvents -> {
            getPAST(previousEvents);
            fbmodel.addAll(previousEvents);
            fbPastMatchesAdapter.notifyDataSetChanged();
            if(fbmodel.size() == 0)
            {
                progressBar.setVisibility(View.VISIBLE);
            }else{
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
    }

}