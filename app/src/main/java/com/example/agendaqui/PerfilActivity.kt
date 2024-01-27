package com.example.agendaqui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.agendaqui.databinding.ActivityPerfilBinding

class PerfilActivity : DebugActivity() {
    private val context: Context get() = this
    private val binding by lazy {
        ActivityPerfilBinding.inflate(layoutInflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val intent = getIntent()
        val nome = intent.getStringExtra("nome")
        binding.personTxt.text = "Nome: " + nome
        val cpf = intent.getStringExtra("cpf")
        binding.cpfTxt.text = "CPF: " + cpf
        val email = intent.getStringExtra("email")
        binding.emailTxt.text = "E-mail: " + email
        val telefone = intent.getStringExtra("telefone")
        binding.telefoneTxt.text = "Telefone: " + telefone

        binding.btnHome.setOnClickListener {
            onClickHome()
        }
    }
    fun onClickHome() {
        val intent = Intent(context, HomeActivity::class.java)
        startActivity(intent)
    }
}