package com.mmm.whatsapp_kt.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mmm.whatsapp_kt.Modelclass.ProfileModel
import com.mmm.whatsapp_kt.R
import de.hdodenhof.circleimageview.CircleImageView

class StatusAdapter(userlist: ArrayList<ProfileModel>) : RecyclerView.Adapter<StatusAdapter.statusHolder>() {

    var userlist = userlist
    lateinit var context: Context


    class statusHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var image = itemView.findViewById<CircleImageView>(R.id.profile)
        var name = itemView.findViewById<TextView>(R.id.name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusAdapter.statusHolder {

        context = parent.context
        var View = LayoutInflater.from(parent.context).inflate(R.layout.status, parent, false)
        return statusHolder(View)
    }

    override fun getItemCount(): Int {

        return userlist.size

    }

    override fun onBindViewHolder(holder: statusHolder, position: Int) {

        holder.image.setImageResource(userlist.get(position).image)
        holder.name.text = userlist.get(position).name

    }


}