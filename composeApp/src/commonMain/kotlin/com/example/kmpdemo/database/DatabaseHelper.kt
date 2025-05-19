package com.example.kmpdemo.database

class DatabaseHelper(driverFactory: DatabaseDriverFactory) {

    private val database: AppDatabase = AppDatabase(driverFactory.createDriver())
    private val demoQueries = database.demoTableQueries

    fun insert(id: Long, name: String, age: Int, description: String?) {
        demoQueries.insert(id, name, age.toLong(), description)
    }

    fun delete(id: Long) {
        demoQueries.delete(id)
    }

    fun update(id: Long, name: String, age: Int, description: String?) {
        demoQueries.update(name, age.toLong(), description, id)
    }

    fun clearAll() {
        demoQueries.clearAll()
    }

    fun getRecordById(id: Long): DemoTable? {
        return demoQueries.getRecordById(id).executeAsOneOrNull()
    }

    fun getRecordByName(name: String): List<DemoTable> {
        return demoQueries.getRecordByName(name).executeAsList()
    }
}