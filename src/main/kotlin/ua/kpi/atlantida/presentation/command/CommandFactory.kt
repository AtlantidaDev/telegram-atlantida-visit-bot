package ua.kpi.atlantida.presentation.command

import org.telegram.telegrambots.api.objects.Message
import ua.kpi.atlantida.AtlantidaVisitBot
import ua.kpi.atlantida.presentation.command.impl.*
/**
 * Created by vlad on 09.10.17.
 */
class CommandFactory {

    fun getCommand(message: Message): Command =
            if (message.hasText()) {
                val text = message.text
                when {
                    text.contains("/admin", true) -> AdminCommand(text)
                    text.equals("/help", true) -> HelpCommand()
                    text.equals("/results", true) -> ResultsCommand()
                    text.equals("/start", true) -> StartCommand()
                    text.contains("/training", true) -> TrainingCommand(text)
                    else -> ErrorCommand("Bot error: unknown command")
                }
            } else ErrorCommand("Bot error: message not contains text")

}

