package com.example.agendaqui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.agendaqui.R
import com.example.agendaqui.model.Empresa


class AdapterEmpresa(private val context: Context, private val empresas: MutableList<Empresa>)
    : RecyclerView.Adapter<AdapterEmpresa.EmpresaViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmpresaViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.empresas_item, parent, false)
        val holder = EmpresaViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: EmpresaViewHolder, position: Int) {
        holder.foto.setImageResource(empresas[position].foto)
        holder.nome.text = empresas[position].nome
        holder.descricao.text = empresas[position].descricao
    }

    override fun getItemCount(): Int = empresas.size

    inner class EmpresaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.salao)
        val nome = itemView.findViewById<TextView>(R.id.txt_salao)
        val descricao = itemView.findViewById<TextView>(R.id.descricao_salao)
    }
}