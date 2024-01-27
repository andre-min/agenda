package com.example.agendaqui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.agendaqui.databinding.ActivityCadastroBinding

class CadastroActivity : DebugActivity() {

    private val context: Context get() = this
    private val binding by lazy {
        ActivityCadastroBinding.inflate(layoutInflater)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnCadastro.setOnClickListener {
            onClickCadastro()

        }

    }

    fun onClickCadastro(){
        val intent = Intent(context, PerfilActivity::class.java)
        val nome = binding.camNome.text.toString()
        intent.putExtra("nome", nome)
        print(nome)
        val cpf = binding.camCpf.text.toString()
        intent.putExtra("cpf", cpf)
        print(cpf)
        val email = binding.camEmail.text.toString()
        intent.putExtra("email", email)
        print(email)
        val telefone = binding.camTelefone.text.toString()
        intent.putExtra("telefone", telefone)
        print(telefone)
        startActivity(intent)
    }

}