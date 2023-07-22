package com.doctores.doctores.services

import com.doctores.doctores.domains.request.CreatePatientRequest
import com.doctores.doctores.domains.responses.CreateAppointmentResponse
import com.doctores.doctores.domains.responses.CreatePatientResponse
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class PatientService {

    fun createPatient(request: CreatePatientRequest): CreatePatientResponse{
        return CreatePatientResponse(
            idPaciente = "1",
            nombre = request.nombre,
            apellido = request.apellido,
            identificacion = request.identificacion,
            telefono = request.telefono,
            createAt = Instant.now()
        )
    }

    fun getAllPatients(): List<CreatePatientResponse>{
        var response : List<CreatePatientResponse> = listOf(
            CreatePatientResponse(
                idPaciente = "1",
                nombre = "Test",
                apellido = "Test",
                identificacion = "130554235",
                telefono = 12354812,
                createAt = Instant.now()
            )
        )
        return response
    }

    fun getAppointmentById(id: Long): CreateAppointmentResponse{
        return CreateAppointmentResponse(
            idPaciente = "1",
            especialidad = "Test",
            doctor = "Carlos",
            consultorio = 101,
            horario = "16"
        )
    }

    fun updateAppointment(id: Long): CreateAppointmentResponse{
        return CreateAppointmentResponse(
            idPaciente = "1",
            especialidad = "Test",
            doctor = "Carlos",
            consultorio = 101,
            horario = "16"
        )
    }
}