package com.example.agendaqui

import android.content.Context

object CEPService {
    var cepOUT = CEP()
    var cep = ""
    val host = "https://viacep.com.br/ws"

//    fun getCEP(context: Context, cepIN: String): CEP{
//        if (AndroididUtils.isInternetDisponivel(context)){
//            val url = "$host/$cepIN/json/"
//            val json = HttpHelper.get(url)
//            return parserJson(json)
//        }
//        else{
//            return cepOUT
//        }
//    }
//    inline fun <reifild T> parserJson(json: String): T{
//        val type = object : TypeToken<T>(){}.type
//        return Gson().fromJson<t>(json, type)
//    }
}