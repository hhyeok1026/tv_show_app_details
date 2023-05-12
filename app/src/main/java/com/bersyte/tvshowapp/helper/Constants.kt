package com.bersyte.tvshowapp.helper


// go to https://api.tvmaze.com
// https://api.tvmaze.com/shows
/*
TODO
뒤에 /를 붙이고 안붙이고에 따라 response가 다르던데 무슨 차이일까?
https://api.tvmaze.com/shows
https://api.tvmaze.com/shows/
*/

object Constants {
    const val BASE_URL = "https://api.tvmaze.com/"  // TODO base url맨뒤에 /를 붙이는게 맞나?
    const val END_POINT = "shows" // TODO end point가 슬래시 시작이 아니고 그냥 이렇게 하는게 맞나?
}