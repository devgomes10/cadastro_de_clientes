package com.example.cadastrodecontatos.database.dao

import Contato
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ContatoDao {

    @Insert
    fun salvar(contato: Contato): Long

    @Update
    fun atualizar(contato: Contato): Int

    @Delete
    fun excluir(contato: Contato): Int

    @Query("SELECT * FROM tbl_contato WHERE id = :id")
    fun buscarContatoPeloId(id: Long): Contato

    @Query("SELECT * FROM tbl_contato ORDER BY nome ASC")
    fun listarContatos(): List<Contato>
}