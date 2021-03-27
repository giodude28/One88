package io.giodude.one888.Connection;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

import io.giodude.one888.Model.FBLiveMatchesModel;
import io.giodude.one888.Model.FBPastMatchesModel;
import io.giodude.one888.Model.FBPlayerListModel;
import io.giodude.one888.Model.FBTeamListModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repositories {

    private static Repositories instance;
    static ApiClient rfit = new ApiClient();

    public static Repositories getInstance(){
        if (instance == null){
            instance = new Repositories();
        }
        return instance;
    }


    public MutableLiveData<List<FBPastMatchesModel.Event>> getPASTFB(){
        final MutableLiveData<List<FBPastMatchesModel.Event>> PFBDATA = new MutableLiveData<>();
        Call<FBPastMatchesModel> call = rfit.retrofitBuilder().getPast();
        call.enqueue(new Callback<FBPastMatchesModel>() {
            @Override
            public void onResponse(Call<FBPastMatchesModel> call, Response<FBPastMatchesModel> response) {
             try{
                 FBPastMatchesModel pastList = response.body();
                 List<FBPastMatchesModel.Event> list = pastList.getEvents();
                 PFBDATA.setValue(list);
             }catch (Exception e){
                 Log.d("Data","Null List!");
             }
            }

            @Override
            public void onFailure(Call<FBPastMatchesModel> call, Throwable t) {

            }
        });
        return PFBDATA;
    }

    public MutableLiveData<List<FBLiveMatchesModel.Datum>> getLIVEFB(){
        final MutableLiveData<List<FBLiveMatchesModel.Datum>> LFBDATA = new MutableLiveData<>();
        Call<FBLiveMatchesModel> call = rfit.retrofitBuilderLive().getLive();
        call.enqueue(new Callback<FBLiveMatchesModel>() {
            @Override
            public void onResponse(Call<FBLiveMatchesModel> call, Response<FBLiveMatchesModel> response) {
                try{
                    FBLiveMatchesModel liveList = response.body();
                    List<FBLiveMatchesModel.Datum> live = liveList.getData();
                    LFBDATA.setValue(live);
                }catch (Exception e){
                    Log.d("Data","Null List!");
                }
            }

            @Override
            public void onFailure(Call<FBLiveMatchesModel> call, Throwable t) {

            }
        });
    return LFBDATA;
    }

    public MutableLiveData<List<FBPlayerListModel.Datum>> getPLAYERFB(){
        final MutableLiveData<List<FBPlayerListModel.Datum>> PLDATA = new MutableLiveData<>();
        Call<FBPlayerListModel> call = rfit.retrofitBuilderPlayer().getPlayerList();
        call.enqueue(new Callback<FBPlayerListModel>() {
            @Override
            public void onResponse(Call<FBPlayerListModel> call, Response<FBPlayerListModel> response) {
                try{
                    FBPlayerListModel playerList = response.body();
                    List<FBPlayerListModel.Datum> plist = playerList.getData();
                    PLDATA.setValue(plist);
                }catch (Exception e){

                }
            }

            @Override
            public void onFailure(Call<FBPlayerListModel> call, Throwable t) {

            }
        });
        return PLDATA;
    }

    public MutableLiveData<List<FBTeamListModel.Datum>> getTEAMFB(){
        final  MutableLiveData<List<FBTeamListModel.Datum>> TDATA = new MutableLiveData<>();
        Call<FBTeamListModel> call = rfit.retrofitBuilderTeam().getTeamList();
        call.enqueue(new Callback<FBTeamListModel>() {
            @Override
            public void onResponse(Call<FBTeamListModel> call, Response<FBTeamListModel> response) {
                try {
                    FBTeamListModel teamList = response.body();
                    List<FBTeamListModel.Datum> teams = teamList.getData();
                    TDATA.setValue(teams);
                }catch (Exception e){

                }
            }

            @Override
            public void onFailure(Call<FBTeamListModel> call, Throwable t) {

            }
        });
        return TDATA;
    }
}
