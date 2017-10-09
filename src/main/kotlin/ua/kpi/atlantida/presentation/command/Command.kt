package ua.kpi.atlantida.presentation.command

import ua.kpi.atlantida.AtlantidaVisitBot

/**
 * Created by vlad on 09.10.17.
 */
interface Command {

    fun execute(chatId: Long, bot: AtlantidaVisitBot)

}