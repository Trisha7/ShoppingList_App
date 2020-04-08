package com.example.shoppinglist_app

import com.example.shoppinglist_app.models.ShopList

//class for filling in the recycler view with data
 class DataSource {
    companion object{

        fun createDataSet(): ArrayList<ShopList>
        {
            val list= ArrayList<ShopList>()
            list.add(
                ShopList(
                    item_name = "Grains and bread",
                    item_detail = "This could include grains,cereals e.t.c you need",
                    item_image = R.drawable.grains

                )
            )
            list.add(
                ShopList(
                    item_name = "Meat and Fish",
                    item_detail = "This could contain different ranges of meat produce consumed",
                    item_image = R.drawable.meat

                )
            )
            list.add(
                ShopList(
                    item_name = "Fruits and Vegetables",
                    item_detail = "This could contain the list of fresh produce you need.eg vegetables",
                    item_image = R.drawable.veg
                )
            )
            list.add(
                ShopList(
                    item_name = "Tubers and roots",
                    item_detail = "This could include items like yams,potatoes,cassava etc",
                    item_image =R.drawable.sweet_potato

                )
            )
            list.add(
                ShopList(
                    item_name = "Herbs and spices",
                    item_detail = "This could contain condiments needed",
                    item_image =R.drawable.salt_and_pepper
                )
            )
            list.add(
                ShopList(
                    item_name = "Beverages",
                    item_detail = "This could include the list of drinks and such  you need to get",
                    item_image = R.drawable.beverages
                )
            )
            list.add(
                ShopList(
                    item_name = "Locals and varieties",
                    item_detail = "This could contain those (local)items that do not really have a category",
                    item_image = R.drawable.mortar

                )
            )
            list.add(
                ShopList(
                    item_name = "Personal Care",
                    item_detail = "This could include items that are specific to your body",
                    item_image = R.drawable.personal_care

                )
            )
            list.add(
                ShopList(
                    item_name = "Utilities",
                    item_detail = "This could contain items/expenses that are needed for the running of the home ",
                    item_image = R.drawable.utilities
                )
            )
            return list
        }
    }

 }
