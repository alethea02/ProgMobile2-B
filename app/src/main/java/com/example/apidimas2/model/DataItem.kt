package com.example.apidimas2.model

import com.google.gson.annotations.SerializedName

data class DataItem(
        @SerializedName("gambar")
        val gambar: String? = null,

        @SerializedName("nama_depan")
        val namaDepan: String? = null,

        @SerializedName("nama_belakang")
        val namaBelakang: String? = null,

        @SerializedName("email")
        val email: String? = null,

        @SerializedName("alamat")
        val alamat: String? = null,

        @SerializedName("jumlah_iuran")
        val jumlahIuran: Int? = null,

        @SerializedName("iuran_individu")
        val iuranIndividu: Int? = null,

        @SerializedName("total_iuran")
        val totalIuran: Int? = null
)
