package com.example.cadastrodecontatos.database.repository

import Contato
import android.content.Context
import com.example.cadastrodecontatos.database.dao.ContatoDb

class ContatoRepository(context: Context) {

    var db = ContatoDb.getDtatbase(context).contatoDao()

    fun salvar(contato: Contato): Long {
        return db.salvar(contato = contato)
    }

    fun atualziar(contato: Contato): Int {
        return db.atualizar(contato = contato)
    }

    fun excluir(contato: Contato): Int {
        return db.excluir(contato = contato)
    }

    fun buscarContatoPeloId(id: Long): Contato {
        return db.buscarContatoPeloId(id = id)
    }

    fun listarContatos(): List<Contato> {
        return db.listarContatos()
    }
}