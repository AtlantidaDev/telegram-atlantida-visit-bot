package ua.kpi.atlantida.data.properties

/**
 * Created by vlad on 09.10.17.
 */
class TelegramProperties : MyProperties(FILE_NAME) {

    private companion object {
        private val FILE_NAME = "telegram.keys"
        private val PROP_TOKEN = "token"
        private val PROP_USERNAME = "username"
    }

    val token = readProperties(PROP_TOKEN)
    val username = readProperties(PROP_USERNAME)

}