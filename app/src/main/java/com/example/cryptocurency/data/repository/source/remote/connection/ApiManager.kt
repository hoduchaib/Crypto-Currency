package com.example.cryptocurency.data.repository.source.remote.connection

object ApiManager {
    private const val BASE_URL = "https://api.coinranking.com/v2"
    private const val COINS_PATH = "/coins"
    private const val DETAIL_COIN_PATH = "/coin/"
    private const val SEARCH_PATH = "/search-suggestions"
    private const val PARAM_REQUEST = "?"
    private const val PARAM_SEPARATOR = "&"
    private const val SCOPE_ID_PARAM = "scopeId="
    private const val SCOPE_LIMIT_PARAM = "scopeLimit="
    private const val SEARCH_PARAM = "search="
    private const val LIMIT_PARAM = "limit="

    fun getCoinsUrl(): String =
        BASE_URL + COINS_PATH

    fun getCoinsWithScopeUrl(limit: Int, id: String): String =
        BASE_URL + COINS_PATH + PARAM_REQUEST + SCOPE_LIMIT_PARAM + limit.toString() + PARAM_SEPARATOR + SCOPE_ID_PARAM + id

    fun getCoinDetailUrl(id: String): String =
        BASE_URL + DETAIL_COIN_PATH + id

    fun getSearchUrl(query: String): String =
        BASE_URL + COINS_PATH + PARAM_REQUEST + SEARCH_PARAM + query

    fun getSearchWithLimitUrl(query: String, limit: Int): String =
        BASE_URL + COINS_PATH + PARAM_REQUEST + SEARCH_PARAM + query + PARAM_SEPARATOR + LIMIT_PARAM + limit.toString()
}