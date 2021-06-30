package com.suame.tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.suame.tabs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var whatsAppAdapter: WhatsAppAdapter
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        whatsAppAdapter= WhatsAppAdapter(supportFragmentManager)
        binding.pager.adapter=whatsAppAdapter
        binding.tabLayout.setupWithViewPager(binding.pager)
    }
}