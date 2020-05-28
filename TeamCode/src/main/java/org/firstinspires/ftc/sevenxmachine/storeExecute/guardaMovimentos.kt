package org.firstinspires.ftc.sevenxmachine.storeExecute

class guardaMovimentos {
    var array = arrayOf<Array<Int>>() // Inicializa uma array bi-dimensional

    fun preencheArray(): Array<Array<Int>> {
        for (i in 0..9) {
            var subarray = arrayOf<Int>()
            for (j in 0..3) {
                subarray += 0
            }
            array += subarray
        }
        
        return array
    }
}