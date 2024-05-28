package com.example.ejercicio_ocho

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.HTTP
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface IContact {
    companion object {
        const val url = "http://10.0.2.2:4567"
    }

    @GET("/contactos")
    fun getPersonas(): Call<List<Contact>>

    @PUT("/contacto")
    fun addPersona(@Body contact: Contact): Call<Boolean>

    @POST("/modificar")
    fun modifyPersona(@Body contact: Contact): Call<Boolean>

    @DELETE("/eliminar/{id}")
    fun deletePersona(@Path("id") id: Int): Call<Boolean>

}