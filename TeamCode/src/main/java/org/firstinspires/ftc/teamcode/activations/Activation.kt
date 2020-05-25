package org.firstinspires.ftc.teamcode.activations

interface Activation {

    fun setaAtivacao(activated: Boolean)

    fun retornaAtivacao(): Boolean // Retorna se o hardware, esta ativado ou nao.

    fun ativa() // Tenta ativar o hardware.

    fun desativa() // Tenta desativar o hardware




}