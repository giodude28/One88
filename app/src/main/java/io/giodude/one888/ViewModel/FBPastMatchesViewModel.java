package io.giodude.one888.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import io.giodude.one888.Connection.Repositories;
import io.giodude.one888.Model.FBPastMatchesModel;

public class FBPastMatchesViewModel extends ViewModel {

    private MutableLiveData<List<FBPastMatchesModel.Event>> past;
    public Repositories repositories;

    public void init(){
        if (past != null){
            return;
        }
        repositories = Repositories.getInstance();
        past = repositories.getPASTFB();
    }

    public LiveData<List<FBPastMatchesModel.Event>> getPast(){
        return past;
    }
}
