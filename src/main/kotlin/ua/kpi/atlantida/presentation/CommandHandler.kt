package ua.kpi.atlantida.presentation

import org.telegram.telegrambots.api.objects.Message
import ua.kpi.atlantida.AtlantidaVisitBot
import ua.kpi.atlantida.presentation.command.CommandFactory

/**
 * Created by vlad on 09.10.17.
 */
class CommandHandler(private val message: Message, private val bot: AtlantidaVisitBot): Thread() {

    override fun run() {
        super.run()
        CommandFactory().getCommand(message).execute(message.chatId, bot)
    }
}