package com.jakting.duolingo.hook

import com.github.kyuubiran.ezxhelper.utils.findMethod
import com.github.kyuubiran.ezxhelper.utils.hookAfter

object TimeZoneHook : BaseHook() {
    override fun init() {
        // Example for findMethod
        findMethod("java.util.TimeZone") {
            name == "getID"
        }.hookAfter {
            it.result = "Asia/Taipei"
        }

    }
}