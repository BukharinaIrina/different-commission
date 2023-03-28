package ru.netology

fun main() {
    val commission = differentCommission(1_000, 400_000, "Maestro")
    println("Комиссия составила $commission руб.")
}

fun differentCommission(transfer: Int, monthlyTransfers: Int = 0, account: String = "VK Pay"): Int {
    var commission = 0

    when (account) {
        "Visa", "Mir" -> {
            val onetimeLimitTransfers = 150_000
            val monthlyLimitTransfers = 600_000
            val percent = 0.75
            val minCommission = 35

            if (LimitTransfers(transfer, monthlyTransfers, onetimeLimitTransfers, monthlyLimitTransfers)) {
                commission = (transfer * percent / 100).toInt()
                if (commission <= minCommission) commission = minCommission
                println("Сумма перевода $transfer руб.")
            }
        }

        "Mastercard", "Maestro" -> {
            val onetimeLimitTransfers = 150_000
            val monthlyLimitTransfers = 600_000
            val percent = 0.6
            val monthlyLimit = 75_000

            if (LimitTransfers(transfer, monthlyTransfers, onetimeLimitTransfers, monthlyLimitTransfers)) {
                if (monthlyTransfers > monthlyLimit) commission =
                    (transfer * percent / 100).toInt() + 20 else commission = 0
                println("Сумма перевода $transfer руб.")
            }
        }

        "VK Pay" -> {
            val onetimeLimitTransfers = 15_000
            val monthlyLimitTransfers = 40_000

            if (LimitTransfers(transfer, monthlyTransfers, onetimeLimitTransfers, monthlyLimitTransfers)) {
                commission = 0
                println("Сумма перевода $transfer руб.")
            }
        }
    }
    return commission
}

fun LimitTransfers(
    transfer: Int,
    monthlyTransfers: Int,
    onetimeLimitTransfers: Int,
    monthlyLimitTransfers: Int
): Boolean {
    if (transfer > onetimeLimitTransfers) {
        println("Операция невозможна, превышен лимит на разовый перевод $onetimeLimitTransfers руб.")
        return false
    } else if ((transfer + monthlyTransfers) > monthlyLimitTransfers) {
        println("Операция невозможна, превышен месячный лимит на переводы $monthlyLimitTransfers руб.")
        return false
    } else {
        return true
    }
}