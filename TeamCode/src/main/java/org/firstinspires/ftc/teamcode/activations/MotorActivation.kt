package org.firstinspires.ftc.teamcode.activations

import com.qualcomm.robotcore.hardware.DcMotor
import kotlin.properties.Delegates


class MotorActivation : Activation{


    private var motorAtivo: Boolean = false // Define se o motor vai iniciar ativo ou nao.
    public lateinit var motor: DcMotor // Motor que vai ser ativado.
    public var forcaAtivada by Delegates.notNull<Double>() // Força que sera aplicada ao motor, quando ele for ativado.
    public var forcateste: Double = 3.0
    fun setaForca(forca: Double) {
        this.forcaAtivada = forca
    }

    fun ativadorDoMotor(motor: DcMotor, forcaAtivada: Double) { // Recebe força do motor
        this.motor = motor
        this.forcaAtivada = forcaAtivada
    }

    override fun setaAtivacao(ativado: Boolean) { // Envia as informaçoes da ativaçao para o motor.
        this.motorAtivo = ativado
        if (ativado == true) {
            motor.power = forcaAtivada
        } else {
            motor.power = 0.0
        }
    }

    override fun retornaAtivacao(): Boolean { // Retorna se o motor esta ativo ou nao.
        return motorAtivo
    }

    override fun ativa() { // Ativa motor
        setaAtivacao(true)
    }

    override fun desativa() { // Desativa motor
        setaAtivacao(false)
    }




}