databaseChangeLog = {

    changeSet(author: "mridha (generated)", id: "1519404744885-1") {
        createTable(tableName: "clouds") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "cloudsPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "all", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-2") {
        createTable(tableName: "coordinates") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "coordinatesPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "lat", type: "FLOAT") {
                constraints(nullable: "false")
            }

            column(name: "lon", type: "FLOAT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-3") {
        createTable(tableName: "current_weather") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "current_weatherPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "base", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "city_id", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "city_name", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "clouds_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "cod", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "coordinates_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "dt", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "main_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "sys_id", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "visibility", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "wind_id", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-4") {
        createTable(tableName: "current_weather_weather") {
            column(name: "current_weather_weather_list_id", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "weather_id", type: "INT")

            column(name: "weather_list_idx", type: "INT")
        }
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-5") {
        createTable(tableName: "main") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "mainPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "humidity", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "pressure", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "temp", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "temp_max", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "temp_min", type: "INT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-6") {
        createTable(tableName: "sys") {
            column(autoIncrement: "true", name: "id", type: "INT") {
                constraints(primaryKey: "true", primaryKeyName: "sysPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "country", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "message", type: "FLOAT") {
                constraints(nullable: "false")
            }

            column(name: "sunrise", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "sunset", type: "INT") {
                constraints(nullable: "false")
            }

            column(name: "type", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-7") {
        createTable(tableName: "weather") {
            column(autoIncrement: "true", name: "id", type: "INT") {
                constraints(primaryKey: "true", primaryKeyName: "weatherPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "description", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "icon", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "main", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-8") {
        createTable(tableName: "wind") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "windPK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "deg", type: "FLOAT") {
                constraints(nullable: "false")
            }

            column(name: "speed", type: "FLOAT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-9") {
        addForeignKeyConstraint(baseColumnNames: "main_id", baseTableName: "current_weather", constraintName: "FK1ip5ookkryur3vk23ds9627aq", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "main")
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-10") {
        addForeignKeyConstraint(baseColumnNames: "wind_id", baseTableName: "current_weather", constraintName: "FK7esr9vn2efdtojqpcno3o50o1", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "wind")
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-11") {
        addForeignKeyConstraint(baseColumnNames: "sys_id", baseTableName: "current_weather", constraintName: "FKccfdsd2meprrg5270suub47gn", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "sys")
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-12") {
        addForeignKeyConstraint(baseColumnNames: "clouds_id", baseTableName: "current_weather", constraintName: "FKdxntfkbqvtx0n4lg8kmlky2sw", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "clouds")
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-13") {
        addForeignKeyConstraint(baseColumnNames: "weather_id", baseTableName: "current_weather_weather", constraintName: "FKjefki6la6jelyx6vy5ufe65hg", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "weather")
    }

    changeSet(author: "mridha (generated)", id: "1519404744885-14") {
        addForeignKeyConstraint(baseColumnNames: "coordinates_id", baseTableName: "current_weather", constraintName: "FKlvl3agfmlnxr7yvm70wknig7l", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "coordinates")
    }
}
