package com.example.visit_jeju_app.tour.model

import com.google.gson.annotations.SerializedName

//{
//    o1 "tourId": 1,
//    11 "itemsAllTag": "애견미용실,반려동물,반려동물동반입장,혼저옵서개,반려동물공간_기타,공용주차장,화장실,무료 WIFI,유도 및 안내시설",
//    "itemsContentsid": "CNTS_300000000012715",
//    "itemsContentsCdValue": "c1",
//    o3 "itemsContentsCdLabel": "관광지",
//    "itemsContentsCdRefId": "contentscd>c1",
//    o2 "itemsTitle": "몽story",
//    "itemsRegion1CdValue": "region1",
//    o4 "itemsRegion1CdLabel": "제주시",
//    "itemsRegion1CdRefId": "region>region1",
//    o6 "itemsRegion2CdValue": 12,
//    o5 "itemsRegion2CdLabel": "애월",
//    "itemsRegion2CdRefId": "region1>12",
//    o7 "itemsAddress": "제주특별자치도 제주시 애월읍 하귀1리 157-6",
//    o8 "itemsRoadAddress": "제주특별자치도 제주시 애월읍 하귀9길 34",
//    "itemsTag": "애견미용실,반려동물,반려동물동반입장,혼저옵서개,반려동물공간_기타",
//    12 "itemsIntroduction": "몽story는 반려동물에게 최고의 서비스를 제공하는 장소다.",
//    o9 "itemsLatitude": 33.4840605,
//    10 "itemsLongitude": 126.4160275,
//    "itemsPostcode": null,
//    13 "itemsPhoneNo": "0507-1483-9982",
//    "itemsRepPhotoDescSeo": "몽story",
//    "itemsRepPhotoPhotoidPhotoid": 2020000000000,
//    14 "itemsRepPhotoPhotoidImgPath": "https://api.cdn.visitjeju.net/photomng/imgpath/202308/23/a42944ba-7801-41bc-bb67-6b48d7edd545.JPG",
//    15 "itemsRepPhotoPhotoidThumbnailPath": "https://api.cdn.visitjeju.net/photomng/thumbnailpath/202308/23/5ee3332e-148e-4f67-a2cb-de6754bd32b2.JPG"
//},
data class TourModel(
    // o1 "tourId": 1,
    @SerializedName("tourId")
    var tourId : String,

    // o2 "itemsTitle": "몽story",
    @SerializedName("itemsTitle")
    var itemsTitle : String,

    // o3 "itemsContentsCdLabel": "관광지",
    @SerializedName("itemsContentsCdLabel")
    var itemsContentsCdLabel : String,

    // o4 "itemsRegion1CdLabel": "제주시",
    @SerializedName("itemsRegion1CdLabel")
    var itemsRegion1CdLabel : String,

    // o5 "itemsRegion2CdLabel": "애월",
    @SerializedName("itemsRegion2CdLabel")
    var itemsRegion2CdLabel : String,

    // o6 "itemsRegion2CdValue": 12,
    @SerializedName("itemsRegion2CdValue")
    var itemsRegion2CdValue : String,

    // o7 "itemsAddress": "제주특별자치도 제주시 애월읍 하귀1리 157-6",
    @SerializedName("itemsAddress")
    var itemsAddress : String,

    // o8 "itemsRoadAddress": "제주특별자치도 제주시 애월읍 하귀9길 34",
    @SerializedName("itemsRoadAddress")
    var itemsRoadAddress : String,

    // o9 "itemsLatitude": 33.4840605,
    @SerializedName("itemsLatitude")
    var itemsLatitude : Double,

    // 10 "itemsLongitude": 126.4160275,
    @SerializedName("itemsLongitude")
    var itemsLongitude : Double,

    // 11 "itemsAllTag": "애견미용실,반려동물,반려동물동반입장,혼저옵서개,반려동물공간_기타,공용주차장,화장실,무료 WIFI,유도 및 안내시설",
    @SerializedName("itemsAllTag")
    var itemsAllTag : String,

    // 12 "itemsIntroduction": "몽story는 반려동물에게 최고의 서비스를 제공하는 장소다.",
    @SerializedName("itemsIntroduction")
    var itemsIntroduction : String,

    // 13 "itemsPhoneNo": "0507-1483-9982",
    @SerializedName("itemsPhoneNo")
    var itemsPhoneNo : String,


    // 14 "itemsRepPhotoPhotoidImgPath": "https://api.cdn.visitjeju.net/photomng"
    @SerializedName("itemsRepPhotoPhotoidImgPath")
    var itemsRepPhotoPhotoidImgPath : String,

    // 15 "itemsRepPhotoPhotoidThumbnailPath": "https://api.cdn.visitjeju.net/photomng"
    @SerializedName("itemsRepPhotoPhotoidThumbnailPath")
    var itemsRepPhotoPhotoidThumbnailPath : String,


)
