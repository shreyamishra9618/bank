package com.shreya.bank.controller
import java.util.*


import com.shreya.bank.controller.model.TransactionModel
import com.shreya.bank.controller.model.OverviewTransactionModel
import com.shreya.bank.controller.model.convertToDBModel
import com.shreya.bank.controller.model.convertToOverviewTransactionModel
import com.shreya.bank.repository.TransferRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/transfer")
class TransferController(val repository: TransferRepository) {

    @PostMapping("/new")
    fun newTransfer(@RequestBody transactionModel: TransactionModel) {
        repository.save(transactionModel.convertToDBModel())
    }

    @GetMapping("/all")
    fun getAllTransfers(): List<OverviewTransactionModel> {
        return repository.findAll().map { it.convertToOverviewTransactionModel() }
    }

}