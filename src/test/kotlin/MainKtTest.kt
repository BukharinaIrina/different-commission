package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun differentCommission_Visa_minCommission() {
        val transfer = 1_000
        val monthlyTransfers = 10_000
        val account = "Visa"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(35, result)
    }

    @Test
    fun differentCommission_Visa_commission() {
        val transfer = 19_000
        val monthlyTransfers = 10_000
        val account = "Visa"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(142, result)
    }

    @Test
    fun differentCommission_Visa_onetimeLimit() {
        val transfer = 151_000
        val monthlyTransfers = 80_000
        val account = "Visa"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_Visa_monthlyLimit() {
        val transfer = 2_000
        val monthlyTransfers = 599_000
        val account = "Visa"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_Mir_minCommission() {
        val transfer = 3_000
        val monthlyTransfers = 10_000
        val account = "Mir"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(35, result)
    }

    @Test
    fun differentCommission_Mir_commission() {
        val transfer = 11_000
        val monthlyTransfers = 10_000
        val account = "Mir"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(82, result)
    }

    @Test
    fun differentCommission_Mir_onetimeLimit() {
        val transfer = 160_000
        val monthlyTransfers = 80_000
        val account = "Mir"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_Mir_monthlyLimit() {
        val transfer = 30_000
        val monthlyTransfers = 580_000
        val account = "Mir"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_Mastercard_nullCommission() {
        val transfer = 1_000
        val monthlyTransfers = 7_000
        val account = "Mastercard"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_Mastercard_commission() {
        val transfer = 1_000
        val monthlyTransfers = 80_000
        val account = "Mastercard"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(26, result)
    }

    @Test
    fun differentCommission_Mastercard_onetimeLimit() {
        val transfer = 151_000
        val monthlyTransfers = 80_000
        val account = "Mastercard"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_Mastercard_monthlyLimit() {
        val transfer = 2_000
        val monthlyTransfers = 599_000
        val account = "Mastercard"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_Maestro_nullCommission() {
        val transfer = 2_000
        val monthlyTransfers = 50_000
        val account = "Maestro"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_Maestro_commission() {
        val transfer = 2_000
        val monthlyTransfers = 76_000
        val account = "Maestro"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(32, result)
    }

    @Test
    fun differentCommission_Maestro_onetimeLimit() {
        val transfer = 151_000
        val monthlyTransfers = 80_000
        val account = "Maestro"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_Maestro_monthlyLimit() {
        val transfer = 30_000
        val monthlyTransfers = 580_000
        val account = "Maestro"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_VKPay_nullCommission() {
        val transfer = 1_000
        val monthlyTransfers = 10_000
        val account = "VK Pay"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_VKPay_onetimeLimit() {
        val transfer = 16_000
        val monthlyTransfers = 1_000
        val account = "VK Pay"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_VKPay_monthlyLimit() {
        val transfer = 6_000
        val monthlyTransfers = 35_000
        val account = "VK Pay"

        val result =
            differentCommission(transfer = transfer, monthlyTransfers = monthlyTransfers, account = account)

        assertEquals(0, result)
    }

    @Test
    fun differentCommission_byDefault() {
        val transfer = 1_000
        val monthlyTransfers = 400_000
        val account = "Visa"

        val result =
            differentCommission(transfer = transfer)

        assertEquals(0, result)
    }
}

