package samples.like

import Credentials
import bot.InstagramBot
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking

@ExperimentalCoroutinesApi
fun main() = runBlocking {

    val username = Credentials.USERNAME
    val password = Credentials.PASSWORD

    val bot = InstagramBot()
    bot.prepare(username)
    bot.login(username, password)

    val howManyMediasYouWantToLike = 10

    bot.likeMediasByExplorePage(howManyMediasYouWantToLike).collect { println(it) }
}