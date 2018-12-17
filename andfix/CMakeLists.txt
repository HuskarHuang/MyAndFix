cmake_minimum_required(VERSION 3.4.1)

#set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -std=gnu++11 -fpermissive -DDEBUG -O0")

add_library(
        andfix

        SHARED
        src/main/cpp/andfix.cpp
        src/main/cpp/art/art_method_replace.cpp
        src/main/cpp/art/art_method_replace_4_4.cpp
        src/main/cpp/art/art_method_replace_5_0.cpp
        src/main/cpp/art/art_method_replace_5_1.cpp
        src/main/cpp/art/art_method_replace_6_0.cpp
        src/main/cpp/art/art_method_replace_7_0.cpp
        src/main/cpp/dalvik/dalvik_method_replace.cpp
        )


find_library(
        log-lib

        log)


target_link_libraries(
        andfix

        ${log-lib})