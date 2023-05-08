package com.example.latihandesaignpattern.View

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.latihandesaignpattern.Model.getAllUserItem
import com.example.latihandesaignpattern.databinding.ItemUserBinding

class UserAdapter (var listUser : List<getAllUserItem>) : RecyclerView.Adapter<UserAdapter.ViewHolder>(){
    class ViewHolder (var binding: ItemUserBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.Nama.text = listUser[position].name
        holder.binding.Umur.text = listUser[position].age.toString()
        holder.binding.Address.text = listUser[position].address
    }

    override fun getItemCount(): Int {
        return listUser.size
    }
}