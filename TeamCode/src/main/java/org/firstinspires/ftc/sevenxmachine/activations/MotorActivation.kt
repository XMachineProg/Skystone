package org.firstinspires.ftc.sevenxmachine.activations

import com.qualcomm.robotcore.hardware.DcMotor
import kotlin.properties.Delegates


class MotorActivation : Activation{

    private var motorAtivo: Boolean = false // Define se o motor vai iniciar ativo ou nao.
    public lateinit var motor: DcMotor // Motor que vai ser ativado.
    private var forcaAtivada by Delegates.notNull<Double>() // Força que sera aplicada ao motor, quando ele for ativado.


    fun recebeMotor(motor: DcMotor, forcaAtivada: Double) { // Recebe força do motor
        this.motor = motor
        this.forcaAtivada = forcaAtivada

        // log
    }

    override fun setaAtivacao(ativado: Boolean) { // Envia as informaçoes da ativaçao para o motor.
        this.motorAtivo = ativado
        if (ativado == true) {
            motor.power = forcaAtivada
        } else {
            motor.power = 0.0
        }

        // log
    }

    override fun retornaAtivacao(): Boolean { // Retorna se o motor esta ativo ou nao.

        // log
        return motorAtivo
    }

    override fun ativa() { // Ativa motor
        setaAtivacao(true)
        // log
    }

    override fun desativa() { // Desativa motor
        setaAtivacao(false)
        // log
    }




}