package com.example.visit_jeju_app.comment

data class Comment(
    val id: Long?,
    val comment: String,
    val userId: String,
    val itemType: String?, // itemType 추가
    val itemId: Long? // itemId 추가
)
