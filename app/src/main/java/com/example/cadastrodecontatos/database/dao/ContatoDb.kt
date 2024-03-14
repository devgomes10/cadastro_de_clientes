package com.example.cadastrodecontatos.database.dao

import Contato
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Contato::class],
    version = 1
)

abstract class ContatoDb : RoomDatabase() {

    abstract fun contatoDao(): ContatoDao

    companion object {

        private lateinit var instance: ContatoDb

        fun getDtatbase(context: Context): ContatoDb {
            if (!::instance.isInitialized) {
                instance = Room.databaseBuilder(
                    context, ContatoDb::class.java, "contato_db"
                ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
            }
            return instance
        }
    }
}