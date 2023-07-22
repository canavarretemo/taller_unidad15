package com.doctores.doctores.domains.request

import org.jetbrains.annotations.NotNull

data class CreatePatientRequest(
    val nombre: String,
    val apellido: String,
    val identificacion: String,
    val telefono: Int,

)