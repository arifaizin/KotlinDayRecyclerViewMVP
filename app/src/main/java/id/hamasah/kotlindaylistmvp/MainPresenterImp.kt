package id.hamasah.kotlindayluassegitiga

import id.hamasah.kotlindaylistmvp.User
import id.hamasah.kotlindaymvp.MainPresenter
import id.hamasah.kotlindaymvp.MainView

/**
 * Created by idn on 2/17/2018.
 */
class MainPresenterImp : MainPresenter{


    var mainView : MainView? = null
    var data : ArrayList<User>? = null


    constructor(mainView: MainView?) {
        this.mainView = mainView
        data = ArrayList()
    }
    override fun addList(nama: String, alamat: String) {
        var model = User(nama, alamat)
        data?.add(model)

        mainView?.sukses(data!!)
    }
}