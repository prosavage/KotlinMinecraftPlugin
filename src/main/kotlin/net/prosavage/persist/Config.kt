package net.prosavage.persist

import net.prosavage.baseplugin.serializer.Serializer

object Config {

    @Transient
    private val instance = this





    fun save() {
        Serializer(false).save(instance)
    }

    fun load() {
        Serializer(false).load(instance, Config::class.java, "config")
    }




}