package com.cocot3ro.gh.almacen.data.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AlmacenItemModel(
    val id: Long = 0L,
    val barcodes: LongArray,
    val name: String,
    val supplier: String?,
    val image: String?,
    val quantity: Int,
    @SerialName("pack_size")
    val packSize: Int,
    val minimum: Int?
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AlmacenItemModel

        if (id != other.id) return false
        if (quantity != other.quantity) return false
        if (packSize != other.packSize) return false
        if (minimum != other.minimum) return false
        if (!barcodes.contentEquals(other.barcodes)) return false
        if (name != other.name) return false
        if (supplier != other.supplier) return false
        if (image != other.image) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + quantity
        result = 31 * result + packSize
        result = 31 * result + (minimum ?: 0)
        result = 31 * result + barcodes.contentHashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + (supplier?.hashCode() ?: 0)
        result = 31 * result + (image?.hashCode() ?: 0)
        return result
    }

}