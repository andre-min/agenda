package com.example.agendaqui

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.agendaqui.databinding.ActivityLoginBinding

class LoginActivity : DebugActivity() {
    private val context: Context get() = this
    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //supportActionBar?.hide()
        setContentView(binding.root)
        binding.cadastro.setOnClickListener {
            onClickCadastro()
        }
        binding.btnEntrar.setOnClickListener {
            onClickEntrar()
        }

    }
    fun onClickCadastro(){
        val intent = Intent(context, CadastroActivity::class.java)
        startActivity(intent)
    }
    fun onClickEntrar(){

        val builder = AlertDialog.Builder(this)
        if (!(binding.editeText1.text.toString().equals("51040561047"))) {
            builder.setTitle("Informações do Login:")
            builder.setMessage("Usuário(a) NÂO Catatrado(a).")
            builder.create()
            builder.show()
        } else if (!(binding.editeText2.text.toString().equals("12345"))) {
            builder.setTitle("Informações do Login:")
            builder.setMessage("Password Inválida.")
            builder.create()
            builder.show()
        } else {
            val intent = Intent(context, HomeActivity2::class.java)
            startActivity(intent)
        }


    }
}

