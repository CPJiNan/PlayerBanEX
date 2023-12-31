package com.github.cpjinan.plugin.playerbanex

import com.github.cpjinan.plugin.playerbanex.internal.manager.DebugManager
import com.github.cpjinan.plugin.playerbanex.internal.module.RegisterModule
import taboolib.common.platform.Plugin

object PlayerBanEX : Plugin() {

    override fun onEnable() {
        DebugManager.logoPrint()
        RegisterModule.registerAll()
    }
}