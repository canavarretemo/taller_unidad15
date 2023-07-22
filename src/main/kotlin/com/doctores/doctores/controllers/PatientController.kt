package com.doctores.doctores.controllers
import com.doctores.doctores.constants.*
import com.doctores.doctores.domains.responses.CreatePatientResponse
import com.doctores.doctores.domains.responses.HealthCheckResponse
import com.doctores.doctores.services.PatientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import  org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping

@RestController
class PatientController{
    @Autowired
    private lateinit var patientService: PatientService
    @GetMapping(Patient)
    fun getAllPatients(): List<CreatePatientResponse> = patientService.getAllPatients()
    @PostMapping(CreatePatients)
    fun createPatient(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @GetMapping(GetPatientById)
    fun getPatienttById(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
    @PutMapping(UpdatePatient)
    fun updatePatient(): ResponseEntity<HealthCheckResponse> = ResponseEntity(HealthCheckResponse(), HttpStatus.OK)
}