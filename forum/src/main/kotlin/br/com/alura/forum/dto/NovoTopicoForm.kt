package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class NovoTopicoForm(
    @field:NotEmpty(message = "Título não pode ficar vazia")
    @field:Size(min = 5, max = 100, message = "Título deve ter entre 5 e 100 caracteres")
    val titulo: String,
    @field:NotEmpty(message = "Mensagem não pode ficar vazia") val mensagem: String,
    @field:NotNull val idCurso: Long,
    @field:NotNull val idAutor: Long,
)