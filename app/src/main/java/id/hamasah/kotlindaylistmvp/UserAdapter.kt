package id.hamasah.kotlindaylistmvp

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_user.view.*

/**
 * Created by idn on 2/17/2018.
 */
class UserAdapter (data : ArrayList<User>) : RecyclerView.Adapter<UserAdapter.MyViewHolder>() {
    // namaclass (namaconstructor : tipe data) : extend

    lateinit var listdata : ArrayList<User>

    init {
        listdata = data
    }


    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        //create member
        holder?.bind(listdata.get(position))
        // change member ArrayList jadi User
    }

    override fun getItemCount(): Int {
        return listdata.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(parent?.context).inflate(R.layout.item_user, parent, false)
        return MyViewHolder(view)
    }

    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bind(listdata: User) {
            itemView.textNama.text = listdata.nama
            itemView.textAlamat.text = listdata.alamat

        }

    }
}