package com.mmm.whatsapp_kt.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mmm.whatsapp_kt.Adapter.ChatAdapter
import com.mmm.whatsapp_kt.Modelclass.ProfileModel
import com.mmm.whatsapp_kt.R.drawable.*
import com.mmm.whatsapp_kt.databinding.FragmentChatsBinding

class ChatsFragment : Fragment() {


        var image = arrayOf(img1, img2,img3,img4,img5,img6,img7,img8)
        var name = arrayOf("ram","veer","swwwtgirl","minal","raj","payal","carzyteam","boys")

    lateinit var binding : FragmentChatsBinding
    var dataList = ArrayList<ProfileModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatsBinding.inflate(layoutInflater)


        for (i in 0..image.size-1) {
            var data = ProfileModel(image[i], name[i])
            dataList.add(data)
        }

        binding.rcvChatlist.layoutManager = LinearLayoutManager(context)
        binding.rcvChatlist.adapter = ChatAdapter(dataList)

        return binding.root
    }
}