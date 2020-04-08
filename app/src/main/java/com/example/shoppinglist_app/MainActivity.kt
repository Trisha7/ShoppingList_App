package com.example.shoppinglist_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), onShopItemClickListener  {
    private lateinit var shopListAdapter :ShoplistRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSet()
    }
    private fun addDataSet(){
        val data= DataSource.createDataSet()
        shopListAdapter.submitList(data)
    }
    private fun initRecyclerView(){
        //the "apply" object enables the layout manager to stop referencing the recylerview ID everytime it is called,
        // it just knows it's being referred to,thereby doing the work easier if there were a bunch
        recycler_view.apply {
            layoutManager =LinearLayoutManager(this@MainActivity)
            val spacingDecoration = itemSpacingDecoration(60)
            addItemDecoration(spacingDecoration)
            shopListAdapter= ShoplistRecyclerAdapter()
            adapter=shopListAdapter
        }
    }

    override fun onShopItemClick(item: DataSource, position: Int) {

    }
}


