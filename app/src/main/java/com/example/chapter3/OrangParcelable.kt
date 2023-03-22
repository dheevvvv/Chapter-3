package com.example.chapter3

import android.os.Parcel
import android.os.Parcelable

data class OrangParcelable(val nama:String?, val umur:Int?):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        if (umur != null) {
            parcel.writeInt(umur)
        }
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<OrangParcelable> {
        override fun createFromParcel(parcel: Parcel): OrangParcelable {
            return OrangParcelable(parcel)
        }

        override fun newArray(size: Int): Array<OrangParcelable?> {
            return arrayOfNulls(size)
        }
    }
}