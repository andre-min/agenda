package com.example.agendaqui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.agendaqui.adapter.AdapterEmpresa
import com.example.agendaqui.model.Empresa

class HomeActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val recyclerView_produtos = findViewById<RecyclerView>(R.id.recyclerView_produtos)

        //(contex: this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView_produtos.layoutManager = LinearLayoutManager(this) //(default vertical)
        recyclerView_produtos.setHasFixedSize(true) // Função para dar mais desempenho para lista

        //Configurar o Adapter
        val listaEmpresas: MutableList<Empresa> = mutableListOf()
        val adapterEmpresa = AdapterEmpresa(this, listaEmpresas)
        recyclerView_produtos.adapter = adapterEmpresa
        val empresa1 = Empresa(
            R.drawable.ic_salao,
            "Espaço Beleza",
            "Temos uma novidade para você! A partir deste mês, você vai conseguir ficar ainda mais relaxado com o Espaço Beleza. "

        )
        listaEmpresas.add(empresa1)
        val empresa2 = Empresa(
            R.drawable.ic_fisio,
            "Espaço Movimento",
            "Muito além dos \"choquinhos\". Atuamos nas Lombalgias, Tendinites, etc..."
        )
        listaEmpresas.add(empresa2)
        val empresa3 = Empresa(
            R.drawable.ic_mecanic,
            "Auto Center",
            "Precisa fazer uma revisão? Aqui é o melhor lugar! Investigamos todo o seu carro. Venha nos visitar!"
        )
        listaEmpresas.add(empresa3)

        val empresa4 = Empresa(
            R.drawable.ic_restaurante,
            "Restaurante Agendaqui",
            "Comer bem não precisa ser caro! Venha conhecer Restaurante Agendaqui e tenha o melhor experiência gastronômica."
        )
        listaEmpresas.add(empresa4)

        val empresa5 = Empresa(
            R.drawable.ic_musculacao,
            "Geração Saúde",
            "Geração Saúde é a melhor escolha que você fez! Geração Saúde cuida de você!"
        )
        listaEmpresas.add(empresa5)
    }
}