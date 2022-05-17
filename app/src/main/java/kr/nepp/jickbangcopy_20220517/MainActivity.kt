package kr.nepp.jickbangcopy_20220517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.nepp.jickbangcopy_20220517.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(  RoomData( 8000, "서울시 종로구", 3, "1번째 방입니다." )  )
        mRoomList.add(  RoomData( 28500, "서울시 중구", -1, "2번째 방입니다." )  )
        mRoomList.add(  RoomData( 137000, "서울시 동대문구", 0, "3번째 방입니다." )  )
        mRoomList.add(  RoomData( 78000, "서울시 서대문구", 7, "4번째 방입니다." )  )
        mRoomList.add(  RoomData( 3000, "서울시 중랑구", 12, "5번째 방입니다." )  )
        mRoomList.add(  RoomData( 256000, "서울시 은평구", -2, "6번째 방입니다." )  )
        mRoomList.add(  RoomData( 12400, "서울시 동작구", 0, "7번째 방입니다." )  )
        mRoomList.add(  RoomData( 56000, "서울시 관악구", 7, "8번째 방입니다." )  )
    }
}