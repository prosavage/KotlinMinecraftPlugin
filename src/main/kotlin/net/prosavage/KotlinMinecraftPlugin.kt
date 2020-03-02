package net.prosavage

import net.prosavage.baseplugin.SavagePlugin
import net.prosavage.persist.Config

class KotlinMinecraftPlugin : SavagePlugin() {

    override fun onEnable() {
        // This needs to be here.
        super.onEnable()
        val logger = super.getLogger()
        logger.info("Enabling the plugin.")
        loadFiles()
    }

    private fun loadFiles() {
        Config.load()
    }

    override fun onDisable() {
        // This needs to be here too.
        super.onDisable()
        saveFiles()
    }

    private fun saveFiles() {
        Config.save()
    }

}