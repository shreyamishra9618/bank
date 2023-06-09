package com.shreya.bank.controller.model
import com.shreya.bank.repository.model.TransactionDBModel
class TransactionModel(
    val targetAccount: String,
    val value: Double,
    val description: String = "",
)

fun TransactionModel.convertToDBModel() = TransactionDBModel(
    accountIdentifier = this.targetAccount,
    value = this.value,
    description = this.description
)