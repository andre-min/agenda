package com.example.agendaqui

import java.io.Serializable

class CEP {
    private val cep: String? = null
    private val logradouro: String? = null
    private val complemento: String? = null
    private val bairro: String? = null
    private val localidade: String? = null
    private val uf: String? = null
    private val ibge: String? = null
    private val gia: String? = null
    private val ddd: String? = null
    private val siafi: String? = null

    override fun toString(): String {
        return "CEP: $cep"+
                "\nLogradouro: $logradouro"+
                "\nComplemento: $complemento"+
                "\nBairro: $bairro"+
                "\nLocalidade: $localidade"+
                "\nUF: $uf"+
                "\nIBGE: $ibge"+
                "\nGIA: $gia"+
                "\nDDD: $ddd"+
                "\nSIAFI: $siafi"

    }

}