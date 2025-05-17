package com.example.kmpdemo.database

import app.cash.sqldelight.db.SqlDriver

class DatabaseHelper(driverFactory: DatabaseDriverFactory) {
    private val database: AppDatabase
    private val driver: SqlDriver

    init {
        driver = driverFactory.createDriver()
        database = AppDatabase(driver)
    }

    fun getAllTData(): List<T_data> {
        return database.appDatabaseQueries.getAllTData()
            .executeAsList()
    }

    suspend fun insertTData(
        local_name: String,
        path: String,
        disk: String,
        alpha_beta: String
    ) {
        database.appDatabaseQueries.insertTData(
            local_name = local_name,
            display_name = local_name,
            key1 = null,
            key2 = null,
            key3 = null,
            produce = null,
            star = null,
            review = null,
            like = null,
            dislike = null,
            characters = null,
            date_added = null,
            year_added = null,
            date_updated = null,
            date_produced = null,
            year_produced = null,
            month_produced = null,
            time_stamp_added = null,
            time_stamp_updated = null,
            time_stamp_produced = null,
            series = null,
            season = null,
            continent = null,
            area = null,
            country = null,
            city = null,
            poi = null,
            director = null,
            languages = null,
            last_play = null,
            camera = null,
            duration = null,
            resolution = null,
            resolution_type = null,
            parent_folder1 = null,
            parent_folder2 = null,
            parent_folder3 = null,
            path = path,
            disk = disk,
            cover_src = null,
            size = null,
            format = null,
            alpha_beta = alpha_beta,
            video_cnt = null,
            image_cnt = null,
            subtitle = null,
            labels = null,
            buffer_path = null,
            wishlist = null,
            watched = null,
            deleted = null,
            date_import = null,
            import_id = null,
            type = null,
            subtype = null,
            episode = null
        )
    }

    suspend fun deleteTDataById(id: Long) {
        database.appDatabaseQueries.deleteTDataById(id)
    }
}
