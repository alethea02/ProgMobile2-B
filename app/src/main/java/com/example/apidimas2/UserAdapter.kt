package com.example.apidimas2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import com.example.apidimas2.model.DataItem

class UserAdapter(private val users: MutableList<DataItem>) :
    RecyclerView.Adapter<UserAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_user, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val user = users[position]

        Glide.with(holder.itemView.context)
            .load(user.gambar)
            .apply(RequestOptions().override(80, 80).placeholder(R.drawable.dimas))
            .transform(CircleCrop())
            .into(holder.ivAvatar)

        holder.tvUserName.text = "${user.namaDepan} ${user.namaBelakang}"
        holder.tvEmail.text = user.email
        holder.tvAlamat.text = user.alamat
    }

    fun addData(dataArray: List<DataItem>) {
        users.addAll(dataArray)
        notifyDataSetChanged()
    }

    fun addUser(newUser: DataItem) {
        users.add(newUser)
        notifyItemInserted(users.size - 1)
    }

    fun clear() {
        users.clear()
        notifyDataSetChanged()
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvUserName: TextView = itemView.findViewById(R.id.itemName)
        var tvEmail: TextView = itemView.findViewById(R.id.itemEmail)
        var ivAvatar: ImageView = itemView.findViewById(R.id.itemAvatar)
        var tvAlamat: TextView = itemView.findViewById(R.id.itemAlamat)
    }
}

