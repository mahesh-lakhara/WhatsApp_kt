package com.mmm.whatsapp_kt.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mmm.whatsapp_kt.Adapter.ChatAdapter
import com.mmm.whatsapp_kt.Adapter.StatusAdapter
import com.mmm.whatsapp_kt.Modelclass.ProfileModel
import com.mmm.whatsapp_kt.R
import com.mmm.whatsapp_kt.databinding.FragmentStatusBinding


class StatusFragment : Fragment() {

    var image = arrayOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8
    )
    var name = arrayOf("ram","veer","swwwtgirl","minal","raj","payal","carzyteam","boys")
    lateinit var binding : FragmentStatusBinding
    var userlist = ArrayList<ProfileModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStatusBinding.inflate(layoutInflater)


        for (i in 0..image.size-1) {
            var data = ProfileModel(image[i], name[i])
            userlist.add(data)
        }

        binding.rcvstatuslist.layoutManager = LinearLayoutManager(context)
        binding.rcvstatuslist.adapter = ChatAdapter(userlist)

        return binding.root

    }


}