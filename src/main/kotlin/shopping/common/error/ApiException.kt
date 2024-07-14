package shopping.common.error

open class ApiException(
    val errorCode: ErrorCode,
    override val message: String,
    val data: Any? = null,
) : RuntimeException()