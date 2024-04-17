package Bottom_navigation

import com.example.contacts.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String) {
    object Screen1 : BottomItem("Избранное", R.drawable.star, "screen_1")
    object Screen2 : BottomItem("Недавние", R.drawable.time, "screen_2")
    object Screen3 : BottomItem("Контакты", R.drawable.user, "screen_3")

}