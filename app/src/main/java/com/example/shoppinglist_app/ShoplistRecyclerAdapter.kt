package com.example.shoppinglist_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppinglist_app.models.ShopList
import kotlinx.android.synthetic.main.layout_shoplist_item.view.*

class ShoplistRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){


    private var items: List<ShopList> = ArrayList()
    /*private val callback:onShopItemClickListener*/
    //This are all the required methods for a recyclerview adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ShopListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_shoplist_item,parent,false)
        )
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ShopListViewHolder ->{
                holder.bind(items.get(position))
                
            }
        }

    }

    override fun getItemCount(): Int {
                    return items.size
    }
    fun submitList(shopItems:List<ShopList>){
        items=shopItems
    }

    class ShopListViewHolder constructor(itemView: View): RecyclerView.ViewHolder(itemView)
        {
            val shopItem_image =itemView.item_imageView
            val shopItem_name= itemView.item_name_text
            val shopItem_detail= itemView.item_detail_text
//setter
            fun bind(shopList:ShopList){
                shopItem_image.setImageResource(shopList.item_image)
                shopItem_name.setText(shopList.item_name)
                shopItem_detail.setText(shopList.item_detail)

            }
            /*fun initialize(item: DataSource,action:onShopItemClickListener){
                shopItem_name=
            }*/
    }


}
interface onShopItemClickListener{

    fun onShopItemClick(item : DataSource, position: Int)
}