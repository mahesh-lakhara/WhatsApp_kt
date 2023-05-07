package com.mmm.whatsapp_kt.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mmm.whatsapp_kt.Adapter.FragPageAdapter
import com.mmm.whatsapp_kt.Fragment.CallFragment
import com.mmm.whatsapp_kt.Fragment.ChatsFragment
import com.mmm.whatsapp_kt.Fragment.StatusFragment
import com.mmm.whatsapp_kt.R
import com.mmm.whatsapp_kt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    var item = arrayOf("Chats", "Status", "Calls")
    var fragments = arrayOf(ChatsFragment(), StatusFragment(), CallFragment())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vpFrage.adapter = FragPageAdapter(supportFragmentManager, fragments, item)
        binding.tabitem.setupWithViewPager(binding.vpFrage)
    }
}