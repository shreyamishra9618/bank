package com.shreya.bank.controller.model

import com.shreya.bank.repository.model.TransactionDBModel
import java.util.*

class OverviewTransactionModel(
    val targetAccount: String,
    val value: Double,
    val description: String,
    val date: Date,
    val id: String
)

fun TransactionDBModel.convertToOverviewTransactionModel() = OverviewTransactionModel(
    targetAccount = this.accountIdentifier,
    value = this.value,
    description = this.description,
    date = this.date,
    id = this.id.toString()
)