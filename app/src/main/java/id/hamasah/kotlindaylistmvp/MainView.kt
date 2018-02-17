package id.hamasah.kotlindaymvp

import id.hamasah.kotlindaylistmvp.User

/**
 * Created by idn on 2/17/2018.
 */
interface MainView {
    fun sukses(data : ArrayList<User>)

    fun gagal(data : ArrayList<User>)
}