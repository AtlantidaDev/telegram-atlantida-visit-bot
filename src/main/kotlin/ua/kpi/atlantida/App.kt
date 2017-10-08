package ua.kpi.atlantida

import org.telegram.telegrambots.ApiContextInitializer
import org.telegram.telegrambots.TelegramBotsApi
import org.telegram.telegrambots.exceptions.TelegramApiException

/**
 * Created by vlad on 05.10.17.
 */

fun main(args: Array<String>) {
    ApiContextInitializer.init()
    val botsApi = TelegramBotsApi()
    try {
        botsApi.registerBot(AtlantidaVisitBot())
    } catch (e: TelegramApiException) {
        e.printStackTrace()
    }
}
