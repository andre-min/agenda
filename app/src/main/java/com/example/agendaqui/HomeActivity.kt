package com.example.agendaqui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import com.example.agendaqui.databinding.ActivityHomeBinding

class HomeActivity : DebugActivity() {
    private val context: Context get() = this
    private val binding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnSAIR.setOnClickListener {
            onClickSair()
        }
    }

    fun onClickSair() {
        val intent = Intent(context, LoginActivity::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_action_bar, menu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        return true
    }
}
