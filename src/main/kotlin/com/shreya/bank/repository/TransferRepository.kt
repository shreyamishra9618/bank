package com.shreya.bank.repository
import com.shreya.bank.repository.model.TransactionDBModel
import org.springframework.data.repository.CrudRepository
import java.util.*


interface TransferRepository : CrudRepository<TransactionDBModel, UUID>