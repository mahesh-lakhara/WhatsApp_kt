package com.mmm.whatsapp_kt.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mmm.whatsapp_kt.Adapter.CallAdapter
import com.mmm.whatsapp_kt.Modelclass.ProfileModel
import com.mmm.whatsapp_kt.R.drawable.*
import com.mmm.whatsapp_kt.databinding.FragmentCallBinding

class CallFragment : Fragment() {


    var image = arrayOf(img1,img2,img3,img4,img5,img6,img7,img8)

    var name = arrayOf("ram","veer","swwwtgirl","minal","raj","payal","carzyteam","boys")

    lateinit var binding : FragmentCallBinding
    var callslist = ArrayList<ProfileModel>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentCallBinding.inflate(layoutInflater)


        for (i in 0..image.size-1) {
            var data = ProfileModel(image[i], name[i])
            callslist.add(data)
        }

        binding.rcvCalllist.layoutManager = LinearLayoutManager(context)
        binding.rcvCalllist.adapter = CallAdapter(callslist)

        return binding.root
    }

}