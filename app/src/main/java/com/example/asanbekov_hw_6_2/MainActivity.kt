package com.example.asanbekov_hw_6_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asanbekov_hw_6_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var list: ArrayList<Photo> = ArrayList()
    private var selectedList: ArrayList<Photo> = ArrayList()
    private lateinit var adapter: PhotoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadData()
        initAdapter()
    }

    private fun initAdapter() {
        adapter = PhotoAdapter(list, this::clickListener, this::deleteItem)
        binding.recyclerView.adapter = adapter
    }

    private fun clickListener(item: Photo) {
        //intent.putExtra(MA_SA, selectedList)
        selectedList.add(item)
    }

    private fun deleteItem(item: Photo) {
        selectedList.remove(item)
    }

    private fun loadData() {
        list.add(Photo("https://i.pinimg.com/originals/cc/ce/35/ccce355cc6f83a3b12ac4e752c795e69.jpg"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqHHJf3WVsFQaMOvVm76qqYAZ1r1EkUHPfyA&usqp=CAU"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsPNOiBM_1xO0jv5SLq92K5M8zODG03aFHZQ&usqp=CAU"))
        list.add(Photo("https://www.bmwusa.com/content/dam/bmwusa/common/vehicles/2023/bmw-m/m-models/mobile/BMW-DDL-50YrsM_Models_Hero-Mobile.jpg"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwFubrcEXlXlzjbtKcEQH2cpWWvwCmSEpJiw&usqp=CAU"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZKS5K9HyKrfG6kkMJVYb0cvhUXylEsNizvfmoKSkQgPmhh27ZHpN6IHWD13tzfMvrAas&usqp=CAU"))
        list.add(Photo("https://wroom.ru/i/cars2/bmw_i7_1.jpg"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNKUgVUwQqXtFBD_2Q0WED420Pbd_EmAHzpQ&usqp=CAU"))
        list.add(Photo("https://cdn.kodixauto.ru/media/image/600680f9d655fc0001f18d4d"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvQkIsP66timStCjEk3ODLYeLhH4qNXw9zPfO-XqIGNSiTWN-dMSCGKhk8MjBM8IPebdQ&usqp=CAU"))
        list.add(Photo("https://cdn.kodixauto.ru/media/image/6261400ff6b7775ee1211639"))
        list.add(Photo("https://www.avtoavenu.ru/wp-content/uploads/bmw-3-2023-1.jpeg"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNLfdTenx3QgG_sPN1o9knrL8BZNXugtWdAA&usqp=CAU"))
        list.add(Photo("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPZRfleaOwB7wbC3R6F50SdscQo83HJiEkpA&usqp=CAU"))
        list.add(Photo("https://phonoteka.org/uploads/posts/2022-09/thumbs/1663845159_3-phonoteka-org-p-bmv-chernaya-oboi-instagram-3.jpg"))
    }

    companion object {
        const val MA_SA = "MA_SA"
    }
}