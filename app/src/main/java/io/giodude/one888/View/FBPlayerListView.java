
package io.giodude.one888.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import io.giodude.one888.Adapter.FBPlayerListAdapter;
import io.giodude.one888.Model.FBPlayerListModel;
import io.giodude.one888.R;
import io.giodude.one888.ViewModel.FBPlayerListViewModel;

public class FBPlayerListView extends Fragment {
private FBPlayerListAdapter fbPlayerListAdapter;
private FBPlayerListViewModel fbPlayerListViewModel;
private List<FBPlayerListModel.Datum> fbplModel = new ArrayList<>();
private static RecyclerView recyclerView;
    public ProgressBar progressBar;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        view = inflater.inflate(R.layout.activity_f_b_player_list_view, container, false);
        progressBar = view.findViewById(R.id.progress);
        PlayerList();
        return view;
    }


private void getPLIST(List<FBPlayerListModel.Datum> player){
        recyclerView = view.findViewById(R.id.playerrecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        PagerSnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);
        fbPlayerListAdapter = new FBPlayerListAdapter(getContext(),player);
        recyclerView.setAdapter(fbPlayerListAdapter);
}

private void PlayerList(){
        fbPlayerListViewModel = ViewModelProviders.of(FBPlayerListView.this).get(FBPlayerListViewModel.class);
        fbPlayerListViewModel.init();

        fbPlayerListViewModel.getPlayers().observe(this, data -> {
            getPLIST(data);
            fbplModel.addAll(data);
            fbPlayerListAdapter.notifyDataSetChanged();
            if(fbplModel.size() == 0)
            {
                progressBar.setVisibility(View.VISIBLE);
            }else{
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
}

}