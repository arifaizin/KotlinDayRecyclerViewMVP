package id.hamasah.kotlindaylistmvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import id.hamasah.kotlindayluassegitiga.MainPresenterImp
import id.hamasah.kotlindaymvp.MainView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    lateinit var presenter : MainPresenterImp
    //var data : ArrayList<User>
    lateinit var adapt : UserAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()

        var data = ArrayList<User>()

        recycler.adapter = UserAdapter(data)
        recycler.layoutManager = LinearLayoutManager(this)
    }



    private fun initView() {
        btnTambah.setOnClickListener{
            presenter.addList(ed_nama.text.toString(), ed_alamat.text.toString())
        }

    }

    private fun initPresenter() {
        presenter = MainPresenterImp(this)

    }

    override fun sukses(data: ArrayList<User>) {
        //masukkan adapter
        adapt = UserAdapter(data)
        recycler.adapter = adapt


    }

    override fun gagal(data: ArrayList<User>) {
        Toast.makeText(this, "gagal", Toast.LENGTH_SHORT)
    }
}
