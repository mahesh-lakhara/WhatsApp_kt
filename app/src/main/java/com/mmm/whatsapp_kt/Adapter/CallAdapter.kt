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

class CallAdapter(callslist: ArrayList<ProfileModel>) : RecyclerView.Adapter<CallAdapter.CallsHolder>() {

   var callslist = callslist
   lateinit var context: Context


 class CallsHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    var profile = itemView.findViewById<CircleImageView>(R.id.profile)
    var name = itemView.findViewById<TextView>(R.id.name)

 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallAdapter.CallsHolder {

       context = parent.context
       var View = LayoutInflater.from(parent.context).inflate(R.layout.call_iteam, parent, false)
       return CallsHolder(View)

    }

    override fun getItemCount(): Int {
       return callslist.size

    }

    override fun onBindViewHolder(holder: CallsHolder, position: Int) {

       holder.profile.setImageResource(callslist.get(position).image)
       holder.name.text = callslist.get(position).name

    }


}