package `in`.paws

interface IPawsNetworkResponse<T> {
    fun sucessReponse(t:T)
    fun error(error: Throwable)
}