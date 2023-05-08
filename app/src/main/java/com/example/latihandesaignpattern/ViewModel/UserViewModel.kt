package com.example.latihandesaignpattern.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.latihandesaignpattern.Model.getAllUserItem
import com.example.latihandesaignpattern.Network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserViewModel : ViewModel() {
    var liveDataUser: MutableLiveData<List<getAllUserItem>>
    init {
        liveDataUser = MutableLiveData()
    }
    fun getData(){
        //memakai callback yang retrofit
        ApiClient.instance.getUser().enqueue(object : Callback<List<getAllUserItem>> {
            override fun onResponse(
                call: Call<List<getAllUserItem>>,
                response: Response<List<getAllUserItem>>

            ) {
                if (response.isSuccessful){
                    liveDataUser.postValue(response.body())
                }else{
                    liveDataUser.postValue(null)
                }
            }

            override fun onFailure(call: Call<List<getAllUserItem>>, t: Throwable) {
                liveDataUser.postValue(null)
            }

        })
    }
}