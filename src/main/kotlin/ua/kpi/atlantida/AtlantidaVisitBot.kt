package ua.kpi.atlantida

import org.telegram.telegrambots.api.methods.BotApiMethod
import org.telegram.telegrambots.api.objects.Message
import org.telegram.telegrambots.api.objects.Update
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.exceptions.TelegramApiException
import ua.kpi.atlantida.data.properties.TelegramProperties
import ua.kpi.atlantida.presentation.CommandHandler

/**
 * Created by vlad on 09.10.17.
 */
class AtlantidaVisitBot: TelegramLongPollingBot() {

    private val telegramProperties: TelegramProperties = TelegramProperties()

    override fun getBotToken() = telegramProperties.token

    override fun getBotUsername() = telegramProperties.username

    override fun onUpdateReceived(update: Update?) {
        if (update?.hasMessage()!!) {
            CommandHandler(update.message, this).start()
        }
    }

    fun sendReply(message: BotApiMethod<Message>) {
        try {
            sendApiMethod(message)
        } catch (e: TelegramApiException) {
            println("Bot sendReply ex: ${e.printStackTrace()}")
        }
    }

}