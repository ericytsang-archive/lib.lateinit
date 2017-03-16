package com.github.ericytsang.lib.lateinit

class Initializer<InitParams>
{
    internal val initializees = mutableSetOf<InitializeLater<*,*,InitParams>>()
    fun initialize(initParams:InitParams)
    {
        initializees.forEach {it.initBlock(initParams)}
    }
}
