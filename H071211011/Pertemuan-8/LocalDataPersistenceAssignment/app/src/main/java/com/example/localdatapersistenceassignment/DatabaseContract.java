package com.example.localdatapersistenceassignment;

import android.provider.BaseColumns;

public class DatabaseContract {

    public static String TABLE_NAME = "note";
    public static final class NoteColumns implements BaseColumns {
        public static String TITLE = "title";
        public static String DESCRIPTION = "description";
        public static String TIME = "time";
        public static String IS_EDITED = "is_edited";


    }
}
