package com.shreya.bank.repository.model

import jakarta.persistence.Id
import java.util.*
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue


@Entity
class TransactionDBModel(
    val accountIdentifier: String,
    val value: Double,
    val description: String = "",
) {
    @Id
    @GeneratedValue
    var id: UUID? = null
        private set

    val date: Date = Date()
}