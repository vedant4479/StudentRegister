package com.example.studentregister.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface StudentDAO {
    @Insert
    suspend fun insertStudent(student: Student)
    @Update
    suspend fun updateStudent(student: Student)
    @Delete
    suspend fun deleteStudent(student: Student)

    @Query("SELECT * FROM student_data")
    fun getAllStudents():LiveData<List<Student>>
}